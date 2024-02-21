# GroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsCreateGroup**](GroupsApi.md#groupsCreateGroup) | **POST** /api/manage/v1/Groups | Create a new user group
[**groupsDeleteGroup**](GroupsApi.md#groupsDeleteGroup) | **DELETE** /api/manage/v1/Groups/{id} | Delete group by identifier
[**groupsGetGroup**](GroupsApi.md#groupsGetGroup) | **GET** /api/manage/v1/Groups/{id} | Gets group by identifier
[**groupsGetGroupList**](GroupsApi.md#groupsGetGroupList) | **GET** /api/manage/v1/Groups | Returns a list of current user&#39;s groups&lt;br /&gt;  This method will return following data about groups : &lt;br /&gt;  Id, Name, Created time (UTC), Edited time (UTC), creator id, &lt;br /&gt;  editor id, subscription id
[**groupsGetPermissions**](GroupsApi.md#groupsGetPermissions) | **GET** /api/manage/v1/Groups/{id}/permissions | Gets group permissions by identifier
[**groupsRenameGroup**](GroupsApi.md#groupsRenameGroup) | **PUT** /api/manage/v1/Groups/{id}/rename | Rename group by identifier
[**groupsUpdatePermissions**](GroupsApi.md#groupsUpdatePermissions) | **POST** /api/manage/v1/Groups/{id}/permissions | Update permissions


<a id="groupsCreateGroup"></a>
# **groupsCreateGroup**
> GroupVM groupsCreateGroup(createGroupVM)

Create a new user group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val createGroupVM : CreateGroupVM =  // CreateGroupVM | Model for creating
try {
    val result : GroupVM = apiInstance.groupsCreateGroup(createGroupVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsCreateGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsCreateGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGroupVM** | [**CreateGroupVM**](CreateGroupVM.md)| Model for creating | [optional]

### Return type

[**GroupVM**](GroupVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="groupsDeleteGroup"></a>
# **groupsDeleteGroup**
> groupsDeleteGroup(id)

Delete group by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
try {
    apiInstance.groupsDeleteGroup(id)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsDeleteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsDeleteGroup")
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

<a id="groupsGetGroup"></a>
# **groupsGetGroup**
> GroupVM groupsGetGroup(id)

Gets group by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
try {
    val result : GroupVM = apiInstance.groupsGetGroup(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsGetGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsGetGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |

### Return type

[**GroupVM**](GroupVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="groupsGetGroupList"></a>
# **groupsGetGroupList**
> GroupsVM groupsGetGroupList(skip, take)

Returns a list of current user&#39;s groups&lt;br /&gt;  This method will return following data about groups : &lt;br /&gt;  Id, Name, Created time (UTC), Edited time (UTC), creator id, &lt;br /&gt;  editor id, subscription id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val skip : kotlin.Int = 56 // kotlin.Int | How many groups need to skip
val take : kotlin.Int = 56 // kotlin.Int | How many groups need to take
try {
    val result : GroupsVM = apiInstance.groupsGetGroupList(skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsGetGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsGetGroupList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **kotlin.Int**| How many groups need to skip | [optional] [default to 0]
 **take** | **kotlin.Int**| How many groups need to take | [optional] [default to 10]

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

<a id="groupsGetPermissions"></a>
# **groupsGetPermissions**
> GroupPermissionsVM groupsGetPermissions(id)

Gets group permissions by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
try {
    val result : GroupPermissionsVM = apiInstance.groupsGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsGetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |

### Return type

[**GroupPermissionsVM**](GroupPermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="groupsRenameGroup"></a>
# **groupsRenameGroup**
> GroupVM groupsRenameGroup(id, renameGroupVM)

Rename group by identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of group
val renameGroupVM : RenameGroupVM =  // RenameGroupVM | Model for renaming
try {
    val result : GroupVM = apiInstance.groupsRenameGroup(id, renameGroupVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsRenameGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsRenameGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of group |
 **renameGroupVM** | [**RenameGroupVM**](RenameGroupVM.md)| Model for renaming |

### Return type

[**GroupVM**](GroupVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="groupsUpdatePermissions"></a>
# **groupsUpdatePermissions**
> groupsUpdatePermissions(id, updateGroupPermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = GroupsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateGroupPermissionsVM : UpdateGroupPermissionsVM =  // UpdateGroupPermissionsVM | 
try {
    apiInstance.groupsUpdatePermissions(id, updateGroupPermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#groupsUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#groupsUpdatePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateGroupPermissionsVM** | [**UpdateGroupPermissionsVM**](UpdateGroupPermissionsVM.md)|  | [optional]

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

