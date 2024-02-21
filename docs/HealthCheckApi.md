# HealthCheckApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCheckDataGet**](HealthCheckApi.md#healthCheckDataGet) | **GET** /api/backend/v1/HealthCheck | healthcheck


<a id="healthCheckDataGet"></a>
# **healthCheckDataGet**
> healthCheckDataGet()

healthcheck

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = HealthCheckApi()
try {
    apiInstance.healthCheckDataGet()
} catch (e: ClientException) {
    println("4xx response calling HealthCheckApi#healthCheckDataGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthCheckApi#healthCheckDataGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

