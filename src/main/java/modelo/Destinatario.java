package modelo;

public class Destinatario {
    private String nombre;
    private String email;

    public Destinatario(String nombre, String email) {
        this.setNombre(nombre);
        this.setEmail(email);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}