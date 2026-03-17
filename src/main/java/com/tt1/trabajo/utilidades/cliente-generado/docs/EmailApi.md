# EmailApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**emailPost**](EmailApi.md#emailPost) | **POST** /Email |  |



## emailPost

> EmailResponse emailPost(emailAddress, message)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        EmailApi apiInstance = new EmailApi(defaultClient);
        String emailAddress = "emailAddress_example"; // String | 
        String message = "message_example"; // String | 
        try {
            EmailResponse result = apiInstance.emailPost(emailAddress, message);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailApi#emailPost");
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
| **emailAddress** | **String**|  | [optional] |
| **message** | **String**|  | [optional] |

### Return type

[**EmailResponse**](EmailResponse.md)

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

