# SubscriptionInvitesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionInvitesAcceptInvite**](SubscriptionInvitesApi.md#subscriptionInvitesAcceptInvite) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/invite/{accessToken}/accept | Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
[**subscriptionInvitesCreateInvite**](SubscriptionInvitesApi.md#subscriptionInvitesCreateInvite) | **POST** /api/manage/v1/Subscriptions/{subscriptionId}/invite | Create invite to subscription
[**subscriptionInvitesDeleteInvite**](SubscriptionInvitesApi.md#subscriptionInvitesDeleteInvite) | **DELETE** /api/manage/v1/Subscriptions/{subscriptionId}/invite/{accesstoken} | Delete invite with specified token
[**subscriptionInvitesGetInvites**](SubscriptionInvitesApi.md#subscriptionInvitesGetInvites) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/invites | Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.


<a id="subscriptionInvitesAcceptInvite"></a>
# **subscriptionInvitesAcceptInvite**
> subscriptionInvitesAcceptInvite(subscriptionId, accessToken)

Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionInvitesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Idenitifier of subscription
val accessToken : kotlin.String = accessToken_example // kotlin.String | access token of the subscription
try {
    apiInstance.subscriptionInvitesAcceptInvite(subscriptionId, accessToken)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionInvitesApi#subscriptionInvitesAcceptInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionInvitesApi#subscriptionInvitesAcceptInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| Idenitifier of subscription |
 **accessToken** | **kotlin.String**| access token of the subscription |

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

<a id="subscriptionInvitesCreateInvite"></a>
# **subscriptionInvitesCreateInvite**
> SubscriptionInviteVM subscriptionInvitesCreateInvite(subscriptionId, createSubscriptionInviteVM)

Create invite to subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionInvitesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id
val createSubscriptionInviteVM : CreateSubscriptionInviteVM =  // CreateSubscriptionInviteVM | create VM
try {
    val result : SubscriptionInviteVM = apiInstance.subscriptionInvitesCreateInvite(subscriptionId, createSubscriptionInviteVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionInvitesApi#subscriptionInvitesCreateInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionInvitesApi#subscriptionInvitesCreateInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id |
 **createSubscriptionInviteVM** | [**CreateSubscriptionInviteVM**](CreateSubscriptionInviteVM.md)| create VM | [optional]

### Return type

[**SubscriptionInviteVM**](SubscriptionInviteVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subscriptionInvitesDeleteInvite"></a>
# **subscriptionInvitesDeleteInvite**
> subscriptionInvitesDeleteInvite(subscriptionId, accesstoken)

Delete invite with specified token

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionInvitesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id
val accesstoken : kotlin.String = accesstoken_example // kotlin.String | invite's token
try {
    apiInstance.subscriptionInvitesDeleteInvite(subscriptionId, accesstoken)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionInvitesApi#subscriptionInvitesDeleteInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionInvitesApi#subscriptionInvitesDeleteInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id |
 **accesstoken** | **kotlin.String**| invite&#39;s token |

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

<a id="subscriptionInvitesGetInvites"></a>
# **subscriptionInvitesGetInvites**
> SubscriptionInvitesVM subscriptionInvitesGetInvites(subscriptionId)

Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionInvitesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Idenitifier of subscription
try {
    val result : SubscriptionInvitesVM = apiInstance.subscriptionInvitesGetInvites(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionInvitesApi#subscriptionInvitesGetInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionInvitesApi#subscriptionInvitesGetInvites")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| Idenitifier of subscription |

### Return type

[**SubscriptionInvitesVM**](SubscriptionInvitesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

