package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ProblemDetails;
import org.openapitools.client.model.Solicitud;
import org.openapitools.client.model.SolicitudResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-03-11T19:13:26.441918+01:00[Europe/Madrid]", comments = "Generator version: 7.20.0")
public class SolicitudApi {
    private ApiClient apiClient;

    public SolicitudApi() {
        this(new ApiClient());
    }

    public SolicitudApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return List&lt;Integer&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec solicitudComprobarSolicitudGetRequestCreation(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nombreUsuario", nombreUsuario));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tok", tok));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Integer>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Solicitud/ComprobarSolicitud", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return List&lt;Integer&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Integer> solicitudComprobarSolicitudGet(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        ParameterizedTypeReference<List<Integer>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return solicitudComprobarSolicitudGetRequestCreation(nombreUsuario, tok).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return ResponseEntity&lt;List&lt;Integer&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Integer>> solicitudComprobarSolicitudGetWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        ParameterizedTypeReference<List<Integer>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return solicitudComprobarSolicitudGetRequestCreation(nombreUsuario, tok).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec solicitudComprobarSolicitudGetWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        return solicitudComprobarSolicitudGetRequestCreation(nombreUsuario, tok);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return List&lt;Integer&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec solicitudGetSolicitudesUsuarioGetRequestCreation(@jakarta.annotation.Nullable String nombreUsuario) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nombreUsuario", nombreUsuario));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Integer>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Solicitud/GetSolicitudesUsuario", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return List&lt;Integer&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Integer> solicitudGetSolicitudesUsuarioGet(@jakarta.annotation.Nullable String nombreUsuario) throws RestClientResponseException {
        ParameterizedTypeReference<List<Integer>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return solicitudGetSolicitudesUsuarioGetRequestCreation(nombreUsuario).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return ResponseEntity&lt;List&lt;Integer&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Integer>> solicitudGetSolicitudesUsuarioGetWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario) throws RestClientResponseException {
        ParameterizedTypeReference<List<Integer>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return solicitudGetSolicitudesUsuarioGetRequestCreation(nombreUsuario).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec solicitudGetSolicitudesUsuarioGetWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario) throws RestClientResponseException {
        return solicitudGetSolicitudesUsuarioGetRequestCreation(nombreUsuario);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return SolicitudResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec solicitudSolicitarPostRequestCreation(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws RestClientResponseException {
        Object postBody = solicitud;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nombreUsuario", nombreUsuario));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SolicitudResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Solicitud/Solicitar", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return SolicitudResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SolicitudResponse solicitudSolicitarPost(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws RestClientResponseException {
        ParameterizedTypeReference<SolicitudResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return solicitudSolicitarPostRequestCreation(nombreUsuario, solicitud).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return ResponseEntity&lt;SolicitudResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SolicitudResponse> solicitudSolicitarPostWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws RestClientResponseException {
        ParameterizedTypeReference<SolicitudResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return solicitudSolicitarPostRequestCreation(nombreUsuario, solicitud).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param solicitud The solicitud parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec solicitudSolicitarPostWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Solicitud solicitud) throws RestClientResponseException {
        return solicitudSolicitarPostRequestCreation(nombreUsuario, solicitud);
    }
}
