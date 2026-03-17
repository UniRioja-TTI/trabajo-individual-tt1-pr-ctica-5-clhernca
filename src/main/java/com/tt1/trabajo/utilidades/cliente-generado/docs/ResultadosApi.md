# ResultadosApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resultadosPost**](ResultadosApi.md#resultadosPost) | **POST** /Resultados |  |



## resultadosPost

> ResultsResponse resultadosPost(nombreUsuario, tok)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResultadosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ResultadosApi apiInstance = new ResultadosApi(defaultClient);
        String nombreUsuario = "nombreUsuario_example"; // String | 
        Integer tok = 56; // Integer | 
        try {
            ResultsResponse result = apiInstance.resultadosPost(nombreUsuario, tok);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResultadosApi#resultadosPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nombreUsuario** | **String**|  | [optional] |
| **tok** | **Integer**|  | [optional] |

### Return type

[**ResultsResponse**](ResultsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

