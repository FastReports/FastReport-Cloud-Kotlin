# SubscriptionUsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionUsersAddUser**](SubscriptionUsersApi.md#subscriptionUsersAddUser) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/users/{userId} | Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
[**subscriptionUsersCountUsersAsync**](SubscriptionUsersApi.md#subscriptionUsersCountUsersAsync) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/UsersCount | Returns a number of users in subscription
[**subscriptionUsersGetUsers**](SubscriptionUsersApi.md#subscriptionUsersGetUsers) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/users | Returns all users of subscription
[**subscriptionUsersLeaveSubscripiton**](SubscriptionUsersApi.md#subscriptionUsersLeaveSubscripiton) | **DELETE** /api/manage/v1/Subscriptions/{subscriptionId}/leave | Allows user to leave subscription,.
[**subscriptionUsersRemoveUser**](SubscriptionUsersApi.md#subscriptionUsersRemoveUser) | **DELETE** /api/manage/v1/Subscriptions/{subscriptionId}/users/{userId} | Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.


<a id="subscriptionUsersAddUser"></a>
# **subscriptionUsersAddUser**
> subscriptionUsersAddUser(subscriptionId, userId)

Add a user to the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionUsersApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Idenitifier of subscription
val userId : kotlin.String = userId_example // kotlin.String | Idenitifier of user
try {
    apiInstance.subscriptionUsersAddUser(subscriptionId, userId)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionUsersApi#subscriptionUsersAddUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionUsersApi#subscriptionUsersAddUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| Idenitifier of subscription |
 **userId** | **kotlin.String**| Idenitifier of user |

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

<a id="subscriptionUsersCountUsersAsync"></a>
# **subscriptionUsersCountUsersAsync**
> kotlin.Long subscriptionUsersCountUsersAsync(subscriptionId)

Returns a number of users in subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionUsersApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
try {
    val result : kotlin.Long = apiInstance.subscriptionUsersCountUsersAsync(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionUsersApi#subscriptionUsersCountUsersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionUsersApi#subscriptionUsersCountUsersAsync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**|  |

### Return type

**kotlin.Long**

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionUsersGetUsers"></a>
# **subscriptionUsersGetUsers**
> SubscriptionUsersVM subscriptionUsersGetUsers(subscriptionId, skip, take)

Returns all users of subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionUsersApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Idenitifier of subscription
val skip : kotlin.Int = 56 // kotlin.Int | How many entities skip
val take : kotlin.Int = 56 // kotlin.Int | How many entities take
try {
    val result : SubscriptionUsersVM = apiInstance.subscriptionUsersGetUsers(subscriptionId, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionUsersApi#subscriptionUsersGetUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionUsersApi#subscriptionUsersGetUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| Idenitifier of subscription |
 **skip** | **kotlin.Int**| How many entities skip | [optional] [default to 0]
 **take** | **kotlin.Int**| How many entities take | [optional] [default to 10]

### Return type

[**SubscriptionUsersVM**](SubscriptionUsersVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionUsersLeaveSubscripiton"></a>
# **subscriptionUsersLeaveSubscripiton**
> subscriptionUsersLeaveSubscripiton(subscriptionId)

Allows user to leave subscription,.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionUsersApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Idenitifier of subscription
try {
    apiInstance.subscriptionUsersLeaveSubscripiton(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionUsersApi#subscriptionUsersLeaveSubscripiton")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionUsersApi#subscriptionUsersLeaveSubscripiton")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| Idenitifier of subscription |

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

<a id="subscriptionUsersRemoveUser"></a>
# **subscriptionUsersRemoveUser**
> subscriptionUsersRemoveUser(subscriptionId, userId)

Delete a user from the subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionUsersApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Idenitifier of subscription
val userId : kotlin.String = userId_example // kotlin.String | Idenitifier of user
try {
    apiInstance.subscriptionUsersRemoveUser(subscriptionId, userId)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionUsersApi#subscriptionUsersRemoveUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionUsersApi#subscriptionUsersRemoveUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| Idenitifier of subscription |
 **userId** | **kotlin.String**| Idenitifier of user |

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

