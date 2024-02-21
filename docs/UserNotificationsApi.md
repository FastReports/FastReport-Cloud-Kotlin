# UserNotificationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userNotificationsClearNotifications**](UserNotificationsApi.md#userNotificationsClearNotifications) | **DELETE** /api/manage/v1/notifications | Use this endpoint to \&quot;clear\&quot; your notifications
[**userNotificationsGetNotifications**](UserNotificationsApi.md#userNotificationsGetNotifications) | **GET** /api/manage/v1/notifications | Use this endpoint to recieve notifications


<a id="userNotificationsClearNotifications"></a>
# **userNotificationsClearNotifications**
> userNotificationsClearNotifications(clearNotificationsVM)

Use this endpoint to \&quot;clear\&quot; your notifications

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserNotificationsApi()
val clearNotificationsVM : ClearNotificationsVM =  // ClearNotificationsVM | 
try {
    apiInstance.userNotificationsClearNotifications(clearNotificationsVM)
} catch (e: ClientException) {
    println("4xx response calling UserNotificationsApi#userNotificationsClearNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserNotificationsApi#userNotificationsClearNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clearNotificationsVM** | [**ClearNotificationsVM**](ClearNotificationsVM.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userNotificationsGetNotifications"></a>
# **userNotificationsGetNotifications**
> AuditActionsVM userNotificationsGetNotifications(skip, take, subscriptionId)

Use this endpoint to recieve notifications

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserNotificationsApi()
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
try {
    val result : AuditActionsVM = apiInstance.userNotificationsGetNotifications(skip, take, subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserNotificationsApi#userNotificationsGetNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserNotificationsApi#userNotificationsGetNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **take** | **kotlin.Int**|  | [optional] [default to 5]
 **subscriptionId** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**AuditActionsVM**](AuditActionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

