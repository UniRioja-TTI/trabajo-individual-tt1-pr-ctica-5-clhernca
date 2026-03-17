# SolicitudApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**solicitudComprobarSolicitudGet**](SolicitudApi.md#solicitudComprobarSolicitudGet) | **GET** /Solicitud/ComprobarSolicitud |  |
| [**solicitudGetSolicitudesUsuarioGet**](SolicitudApi.md#solicitudGetSolicitudesUsuarioGet) | **GET** /Solicitud/GetSolicitudesUsuario |  |
| [**solicitudSolicitarPost**](SolicitudApi.md#solicitudSolicitarPost) | **POST** /Solicitud/Solicitar |  |



## solicitudComprobarSolicitudGet

> List&lt;Integer&gt; solicitudComprobarSolicitudGet(nombreUsuario, tok)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolicitudApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SolicitudApi apiInstance = new SolicitudApi(defaultClient);
        String nombreUsuario = "nombreUsuario_example"; // String | 
        Integer tok = 56; // Integer | 
        try {
            List<Integer> result = apiInstance.solicitudComprobarSolicitudGet(nombreUsuario, tok);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SolicitudApi#solicitudComprobarSolicitudGet");
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

**List&lt;Integer&gt;**

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


## solicitudGetSolicitudesUsuarioGet

> List&lt;Integer&gt; solicitudGetSolicitudesUsuarioGet(nombreUsuario)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolicitudApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SolicitudApi apiInstance = new SolicitudApi(defaultClient);
        String nombreUsuario = "nombreUsuario_example"; // String | 
        try {
            List<Integer> result = apiInstance.solicitudGetSolicitudesUsuarioGet(nombreUsuario);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SolicitudApi#solicitudGetSolicitudesUsuarioGet");
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

### Return type

**List&lt;Integer&gt;**

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


## solicitudSolicitarPost

> SolicitudResponse solicitudSolicitarPost(nombreUsuario, solicitud)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SolicitudApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SolicitudApi apiInstance = new SolicitudApi(defaultClient);
        String nombreUsuario = "nombreUsuario_example"; // String | 
        Solicitud solicitud = new Solicitud(); // Solicitud | 
        try {
            SolicitudResponse result = apiInstance.solicitudSolicitarPost(nombreUsuario, solicitud);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SolicitudApi#solicitudSolicitarPost");
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
| **solicitud** | [**Solicitud**](Solicitud.md)|  | [optional] |

### Return type

[**SolicitudResponse**](SolicitudResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

