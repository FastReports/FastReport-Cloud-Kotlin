# SubscriptionGroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionGroupsCountGroupsAsync**](SubscriptionGroupsApi.md#subscriptionGroupsCountGroupsAsync) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/count | Returns a number of groups in subscription
[**subscriptionGroupsGetGroupsList**](SubscriptionGroupsApi.md#subscriptionGroupsGetGroupsList) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/groups | returns groups of the subscription or subscription user


<a id="subscriptionGroupsCountGroupsAsync"></a>
# **subscriptionGroupsCountGroupsAsync**
> kotlin.Long subscriptionGroupsCountGroupsAsync(subscriptionId)

Returns a number of groups in subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionGroupsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscripiton id
try {
    val result : kotlin.Long = apiInstance.subscriptionGroupsCountGroupsAsync(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionGroupsApi#subscriptionGroupsCountGroupsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionGroupsApi#subscriptionGroupsCountGroupsAsync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscripiton id |

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

<a id="subscriptionGroupsGetGroupsList"></a>
# **subscriptionGroupsGetGroupsList**
> GroupsVM subscriptionGroupsGetGroupsList(subscriptionId, userId)

returns groups of the subscription or subscription user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionGroupsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscripiton id
val userId : kotlin.String = userId_example // kotlin.String | user Id (optional)
try {
    val result : GroupsVM = apiInstance.subscriptionGroupsGetGroupsList(subscriptionId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionGroupsApi#subscriptionGroupsGetGroupsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionGroupsApi#subscriptionGroupsGetGroupsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscripiton id |
 **userId** | **kotlin.String**| user Id (optional) | [optional]

### Return type

[**GroupsVM**](GroupsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

