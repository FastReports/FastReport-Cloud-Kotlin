# SubscriptionPlansApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionPlansGetSubscriptionPlan**](SubscriptionPlansApi.md#subscriptionPlansGetSubscriptionPlan) | **GET** /api/manage/v1/SubscriptionPlans/{id} | Returns a subscription plan. Not all subscriptions can be issued for customer.
[**subscriptionPlansGetSubscriptionPlans**](SubscriptionPlansApi.md#subscriptionPlansGetSubscriptionPlans) | **GET** /api/manage/v1/SubscriptionPlans | Returns a list of active subscription plans that can be issued to the user.


<a id="subscriptionPlansGetSubscriptionPlan"></a>
# **subscriptionPlansGetSubscriptionPlan**
> SubscriptionPlanVM subscriptionPlansGetSubscriptionPlan(id)

Returns a subscription plan. Not all subscriptions can be issued for customer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionPlansApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of subsctiption plan
try {
    val result : SubscriptionPlanVM = apiInstance.subscriptionPlansGetSubscriptionPlan(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#subscriptionPlansGetSubscriptionPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#subscriptionPlansGetSubscriptionPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of subsctiption plan |

### Return type

[**SubscriptionPlanVM**](SubscriptionPlanVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subscriptionPlansGetSubscriptionPlans"></a>
# **subscriptionPlansGetSubscriptionPlans**
> SubscriptionPlansVM subscriptionPlansGetSubscriptionPlans(skip, take)

Returns a list of active subscription plans that can be issued to the user.

If no active subscription plans, then the endpoint will return empty list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = SubscriptionPlansApi()
val skip : kotlin.Int = 56 // kotlin.Int | Variable for pagination, defautl value is 0
val take : kotlin.Int = 56 // kotlin.Int | Variable for pagination, default value is 10
try {
    val result : SubscriptionPlansVM = apiInstance.subscriptionPlansGetSubscriptionPlans(skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#subscriptionPlansGetSubscriptionPlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#subscriptionPlansGetSubscriptionPlans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **kotlin.Int**| Variable for pagination, defautl value is 0 | [optional] [default to 0]
 **take** | **kotlin.Int**| Variable for pagination, default value is 10 | [optional] [default to 10]

### Return type

[**SubscriptionPlansVM**](SubscriptionPlansVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

