# SubscriptionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionsGetDefaultPermissions**](SubscriptionsApi.md#subscriptionsGetDefaultPermissions) | **GET** /api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions | Get subscription&#39;s default permissions for new entities
[**subscriptionsGetMyPermissions**](SubscriptionsApi.md#subscriptionsGetMyPermissions) | **GET** /api/manage/v1/Subscriptions/{subId}/mypermissions | Get user&#39;s permissions for a subscription by id
[**subscriptionsGetPermissions**](SubscriptionsApi.md#subscriptionsGetPermissions) | **GET** /api/manage/v1/Subscriptions/{id}/permissions | Get permissions for a subscription by id
[**subscriptionsGetSubscription**](SubscriptionsApi.md#subscriptionsGetSubscription) | **GET** /api/manage/v1/Subscriptions/{id} | Returns the subscription by id
[**subscriptionsGetSubscriptions**](SubscriptionsApi.md#subscriptionsGetSubscriptions) | **GET** /api/manage/v1/Subscriptions | Returns a list of all subscriptions of current user
[**subscriptionsRenameSubscription**](SubscriptionsApi.md#subscriptionsRenameSubscription) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/rename | Rename subscription
[**subscriptionsUpdateDefaultPermissions**](SubscriptionsApi.md#subscriptionsUpdateDefaultPermissions) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions | Change subscription&#39;s default permissions for new entities
[**subscriptionsUpdateLocale**](SubscriptionsApi.md#subscriptionsUpdateLocale) | **PUT** /api/manage/v1/Subscriptions/{subscriptionId}/Locale | Update subscription&#39;s default locale
[**subscriptionsUpdatePermissions**](SubscriptionsApi.md#subscriptionsUpdatePermissions) | **POST** /api/manage/v1/Subscriptions/{id}/permissions | Update permissions


<a id="subscriptionsGetDefaultPermissions"></a>
# **subscriptionsGetDefaultPermissions**
> DefaultPermissionsVM subscriptionsGetDefaultPermissions(subscriptionId)

Get subscription&#39;s default permissions for new entities

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id
try {
    val result : DefaultPermissionsVM = apiInstance.subscriptionsGetDefaultPermissions(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsGetDefaultPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsGetDefaultPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id |

### Return type

[**DefaultPermissionsVM**](DefaultPermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionsGetMyPermissions"></a>
# **subscriptionsGetMyPermissions**
> MyPermissionsVM subscriptionsGetMyPermissions(subId)

Get user&#39;s permissions for a subscription by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val subId : kotlin.String = subId_example // kotlin.String | subscription id
try {
    val result : MyPermissionsVM = apiInstance.subscriptionsGetMyPermissions(subId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsGetMyPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsGetMyPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subId** | **kotlin.String**| subscription id |

### Return type

[**MyPermissionsVM**](MyPermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionsGetPermissions"></a>
# **subscriptionsGetPermissions**
> SubscriptionPermissionsVM subscriptionsGetPermissions(id)

Get permissions for a subscription by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : SubscriptionPermissionsVM = apiInstance.subscriptionsGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsGetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**SubscriptionPermissionsVM**](SubscriptionPermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionsGetSubscription"></a>
# **subscriptionsGetSubscription**
> SubscriptionVM subscriptionsGetSubscription(id)

Returns the subscription by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of subscription
try {
    val result : SubscriptionVM = apiInstance.subscriptionsGetSubscription(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsGetSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsGetSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of subscription |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionsGetSubscriptions"></a>
# **subscriptionsGetSubscriptions**
> SubscriptionsVM subscriptionsGetSubscriptions(skip, take)

Returns a list of all subscriptions of current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Variable for pagination, defautl value is 0
val take : kotlin.Int = 56 // kotlin.Int | Variable for pagination, default value is 10
try {
    val result : SubscriptionsVM = apiInstance.subscriptionsGetSubscriptions(skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsGetSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsGetSubscriptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **kotlin.Int**| Variable for pagination, defautl value is 0 | [optional] [default to 0]
 **take** | **kotlin.Int**| Variable for pagination, default value is 10 | [optional] [default to 10]

### Return type

[**SubscriptionsVM**](SubscriptionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionsRenameSubscription"></a>
# **subscriptionsRenameSubscription**
> SubscriptionVM subscriptionsRenameSubscription(subscriptionId, renameSubscriptionVM)

Rename subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id
val renameSubscriptionVM : RenameSubscriptionVM =  // RenameSubscriptionVM | rename VM
try {
    val result : SubscriptionVM = apiInstance.subscriptionsRenameSubscription(subscriptionId, renameSubscriptionVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsRenameSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsRenameSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id |
 **renameSubscriptionVM** | [**RenameSubscriptionVM**](RenameSubscriptionVM.md)| rename VM |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subscriptionsUpdateDefaultPermissions"></a>
# **subscriptionsUpdateDefaultPermissions**
> DefaultPermissionsVM subscriptionsUpdateDefaultPermissions(subscriptionId, updateDefaultPermissionsVM)

Change subscription&#39;s default permissions for new entities

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id
val updateDefaultPermissionsVM : UpdateDefaultPermissionsVM =  // UpdateDefaultPermissionsVM | update default permissions VM
try {
    val result : DefaultPermissionsVM = apiInstance.subscriptionsUpdateDefaultPermissions(subscriptionId, updateDefaultPermissionsVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsUpdateDefaultPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsUpdateDefaultPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id |
 **updateDefaultPermissionsVM** | [**UpdateDefaultPermissionsVM**](UpdateDefaultPermissionsVM.md)| update default permissions VM |

### Return type

[**DefaultPermissionsVM**](DefaultPermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subscriptionsUpdateLocale"></a>
# **subscriptionsUpdateLocale**
> SubscriptionVM subscriptionsUpdateLocale(subscriptionId, updateSubscriptionLocaleVM)

Update subscription&#39;s default locale

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id
val updateSubscriptionLocaleVM : UpdateSubscriptionLocaleVM =  // UpdateSubscriptionLocaleVM | update VM
try {
    val result : SubscriptionVM = apiInstance.subscriptionsUpdateLocale(subscriptionId, updateSubscriptionLocaleVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsUpdateLocale")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsUpdateLocale")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id |
 **updateSubscriptionLocaleVM** | [**UpdateSubscriptionLocaleVM**](UpdateSubscriptionLocaleVM.md)| update VM |

### Return type

[**SubscriptionVM**](SubscriptionVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subscriptionsUpdatePermissions"></a>
# **subscriptionsUpdatePermissions**
> subscriptionsUpdatePermissions(id, updateSubscriptionPermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateSubscriptionPermissionsVM : UpdateSubscriptionPermissionsVM =  // UpdateSubscriptionPermissionsVM | 
try {
    apiInstance.subscriptionsUpdatePermissions(id, updateSubscriptionPermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#subscriptionsUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#subscriptionsUpdatePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateSubscriptionPermissionsVM** | [**UpdateSubscriptionPermissionsVM**](UpdateSubscriptionPermissionsVM.md)|  | [optional]

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

