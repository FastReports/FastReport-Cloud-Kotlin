# ApiKeysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiKeysCreateApiKey**](ApiKeysApi.md#apiKeysCreateApiKey) | **POST** /api/manage/v1/ApiKeys | Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
[**apiKeysDeleteApiKey**](ApiKeysApi.md#apiKeysDeleteApiKey) | **DELETE** /api/manage/v1/ApiKeys | Delete an apikey
[**apiKeysGetApiKeys**](ApiKeysApi.md#apiKeysGetApiKeys) | **GET** /api/manage/v1/ApiKeys | Returns list with all apikeys of current user


<a id="apiKeysCreateApiKey"></a>
# **apiKeysCreateApiKey**
> ApiKeyVM apiKeysCreateApiKey(createApiKeyVM)

Create a new apikey, 5 apikeys for user. Hardcoded for ddos.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ApiKeysApi()
val createApiKeyVM : CreateApiKeyVM =  // CreateApiKeyVM | 
try {
    val result : ApiKeyVM = apiInstance.apiKeysCreateApiKey(createApiKeyVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#apiKeysCreateApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#apiKeysCreateApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createApiKeyVM** | [**CreateApiKeyVM**](CreateApiKeyVM.md)|  |

### Return type

[**ApiKeyVM**](ApiKeyVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiKeysDeleteApiKey"></a>
# **apiKeysDeleteApiKey**
> ApiKeyVM apiKeysDeleteApiKey(deleteApiKeyVM)

Delete an apikey

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ApiKeysApi()
val deleteApiKeyVM : DeleteApiKeyVM =  // DeleteApiKeyVM | 
try {
    val result : ApiKeyVM = apiInstance.apiKeysDeleteApiKey(deleteApiKeyVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#apiKeysDeleteApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#apiKeysDeleteApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteApiKeyVM** | [**DeleteApiKeyVM**](DeleteApiKeyVM.md)|  |

### Return type

[**ApiKeyVM**](ApiKeyVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiKeysGetApiKeys"></a>
# **apiKeysGetApiKeys**
> ApiKeysVM apiKeysGetApiKeys()

Returns list with all apikeys of current user

Always work, it should make only 200 response (except if user is not authorized).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ApiKeysApi()
try {
    val result : ApiKeysVM = apiInstance.apiKeysGetApiKeys()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#apiKeysGetApiKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#apiKeysGetApiKeys")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiKeysVM**](ApiKeysVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

