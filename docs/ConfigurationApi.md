# ConfigurationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configurationGet**](ConfigurationApi.md#configurationGet) | **GET** /api/v1/Configuration | returns information about server configuration


<a id="configurationGet"></a>
# **configurationGet**
> ServerConfigurationVM configurationGet()

returns information about server configuration

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ConfigurationApi()
try {
    val result : ServerConfigurationVM = apiInstance.configurationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationApi#configurationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationApi#configurationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerConfigurationVM**](ServerConfigurationVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

