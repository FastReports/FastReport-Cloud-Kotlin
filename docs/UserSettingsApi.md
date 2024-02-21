# UserSettingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSettingsAcceptAgreements**](UserSettingsApi.md#userSettingsAcceptAgreements) | **POST** /api/manage/v1/UserSettings/accept | Use this endpoint to accept current version of service license agreement
[**userSettingsGetCurrentUserSettings**](UserSettingsApi.md#userSettingsGetCurrentUserSettings) | **GET** /api/manage/v1/UserSettings | Return current user settings.
[**userSettingsUpdateMySettings**](UserSettingsApi.md#userSettingsUpdateMySettings) | **PUT** /api/manage/v1/UserSettings | Update settings of the current user


<a id="userSettingsAcceptAgreements"></a>
# **userSettingsAcceptAgreements**
> userSettingsAcceptAgreements(acceptAgreementsVM)

Use this endpoint to accept current version of service license agreement

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserSettingsApi()
val acceptAgreementsVM : AcceptAgreementsVM =  // AcceptAgreementsVM | 
try {
    apiInstance.userSettingsAcceptAgreements(acceptAgreementsVM)
} catch (e: ClientException) {
    println("4xx response calling UserSettingsApi#userSettingsAcceptAgreements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSettingsApi#userSettingsAcceptAgreements")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptAgreementsVM** | [**AcceptAgreementsVM**](AcceptAgreementsVM.md)|  | [optional]

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
 - **Accept**: Not defined

<a id="userSettingsGetCurrentUserSettings"></a>
# **userSettingsGetCurrentUserSettings**
> UserSettingsVM userSettingsGetCurrentUserSettings()

Return current user settings.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserSettingsApi()
try {
    val result : UserSettingsVM = apiInstance.userSettingsGetCurrentUserSettings()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSettingsApi#userSettingsGetCurrentUserSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSettingsApi#userSettingsGetCurrentUserSettings")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserSettingsVM**](UserSettingsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userSettingsUpdateMySettings"></a>
# **userSettingsUpdateMySettings**
> UserSettingsVM userSettingsUpdateMySettings(updateUserSettingsVM)

Update settings of the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserSettingsApi()
val updateUserSettingsVM : UpdateUserSettingsVM =  // UpdateUserSettingsVM | 
try {
    val result : UserSettingsVM = apiInstance.userSettingsUpdateMySettings(updateUserSettingsVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSettingsApi#userSettingsUpdateMySettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSettingsApi#userSettingsUpdateMySettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserSettingsVM** | [**UpdateUserSettingsVM**](UpdateUserSettingsVM.md)|  | [optional]

### Return type

[**UserSettingsVM**](UserSettingsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

