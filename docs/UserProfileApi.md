# UserProfileApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userProfileGetMyProfile**](UserProfileApi.md#userProfileGetMyProfile) | **GET** /api/manage/v1/UserProfile | Return current profile of the current user
[**userProfileGetUserProfile**](UserProfileApi.md#userProfileGetUserProfile) | **GET** /api/manage/v1/UserProfile/{userId} | Return user profile by user identifier.  If the user did not provide information about himself or blocked, then the endpoint will return an empty model. (only id)
[**userProfileUpdateMyProfile**](UserProfileApi.md#userProfileUpdateMyProfile) | **PUT** /api/manage/v1/UserProfile | Update profile of the current user


<a id="userProfileGetMyProfile"></a>
# **userProfileGetMyProfile**
> UserProfileVM userProfileGetMyProfile()

Return current profile of the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserProfileApi()
try {
    val result : UserProfileVM = apiInstance.userProfileGetMyProfile()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserProfileApi#userProfileGetMyProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserProfileApi#userProfileGetMyProfile")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserProfileVM**](UserProfileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userProfileGetUserProfile"></a>
# **userProfileGetUserProfile**
> UserProfileVM userProfileGetUserProfile(userId)

Return user profile by user identifier.  If the user did not provide information about himself or blocked, then the endpoint will return an empty model. (only id)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserProfileApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : UserProfileVM = apiInstance.userProfileGetUserProfile(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserProfileApi#userProfileGetUserProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserProfileApi#userProfileGetUserProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |

### Return type

[**UserProfileVM**](UserProfileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userProfileUpdateMyProfile"></a>
# **userProfileUpdateMyProfile**
> userProfileUpdateMyProfile(updateUserProfileVM)

Update profile of the current user

This method is only allowed for local sign in via intranet

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = UserProfileApi()
val updateUserProfileVM : UpdateUserProfileVM =  // UpdateUserProfileVM | 
try {
    apiInstance.userProfileUpdateMyProfile(updateUserProfileVM)
} catch (e: ClientException) {
    println("4xx response calling UserProfileApi#userProfileUpdateMyProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserProfileApi#userProfileUpdateMyProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserProfileVM** | [**UpdateUserProfileVM**](UpdateUserProfileVM.md)|  | [optional]

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

