package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.EmailResponse;
import org.openapitools.client.model.ProblemDetails;

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
public class EmailApi {
    private ApiClient apiClient;

    public EmailApi() {
        this(new ApiClient());
    }

    public EmailApi(ApiClient apiClient) {
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
     * @param emailAddress The emailAddress parameter
     * @param message The message parameter
     * @return EmailResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec emailPostRequestCreation(@jakarta.annotation.Nullable String emailAddress, @jakarta.annotation.Nullable String message) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "emailAddress", emailAddress));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "message", message));

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<EmailResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Email", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param emailAddress The emailAddress parameter
     * @param message The message parameter
     * @return EmailResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public EmailResponse emailPost(@jakarta.annotation.Nullable String emailAddress, @jakarta.annotation.Nullable String message) throws RestClientResponseException {
        ParameterizedTypeReference<EmailResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return emailPostRequestCreation(emailAddress, message).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param emailAddress The emailAddress parameter
     * @param message The message parameter
     * @return ResponseEntity&lt;EmailResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EmailResponse> emailPostWithHttpInfo(@jakarta.annotation.Nullable String emailAddress, @jakarta.annotation.Nullable String message) throws RestClientResponseException {
        ParameterizedTypeReference<EmailResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return emailPostRequestCreation(emailAddress, message).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param emailAddress The emailAddress parameter
     * @param message The message parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec emailPostWithResponseSpec(@jakarta.annotation.Nullable String emailAddress, @jakarta.annotation.Nullable String message) throws RestClientResponseException {
        return emailPostRequestCreation(emailAddress, message);
    }
}
