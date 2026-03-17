package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ProblemDetails;
import org.openapitools.client.model.ResultsResponse;

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
public class ResultadosApi {
    private ApiClient apiClient;

    public ResultadosApi() {
        this(new ApiClient());
    }

    public ResultadosApi(ApiClient apiClient) {
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
     * @return ResultsResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resultadosPostRequestCreation(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
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

        ParameterizedTypeReference<ResultsResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Resultados", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return ResultsResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResultsResponse resultadosPost(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        ParameterizedTypeReference<ResultsResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return resultadosPostRequestCreation(nombreUsuario, tok).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param nombreUsuario The nombreUsuario parameter
     * @param tok The tok parameter
     * @return ResponseEntity&lt;ResultsResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultsResponse> resultadosPostWithHttpInfo(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        ParameterizedTypeReference<ResultsResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return resultadosPostRequestCreation(nombreUsuario, tok).toEntity(localVarReturnType);
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
    public ResponseSpec resultadosPostWithResponseSpec(@jakarta.annotation.Nullable String nombreUsuario, @jakarta.annotation.Nullable Integer tok) throws RestClientResponseException {
        return resultadosPostRequestCreation(nombreUsuario, tok);
    }
}
