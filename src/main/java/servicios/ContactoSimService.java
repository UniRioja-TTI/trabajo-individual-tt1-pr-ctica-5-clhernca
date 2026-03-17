package servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import modelo.Punto;

@Service
public class ContactoSimService implements InterfazContactoSim {

    private List<Entidad> entidades = new ArrayList<>();
    private List<DatosSolicitud> solicitudes = new ArrayList<>();

    public ContactoSimService() {
        rellenarEntidades();
    }

    private void rellenarEntidades() {
        Entidad e1 = new Entidad();
        e1.setId(1); e1.setName("Servidor Web");
        e1.setDescripcion("Nodo principal de servicio HTTP");

        Entidad e2 = new Entidad();
        e2.setId(2); e2.setName("Router Central");
        e2.setDescripcion("Nodo de enrutamiento principal de la red");

        Entidad e3 = new Entidad();
        e3.setId(3); e3.setName("Firewall");
        e3.setDescripcion("Nodo de seguridad y filtrado de tráfico");

        Entidad e4 = new Entidad();
        e4.setId(4); e4.setName("Servidor de Base de Datos");
        e4.setDescripcion("Nodo de almacenamiento y consulta de datos");

        Entidad e5 = new Entidad();
        e5.setId(5); e5.setName("Balanceador de Carga");
        e5.setDescripcion("Nodo distribuidor de tráfico entre servidores");

        entidades.add(e1); entidades.add(e2); entidades.add(e3);
        entidades.add(e4); entidades.add(e5);
    }

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        solicitudes.add(sol);
        try {
            org.openapitools.client.ApiClient apiClient = new org.openapitools.client.ApiClient();
            apiClient.setBasePath("http://localhost:8080");

            org.openapitools.client.api.SolicitudApi solicitudApi =
                new org.openapitools.client.api.SolicitudApi(apiClient);
            org.openapitools.client.model.Solicitud solicitud =
                new org.openapitools.client.model.Solicitud();

            List<String> nombres = new ArrayList<>();
            List<Integer> cantidades = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : sol.getNums().entrySet()) {
                entidades.stream()
                        .filter(e -> e.getId() == entry.getKey())
                        .findFirst()
                        .ifPresent(e -> nombres.add(e.getName()));
                cantidades.add(entry.getValue());
            }

            solicitud.setNombreEntidades(nombres);
            solicitud.setCantidadesIniciales(cantidades);

            org.openapitools.client.model.SolicitudResponse response =
                solicitudApi.solicitudSolicitarPost("usuario", solicitud);

            return response.getTokenSolicitud();

        } catch (Exception e) {
            return new Random().nextInt(10000);
        }
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        try {
            org.openapitools.client.ApiClient apiClient = new org.openapitools.client.ApiClient();
            apiClient.setBasePath("http://localhost:8080");

            org.openapitools.client.api.ResultadosApi resultadosApi =
                new org.openapitools.client.api.ResultadosApi(apiClient);

            org.openapitools.client.model.ResultsResponse response =
                resultadosApi.resultadosPost("usuario", ticket);

            String data = response.getData();
            return parsearDatos(data);

        } catch (Exception e) {
            return new DatosSimulation();
        }
    }

    private DatosSimulation parsearDatos(String data) {
        DatosSimulation ds = new DatosSimulation();
        if (data == null || data.isEmpty()) return ds;

        String[] lineas = data.split("\n");
        int ancho = Integer.parseInt(lineas[0].trim());
        ds.setAnchoTablero(ancho);

        Map<Integer, List<Punto>> puntos = new HashMap<>();
        int maxTiempo = 0;

        for (int i = 1; i < lineas.length; i++) {
            String linea = lineas[i].trim();
            if (linea.isEmpty()) continue;
            String[] partes = linea.split(",");
            if (partes.length == 4) {
                int tiempo = Integer.parseInt(partes[0].trim());
                int y = Integer.parseInt(partes[1].trim());
                int x = Integer.parseInt(partes[2].trim());
                String color = partes[3].trim();

                Punto p = new Punto();
                p.setX(x); p.setY(y); p.setColor(color);

                puntos.computeIfAbsent(tiempo, k -> new ArrayList<>()).add(p);
                if (tiempo > maxTiempo) maxTiempo = tiempo;
            }
        }

        // Asegurarse de que todos los tiempos tienen una lista
        for (int t = 0; t <= maxTiempo; t++) {
            puntos.putIfAbsent(t, new ArrayList<>());
        }

        ds.setPuntos(puntos);
        ds.setMaxSegundos(maxTiempo + 1);
        return ds;
    }
   

    @Override
    public List<Entidad> getEntities() {
        return entidades;
    }

    @Override
    public boolean isValidEntityId(int id) {
        return entidades.stream().anyMatch(e -> e.getId() == id);
    }
}