# ContactsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contactsCreate**](ContactsApi.md#contactsCreate) | **POST** /api/v1/Contacts/contact | Creates new contact
[**contactsDelete**](ContactsApi.md#contactsDelete) | **DELETE** /api/v1/Contacts/{id} | Removes contact by id
[**contactsGet**](ContactsApi.md#contactsGet) | **GET** /api/v1/Contacts/{id} | Returns contact group by id
[**contactsGetByGroup**](ContactsApi.md#contactsGetByGroup) | **GET** /api/v1/Contacts/group/{groupId}/contacts | Returns contacts by group id
[**contactsGetList**](ContactsApi.md#contactsGetList) | **GET** /api/v1/Contacts/subscription/{subscriptionId}/contacts | Allows to search for contacts
[**contactsUpdate**](ContactsApi.md#contactsUpdate) | **PUT** /api/v1/Contacts/{id} | Updates contact by id


<a id="contactsCreate"></a>
# **contactsCreate**
> ContactVM contactsCreate(createContactVM)

Creates new contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactsApi()
val createContactVM : CreateContactVM =  // CreateContactVM | 
try {
    val result : ContactVM = apiInstance.contactsCreate(createContactVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContactVM** | [**CreateContactVM**](CreateContactVM.md)|  | [optional]

### Return type

[**ContactVM**](ContactVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="contactsDelete"></a>
# **contactsDelete**
> contactsDelete(id)

Removes contact by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    apiInstance.contactsDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsDelete")
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

<a id="contactsGet"></a>
# **contactsGet**
> ContactVM contactsGet(id)

Returns contact group by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : ContactVM = apiInstance.contactsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**ContactVM**](ContactVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="contactsGetByGroup"></a>
# **contactsGetByGroup**
> ContactsVM contactsGetByGroup(groupId, skip, take)

Returns contacts by group id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ContactsVM = apiInstance.contactsGetByGroup(groupId, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsGetByGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsGetByGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**|  |
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **take** | **kotlin.Int**|  | [optional] [default to 10]

### Return type

[**ContactsVM**](ContactsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="contactsGetList"></a>
# **contactsGetList**
> ContactsVM contactsGetList(subscriptionId, skip, take, searchPattern)

Allows to search for contacts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
try {
    val result : ContactsVM = apiInstance.contactsGetList(subscriptionId, skip, take, searchPattern)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsGetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsGetList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**|  |
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **take** | **kotlin.Int**|  | [optional] [default to 10]
 **searchPattern** | **kotlin.String**|  | [optional]

### Return type

[**ContactsVM**](ContactsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="contactsUpdate"></a>
# **contactsUpdate**
> ContactVM contactsUpdate(id, updateContactVM)

Updates contact by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ContactsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateContactVM : UpdateContactVM =  // UpdateContactVM | 
try {
    val result : ContactVM = apiInstance.contactsUpdate(id, updateContactVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#contactsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#contactsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateContactVM** | [**UpdateContactVM**](UpdateContactVM.md)|  | [optional]

### Return type

[**ContactVM**](ContactVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

