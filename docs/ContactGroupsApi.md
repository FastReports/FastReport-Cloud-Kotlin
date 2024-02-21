# ContactGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactGroupsCreate**](ContactGroupsApi.md#contactGroupsCreate) | **POST** /api/v1/ContactGroups/group | Creates contact group
[**contactGroupsDelete**](ContactGroupsApi.md#contactGroupsDelete) | **DELETE** /api/v1/ContactGroups/{id} | Removes contact by id
[**contactGroupsGet**](ContactGroupsApi.md#contactGroupsGet) | **GET** /api/v1/ContactGroups/{id} | Returns contact group by id
[**contactGroupsGetList**](ContactGroupsApi.md#contactGroupsGetList) | **GET** /api/v1/ContactGroups/subscription/{subscriptionId}/groups | Returns contact groups by subscriptionId
[**contactGroupsUpdate**](ContactGroupsApi.md#contactGroupsUpdate) | **PUT** /api/v1/ContactGroups/{id} | Updates contact group by id


<a id="contactGroupsCreate"></a>
# **contactGroupsCreate**
> ContactGroupVM contactGroupsCreate(createContactGroupVM)

Creates contact group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactGroupsApi()
val createContactGroupVM : CreateContactGroupVM =  // CreateContactGroupVM | 
try {
    val result : ContactGroupVM = apiInstance.contactGroupsCreate(createContactGroupVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#contactGroupsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#contactGroupsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContactGroupVM** | [**CreateContactGroupVM**](CreateContactGroupVM.md)|  | [optional]

### Return type

[**ContactGroupVM**](ContactGroupVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="contactGroupsDelete"></a>
# **contactGroupsDelete**
> contactGroupsDelete(id)

Removes contact by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactGroupsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.contactGroupsDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#contactGroupsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#contactGroupsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

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
 - **Accept**: application/json

<a id="contactGroupsGet"></a>
# **contactGroupsGet**
> ContactGroupVM contactGroupsGet(id)

Returns contact group by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactGroupsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ContactGroupVM = apiInstance.contactGroupsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#contactGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#contactGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**ContactGroupVM**](ContactGroupVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="contactGroupsGetList"></a>
# **contactGroupsGetList**
> ContactGroupsVM contactGroupsGetList(subscriptionId, skip, take)

Returns contact groups by subscriptionId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactGroupsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ContactGroupsVM = apiInstance.contactGroupsGetList(subscriptionId, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#contactGroupsGetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#contactGroupsGetList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**|  |
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **take** | **kotlin.Int**|  | [optional] [default to 10]

### Return type

[**ContactGroupsVM**](ContactGroupsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="contactGroupsUpdate"></a>
# **contactGroupsUpdate**
> ContactGroupVM contactGroupsUpdate(id, updateContactGroupVM)

Updates contact group by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactGroupsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateContactGroupVM : UpdateContactGroupVM =  // UpdateContactGroupVM | 
try {
    val result : ContactGroupVM = apiInstance.contactGroupsUpdate(id, updateContactGroupVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#contactGroupsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#contactGroupsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateContactGroupVM** | [**UpdateContactGroupVM**](UpdateContactGroupVM.md)|  | [optional]

### Return type

[**ContactGroupVM**](ContactGroupVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

