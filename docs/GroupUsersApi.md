# GroupUsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupUsersAddUserToGroup**](GroupUsersApi.md#groupUsersAddUserToGroup) | **PUT** /api/manage/v1/Groups/{id}/Users/{userId} | Add user to the group by identifier
[**groupUsersGetUsersInGroup**](GroupUsersApi.md#groupUsersGetUsersInGroup) | **GET** /api/manage/v1/Groups/{id}/Users | Returns users in the group by identifier
[**groupUsersLeaveFromGroup**](GroupUsersApi.md#groupUsersLeaveFromGroup) | **DELETE** /api/manage/v1/Groups/{id}/leave | Leave from the group
[**groupUsersRemoveFromGroup**](GroupUsersApi.md#groupUsersRemoveFromGroup) | **DELETE** /api/manage/v1/Groups/{id}/Users/{userId} | Remove user from the group by identifier


<a id="groupUsersAddUserToGroup"></a>
# **groupUsersAddUserToGroup**
> groupUsersAddUserToGroup(id, userId)

Add user to the group by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupUsersApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
val userId : kotlin.String = userId_example // kotlin.String | Identifier of user
try {
    apiInstance.groupUsersAddUserToGroup(id, userId)
} catch (e: ClientException) {
    println("4xx response calling GroupUsersApi#groupUsersAddUserToGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupUsersApi#groupUsersAddUserToGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |
 **userId** | **kotlin.String**| Identifier of user |

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

<a id="groupUsersGetUsersInGroup"></a>
# **groupUsersGetUsersInGroup**
> GroupUsersVM groupUsersGetUsersInGroup(id, skip, take)

Returns users in the group by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupUsersApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
val skip : kotlin.Int = 56 // kotlin.Int | how many to skip
val take : kotlin.Int = 56 // kotlin.Int | how many to take
try {
    val result : GroupUsersVM = apiInstance.groupUsersGetUsersInGroup(id, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupUsersApi#groupUsersGetUsersInGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupUsersApi#groupUsersGetUsersInGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |
 **skip** | **kotlin.Int**| how many to skip | [optional] [default to 0]
 **take** | **kotlin.Int**| how many to take | [optional] [default to 10]

### Return type

[**GroupUsersVM**](GroupUsersVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="groupUsersLeaveFromGroup"></a>
# **groupUsersLeaveFromGroup**
> groupUsersLeaveFromGroup(id)

Leave from the group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupUsersApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
try {
    apiInstance.groupUsersLeaveFromGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupUsersApi#groupUsersLeaveFromGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupUsersApi#groupUsersLeaveFromGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |

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

<a id="groupUsersRemoveFromGroup"></a>
# **groupUsersRemoveFromGroup**
> groupUsersRemoveFromGroup(id, userId)

Remove user from the group by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupUsersApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
val userId : kotlin.String = userId_example // kotlin.String | Identifier of user
try {
    apiInstance.groupUsersRemoveFromGroup(id, userId)
} catch (e: ClientException) {
    println("4xx response calling GroupUsersApi#groupUsersRemoveFromGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupUsersApi#groupUsersRemoveFromGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |
 **userId** | **kotlin.String**| Identifier of user |

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

