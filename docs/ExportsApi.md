# ExportsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportFolderAndFileClearRecycleBin**](ExportsApi.md#exportFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Exports/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin
[**exportFolderAndFileCopyFiles**](ExportsApi.md#exportFolderAndFileCopyFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder
[**exportFolderAndFileCountRecycleBinFoldersAndFiles**](ExportsApi.md#exportFolderAndFileCountRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Exports/{subscriptionId}/CountRecycleBinFolderAndFiles | Count all folders and files from recycle bin
[**exportFolderAndFileDeleteFiles**](ExportsApi.md#exportFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/DeleteFiles | Delete folders and files
[**exportFolderAndFileGetCount**](ExportsApi.md#exportFolderAndFileGetCount) | **GET** /api/rp/v1/Exports/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder
[**exportFolderAndFileGetFoldersAndFiles**](ExportsApi.md#exportFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Exports/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder
[**exportFolderAndFileGetRecycleBinFoldersAndFiles**](ExportsApi.md#exportFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Exports/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin
[**exportFolderAndFileMoveFiles**](ExportsApi.md#exportFolderAndFileMoveFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/MoveFiles | Move folders and files to a specified folder
[**exportFolderAndFileMoveFilesToBin**](ExportsApi.md#exportFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Exports/{subscriptionId}/ToBin | Move folders and files to bin
[**exportFolderAndFileRecoverAllFromRecycleBin**](ExportsApi.md#exportFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Exports/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin
[**exportFolderAndFileRecoverFiles**](ExportsApi.md#exportFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Exports/{subscriptionId}/RecoverFiles | Recover folders and files from bin
[**exportFoldersCalculateFolderSize**](ExportsApi.md#exportFoldersCalculateFolderSize) | **GET** /api/rp/v1/Exports/Folder/{id}/size | Get specified folder, calculate it&#39;s size
[**exportFoldersCopyFolder**](ExportsApi.md#exportFoldersCopyFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Copy/{folderId} | Move folder to a specified folder
[**exportFoldersDeleteFolder**](ExportsApi.md#exportFoldersDeleteFolder) | **DELETE** /api/rp/v1/Exports/Folder/{id} | Delete specified folder
[**exportFoldersGetBreadcrumbs**](ExportsApi.md#exportFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Exports/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs
[**exportFoldersGetFolder**](ExportsApi.md#exportFoldersGetFolder) | **GET** /api/rp/v1/Exports/Folder/{id} | Get specified folder
[**exportFoldersGetFolders**](ExportsApi.md#exportFoldersGetFolders) | **GET** /api/rp/v1/Exports/Folder/{id}/ListFolders | Get all folders from specified folder
[**exportFoldersGetFoldersCount**](ExportsApi.md#exportFoldersGetFoldersCount) | **GET** /api/rp/v1/Exports/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder
[**exportFoldersGetOrCreate**](ExportsApi.md#exportFoldersGetOrCreate) | **GET** /api/rp/v1/Exports/Folder/getOrCreate | Get specified folder
[**exportFoldersGetPermissions**](ExportsApi.md#exportFoldersGetPermissions) | **GET** /api/rp/v1/Exports/Folder/{id}/permissions | Get all folder permissions
[**exportFoldersGetRootFolder**](ExportsApi.md#exportFoldersGetRootFolder) | **GET** /api/rp/v1/Exports/Root | Get user&#39;s root folder (without parents)
[**exportFoldersMoveFolder**](ExportsApi.md#exportFoldersMoveFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Move/{folderId} | Move folder to a specified folder
[**exportFoldersMoveFolderToBin**](ExportsApi.md#exportFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Exports/Folder/{id}/ToBin | Move specified folder to recycle bin
[**exportFoldersPostFolder**](ExportsApi.md#exportFoldersPostFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Folder | Create folder
[**exportFoldersRecoverFolder**](ExportsApi.md#exportFoldersRecoverFolder) | **POST** /api/rp/v1/Exports/Folder/{id}/Recover | Recover specified folder
[**exportFoldersRenameFolder**](ExportsApi.md#exportFoldersRenameFolder) | **PUT** /api/rp/v1/Exports/Folder/{id}/Rename | Rename a folder
[**exportFoldersUpdateIcon**](ExportsApi.md#exportFoldersUpdateIcon) | **PUT** /api/rp/v1/Exports/Folder/{id}/Icon | Update a folder&#39;s icon
[**exportFoldersUpdatePermissions**](ExportsApi.md#exportFoldersUpdatePermissions) | **POST** /api/rp/v1/Exports/{id}/permissions | Update permissions
[**exportFoldersUpdateTags**](ExportsApi.md#exportFoldersUpdateTags) | **PUT** /api/rp/v1/Exports/Folder/{id}/UpdateTags | Update tags
[**exportsCopyFile**](ExportsApi.md#exportsCopyFile) | **POST** /api/rp/v1/Exports/File/{id}/Copy/{folderId} | Copy file to a specified folder
[**exportsCreateSharingKey**](ExportsApi.md#exportsCreateSharingKey) | **POST** /api/rp/v1/Exports/File/{id}/sharingKey | Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)
[**exportsDeleteFile**](ExportsApi.md#exportsDeleteFile) | **DELETE** /api/rp/v1/Exports/File/{id} | Delete specified file
[**exportsDeleteSharingKey**](ExportsApi.md#exportsDeleteSharingKey) | **DELETE** /api/rp/v1/Exports/File/{id}/sharingKey | Deletes a sharing key, making links, that utilizing it no longer work
[**exportsGetFile**](ExportsApi.md#exportsGetFile) | **GET** /api/rp/v1/Exports/File/{id} | Get export by specified id
[**exportsGetFileHistory**](ExportsApi.md#exportsGetFileHistory) | **GET** /api/rp/v1/Exports/File/{id}/History | Returns list of actions, performed on this file
[**exportsGetFilesCount**](ExportsApi.md#exportsGetFilesCount) | **GET** /api/rp/v1/Exports/Folder/{id}/CountFiles | Get count of files what contains in a specified folder
[**exportsGetFilesList**](ExportsApi.md#exportsGetFilesList) | **GET** /api/rp/v1/Exports/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
[**exportsGetPermissions**](ExportsApi.md#exportsGetPermissions) | **GET** /api/rp/v1/Exports/File/{id}/permissions | 
[**exportsGetSharingKeys**](ExportsApi.md#exportsGetSharingKeys) | **GET** /api/rp/v1/Exports/File/{id}/sharingKeys | Returns all sharing keys, associated with the file
[**exportsMoveFile**](ExportsApi.md#exportsMoveFile) | **POST** /api/rp/v1/Exports/File/{id}/Move/{folderId} | Move file to a specified folder
[**exportsMoveFileToBin**](ExportsApi.md#exportsMoveFileToBin) | **DELETE** /api/rp/v1/Exports/File/{id}/ToBin | Move specified file to recycle bin
[**exportsRecoverFile**](ExportsApi.md#exportsRecoverFile) | **POST** /api/rp/v1/Exports/File/{id}/Recover | Recover specified file from bin
[**exportsRenameFile**](ExportsApi.md#exportsRenameFile) | **PUT** /api/rp/v1/Exports/File/{id}/Rename | Rename a file
[**exportsUpdateIcon**](ExportsApi.md#exportsUpdateIcon) | **PUT** /api/rp/v1/Exports/File/{id}/Icon | Update a files&#39;s icon
[**exportsUpdatePermissions**](ExportsApi.md#exportsUpdatePermissions) | **POST** /api/rp/v1/Exports/File/{id}/permissions | Update permissions
[**exportsUpdateTags**](ExportsApi.md#exportsUpdateTags) | **PUT** /api/rp/v1/Exports/File/{id}/UpdateTags | Update tags


<a id="exportFolderAndFileClearRecycleBin"></a>
# **exportFolderAndFileClearRecycleBin**
> exportFolderAndFileClearRecycleBin(subscriptionId)

Delete all folders and files from recycle bin

User with a Delete RecycleBin permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
try {
    apiInstance.exportFolderAndFileClearRecycleBin(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileClearRecycleBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileClearRecycleBin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscription id |

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

<a id="exportFolderAndFileCopyFiles"></a>
# **exportFolderAndFileCopyFiles**
> exportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

Copy folders and files to a specified folder

User with a Get permission for a files and Create permission for a destination folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.exportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileCopyFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileCopyFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id of current subscription |
 **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional]

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

<a id="exportFolderAndFileCountRecycleBinFoldersAndFiles"></a>
# **exportFolderAndFileCountRecycleBinFoldersAndFiles**
> CountVM exportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)

Count all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CountVM = apiInstance.exportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileCountRecycleBinFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileCountRecycleBinFoldersAndFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscription id |
 **searchPattern** | **kotlin.String**|  | [optional] [default to &quot;&quot;]
 **useRegex** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**CountVM**](CountVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFolderAndFileDeleteFiles"></a>
# **exportFolderAndFileDeleteFiles**
> exportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

Delete folders and files

User with a Delete permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.exportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileDeleteFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileDeleteFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id of current subscription |
 **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional]

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

<a id="exportFolderAndFileGetCount"></a>
# **exportFolderAndFileGetCount**
> CountVM exportFolderAndFileGetCount(id, searchPattern, useRegex)

Get count of files and folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
val useRegex : kotlin.Boolean = true // kotlin.Boolean | set this to true if you want to use regular expression to search
try {
    val result : CountVM = apiInstance.exportFolderAndFileGetCount(id, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileGetCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileGetCount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |
 **searchPattern** | **kotlin.String**| string, that must be incuded in file or folder name to be counted &lt;br /&gt;              (leave undefined to count all files and folders) | [optional]
 **useRegex** | **kotlin.Boolean**| set this to true if you want to use regular expression to search | [optional] [default to false]

### Return type

[**CountVM**](CountVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFolderAndFileGetFoldersAndFiles"></a>
# **exportFolderAndFileGetFoldersAndFiles**
> FilesVM exportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be returned
val orderBy : FileSorting =  // FileSorting | indicates a field to sort by
val desc : kotlin.Boolean = true // kotlin.Boolean | indicates if sorting is descending
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.exportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileGetFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileGetFoldersAndFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |
 **skip** | **kotlin.Int**| number of folder and files, that have to be skipped | [optional] [default to 0]
 **take** | **kotlin.Int**| number of folder and files, that have to be returned | [optional] [default to 10]
 **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: CreatedTime, EditedTime, Size, Name]
 **desc** | **kotlin.Boolean**| indicates if sorting is descending | [optional] [default to false]
 **searchPattern** | **kotlin.String**|  | [optional] [default to &quot;&quot;]
 **useRegex** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**FilesVM**](FilesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFolderAndFileGetRecycleBinFoldersAndFiles"></a>
# **exportFolderAndFileGetRecycleBinFoldersAndFiles**
> FilesVM exportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val skip : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be returned
val orderBy : FileSorting =  // FileSorting | indicates a field to sort by
val desc : kotlin.Boolean = true // kotlin.Boolean | indicates if sorting is descending
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.exportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileGetRecycleBinFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileGetRecycleBinFoldersAndFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscription id |
 **skip** | **kotlin.Int**| number of folder and files, that have to be skipped | [optional] [default to 0]
 **take** | **kotlin.Int**| number of folder and files, that have to be returned | [optional] [default to 10]
 **orderBy** | [**FileSorting**](.md)| indicates a field to sort by | [optional] [enum: CreatedTime, EditedTime, Size, Name]
 **desc** | **kotlin.Boolean**| indicates if sorting is descending | [optional] [default to false]
 **searchPattern** | **kotlin.String**|  | [optional] [default to &quot;&quot;]
 **useRegex** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**FilesVM**](FilesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFolderAndFileMoveFiles"></a>
# **exportFolderAndFileMoveFiles**
> exportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

Move folders and files to a specified folder

User with a Update Place permission for a files and Create permission for a destination folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.exportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileMoveFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileMoveFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id of current subscription |
 **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional]

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

<a id="exportFolderAndFileMoveFilesToBin"></a>
# **exportFolderAndFileMoveFilesToBin**
> exportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

Move folders and files to bin

User with a Delete permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.exportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileMoveFilesToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileMoveFilesToBin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id of current subscription |
 **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional]

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

<a id="exportFolderAndFileRecoverAllFromRecycleBin"></a>
# **exportFolderAndFileRecoverAllFromRecycleBin**
> exportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

Recover all folders and files from recycle bin

User with a Create RecycleBin permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
try {
    apiInstance.exportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileRecoverAllFromRecycleBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileRecoverAllFromRecycleBin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscription id |

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

<a id="exportFolderAndFileRecoverFiles"></a>
# **exportFolderAndFileRecoverFiles**
> exportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

Recover folders and files from bin

User with a SubscriptionCreate permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.exportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFolderAndFileRecoverFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFolderAndFileRecoverFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id of current subscription |
 **selectedFilesVM** | [**SelectedFilesVM**](SelectedFilesVM.md)| VM with files&#39; ids and params of their destination | [optional]

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

<a id="exportFoldersCalculateFolderSize"></a>
# **exportFoldersCalculateFolderSize**
> FolderSizeVM exportFoldersCalculateFolderSize(id)

Get specified folder, calculate it&#39;s size

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : FolderSizeVM = apiInstance.exportFoldersCalculateFolderSize(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersCalculateFolderSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersCalculateFolderSize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

### Return type

[**FolderSizeVM**](FolderSizeVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersCopyFolder"></a>
# **exportFoldersCopyFolder**
> FileVM exportFoldersCopyFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | moving folder id
val folderId : kotlin.String = folderId_example // kotlin.String | destination folder id
try {
    val result : FileVM = apiInstance.exportFoldersCopyFolder(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersCopyFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersCopyFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| moving folder id |
 **folderId** | **kotlin.String**| destination folder id |

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersDeleteFolder"></a>
# **exportFoldersDeleteFolder**
> exportFoldersDeleteFolder(id)

Delete specified folder

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    apiInstance.exportFoldersDeleteFolder(id)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersDeleteFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersDeleteFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

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

<a id="exportFoldersGetBreadcrumbs"></a>
# **exportFoldersGetBreadcrumbs**
> BreadcrumbsVM exportFoldersGetBreadcrumbs(id)

Get specified folder breadcrumbs

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : BreadcrumbsVM = apiInstance.exportFoldersGetBreadcrumbs(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetBreadcrumbs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetBreadcrumbs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

### Return type

[**BreadcrumbsVM**](BreadcrumbsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersGetFolder"></a>
# **exportFoldersGetFolder**
> FileVM exportFoldersGetFolder(id)

Get specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : FileVM = apiInstance.exportFoldersGetFolder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersGetFolders"></a>
# **exportFoldersGetFolders**
> FilesVM exportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders from specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of files, that have to be returned
val orderBy : FileSorting =  // FileSorting | 
val desc : kotlin.Boolean = true // kotlin.Boolean | 
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.exportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetFolders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |
 **skip** | **kotlin.Int**| number of files, that have to be skipped | [optional] [default to 0]
 **take** | **kotlin.Int**| number of files, that have to be returned | [optional] [default to 10]
 **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: CreatedTime, EditedTime, Size, Name]
 **desc** | **kotlin.Boolean**|  | [optional] [default to false]
 **searchPattern** | **kotlin.String**|  | [optional] [default to &quot;&quot;]
 **useRegex** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**FilesVM**](FilesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersGetFoldersCount"></a>
# **exportFoldersGetFoldersCount**
> CountVM exportFoldersGetFoldersCount(id)

Get count of folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : CountVM = apiInstance.exportFoldersGetFoldersCount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetFoldersCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetFoldersCount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

### Return type

[**CountVM**](CountVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersGetOrCreate"></a>
# **exportFoldersGetOrCreate**
> FileVM exportFoldersGetOrCreate(name, subscriptionId, parentId)

Get specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val name : kotlin.String = name_example // kotlin.String | folder name
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId
val parentId : kotlin.String = parentId_example // kotlin.String | parent folder id
try {
    val result : FileVM = apiInstance.exportFoldersGetOrCreate(name, subscriptionId, parentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetOrCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetOrCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| folder name | [optional]
 **subscriptionId** | **kotlin.String**| subscriptionId | [optional]
 **parentId** | **kotlin.String**| parent folder id | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersGetPermissions"></a>
# **exportFoldersGetPermissions**
> FilePermissionsVM exportFoldersGetPermissions(id)

Get all folder permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FilePermissionsVM = apiInstance.exportFoldersGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**FilePermissionsVM**](FilePermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersGetRootFolder"></a>
# **exportFoldersGetRootFolder**
> FileVM exportFoldersGetRootFolder(subscriptionId)

Get user&#39;s root folder (without parents)

&gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
try {
    val result : FileVM = apiInstance.exportFoldersGetRootFolder(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersGetRootFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersGetRootFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**|  | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersMoveFolder"></a>
# **exportFoldersMoveFolder**
> FileVM exportFoldersMoveFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | moving folder id
val folderId : kotlin.String = folderId_example // kotlin.String | destination folder id
try {
    val result : FileVM = apiInstance.exportFoldersMoveFolder(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersMoveFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersMoveFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| moving folder id |
 **folderId** | **kotlin.String**| destination folder id |

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportFoldersMoveFolderToBin"></a>
# **exportFoldersMoveFolderToBin**
> exportFoldersMoveFolderToBin(id)

Move specified folder to recycle bin

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    apiInstance.exportFoldersMoveFolderToBin(id)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersMoveFolderToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersMoveFolderToBin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

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

<a id="exportFoldersPostFolder"></a>
# **exportFoldersPostFolder**
> FileVM exportFoldersPostFolder(id, exportFolderCreateVM)

Create folder

User with a Create Entity permisison can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of parent folder id
val exportFolderCreateVM : ExportFolderCreateVM =  // ExportFolderCreateVM | create VM
try {
    val result : FileVM = apiInstance.exportFoldersPostFolder(id, exportFolderCreateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersPostFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersPostFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of parent folder id |
 **exportFolderCreateVM** | [**ExportFolderCreateVM**](ExportFolderCreateVM.md)| create VM | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportFoldersRecoverFolder"></a>
# **exportFoldersRecoverFolder**
> exportFoldersRecoverFolder(id, recoveryPath)

Recover specified folder

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val recoveryPath : kotlin.String = recoveryPath_example // kotlin.String | 
try {
    apiInstance.exportFoldersRecoverFolder(id, recoveryPath)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersRecoverFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersRecoverFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |
 **recoveryPath** | **kotlin.String**|  | [optional]

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

<a id="exportFoldersRenameFolder"></a>
# **exportFoldersRenameFolder**
> FileVM exportFoldersRenameFolder(id, folderRenameVM)

Rename a folder

User with a Update Name permision can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val folderRenameVM : FolderRenameVM =  // FolderRenameVM | 
try {
    val result : FileVM = apiInstance.exportFoldersRenameFolder(id, folderRenameVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersRenameFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersRenameFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderRenameVM** | [**FolderRenameVM**](FolderRenameVM.md)|  | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportFoldersUpdateIcon"></a>
# **exportFoldersUpdateIcon**
> FileVM exportFoldersUpdateIcon(id, folderIconVM)

Update a folder&#39;s icon

User with a Update Icon permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val folderIconVM : FolderIconVM =  // FolderIconVM | Update icon model
try {
    val result : FileVM = apiInstance.exportFoldersUpdateIcon(id, folderIconVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersUpdateIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersUpdateIcon")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of folder |
 **folderIconVM** | [**FolderIconVM**](FolderIconVM.md)| Update icon model | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportFoldersUpdatePermissions"></a>
# **exportFoldersUpdatePermissions**
> exportFoldersUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateFilePermissionsVM : UpdateFilePermissionsVM =  // UpdateFilePermissionsVM | 
try {
    apiInstance.exportFoldersUpdatePermissions(id, updateFilePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersUpdatePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateFilePermissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional]

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

<a id="exportFoldersUpdateTags"></a>
# **exportFoldersUpdateTags**
> FileVM exportFoldersUpdateTags(id, folderTagsUpdateVM)

Update tags

User with a Update Tags permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val folderTagsUpdateVM : FolderTagsUpdateVM =  // FolderTagsUpdateVM | 
try {
    val result : FileVM = apiInstance.exportFoldersUpdateTags(id, folderTagsUpdateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportFoldersUpdateTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportFoldersUpdateTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **folderTagsUpdateVM** | [**FolderTagsUpdateVM**](FolderTagsUpdateVM.md)|  | [optional]

### Return type

[**FileVM**](FileVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportsCopyFile"></a>
# **exportsCopyFile**
> ExportVM exportsCopyFile(id, folderId)

Copy file to a specified folder

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val folderId : kotlin.String = folderId_example // kotlin.String | folder id
try {
    val result : ExportVM = apiInstance.exportsCopyFile(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsCopyFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsCopyFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **folderId** | **kotlin.String**| folder id |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsCreateSharingKey"></a>
# **exportsCreateSharingKey**
> FileSharingKeysVM exportsCreateSharingKey(id, createFileShareVM)

Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val createFileShareVM : CreateFileShareVM =  // CreateFileShareVM | parameters for sharing key creation
try {
    val result : FileSharingKeysVM = apiInstance.exportsCreateSharingKey(id, createFileShareVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsCreateSharingKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsCreateSharingKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **createFileShareVM** | [**CreateFileShareVM**](CreateFileShareVM.md)| parameters for sharing key creation | [optional]

### Return type

[**FileSharingKeysVM**](FileSharingKeysVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportsDeleteFile"></a>
# **exportsDeleteFile**
> exportsDeleteFile(id)

Delete specified file

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    apiInstance.exportsDeleteFile(id)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsDeleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsDeleteFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |

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

<a id="exportsDeleteSharingKey"></a>
# **exportsDeleteSharingKey**
> exportsDeleteSharingKey(id, key)

Deletes a sharing key, making links, that utilizing it no longer work

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val key : kotlin.String = key_example // kotlin.String | key to delete
try {
    apiInstance.exportsDeleteSharingKey(id, key)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsDeleteSharingKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsDeleteSharingKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **key** | **kotlin.String**| key to delete |

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

<a id="exportsGetFile"></a>
# **exportsGetFile**
> ExportVM exportsGetFile(id)

Get export by specified id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | id of export
try {
    val result : ExportVM = apiInstance.exportsGetFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsGetFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsGetFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| id of export |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsGetFileHistory"></a>
# **exportsGetFileHistory**
> AuditActionsVM exportsGetFileHistory(id, skip, take)

Returns list of actions, performed on this file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AuditActionsVM = apiInstance.exportsGetFileHistory(id, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsGetFileHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsGetFileHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **skip** | **kotlin.Int**|  | [optional] [default to 0]
 **take** | **kotlin.Int**|  | [optional] [default to 10]

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

<a id="exportsGetFilesCount"></a>
# **exportsGetFilesCount**
> CountVM exportsGetFilesCount(id)

Get count of files what contains in a specified folder

User with Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : CountVM = apiInstance.exportsGetFilesCount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsGetFilesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsGetFilesCount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |

### Return type

[**CountVM**](CountVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsGetFilesList"></a>
# **exportsGetFilesList**
> ExportsVM exportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of files, that have to be returned
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val orderBy : FileSorting =  // FileSorting | 
val desc : kotlin.Boolean = true // kotlin.Boolean | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : ExportsVM = apiInstance.exportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsGetFilesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsGetFilesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| folder id |
 **skip** | **kotlin.Int**| number of files, that have to be skipped | [optional] [default to 0]
 **take** | **kotlin.Int**| number of files, that have to be returned | [optional] [default to 10]
 **searchPattern** | **kotlin.String**|  | [optional]
 **orderBy** | [**FileSorting**](.md)|  | [optional] [enum: CreatedTime, EditedTime, Size, Name]
 **desc** | **kotlin.Boolean**|  | [optional] [default to false]
 **useRegex** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**ExportsVM**](ExportsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsGetPermissions"></a>
# **exportsGetPermissions**
> FilePermissionsVM exportsGetPermissions(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FilePermissionsVM = apiInstance.exportsGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsGetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**FilePermissionsVM**](FilePermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsGetSharingKeys"></a>
# **exportsGetSharingKeys**
> FileSharingKeysVM exportsGetSharingKeys(id)

Returns all sharing keys, associated with the file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    val result : FileSharingKeysVM = apiInstance.exportsGetSharingKeys(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsGetSharingKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsGetSharingKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |

### Return type

[**FileSharingKeysVM**](FileSharingKeysVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsMoveFile"></a>
# **exportsMoveFile**
> ExportVM exportsMoveFile(id, folderId)

Move file to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val folderId : kotlin.String = folderId_example // kotlin.String | folder id
try {
    val result : ExportVM = apiInstance.exportsMoveFile(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsMoveFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsMoveFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **folderId** | **kotlin.String**| folder id |

### Return type

[**ExportVM**](ExportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exportsMoveFileToBin"></a>
# **exportsMoveFileToBin**
> exportsMoveFileToBin(id)

Move specified file to recycle bin

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    apiInstance.exportsMoveFileToBin(id)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsMoveFileToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsMoveFileToBin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |

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

<a id="exportsRecoverFile"></a>
# **exportsRecoverFile**
> exportsRecoverFile(id, recoveryPath)

Recover specified file from bin

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val recoveryPath : kotlin.String = recoveryPath_example // kotlin.String | 
try {
    apiInstance.exportsRecoverFile(id, recoveryPath)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsRecoverFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsRecoverFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **recoveryPath** | **kotlin.String**|  | [optional]

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

<a id="exportsRenameFile"></a>
# **exportsRenameFile**
> ExportVM exportsRenameFile(id, fileRenameVM)

Rename a file

User with Update Name permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileRenameVM : FileRenameVM =  // FileRenameVM | 
try {
    val result : ExportVM = apiInstance.exportsRenameFile(id, fileRenameVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsRenameFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsRenameFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileRenameVM** | [**FileRenameVM**](FileRenameVM.md)|  | [optional]

### Return type

[**ExportVM**](ExportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportsUpdateIcon"></a>
# **exportsUpdateIcon**
> ExportVM exportsUpdateIcon(id, fileIconVM)

Update a files&#39;s icon

User with Update Icon permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileIconVM : FileIconVM =  // FileIconVM | 
try {
    val result : ExportVM = apiInstance.exportsUpdateIcon(id, fileIconVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsUpdateIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsUpdateIcon")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileIconVM** | [**FileIconVM**](FileIconVM.md)|  | [optional]

### Return type

[**ExportVM**](ExportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="exportsUpdatePermissions"></a>
# **exportsUpdatePermissions**
> exportsUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateFilePermissionsVM : UpdateFilePermissionsVM =  // UpdateFilePermissionsVM | 
try {
    apiInstance.exportsUpdatePermissions(id, updateFilePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsUpdatePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateFilePermissionsVM** | [**UpdateFilePermissionsVM**](UpdateFilePermissionsVM.md)|  | [optional]

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

<a id="exportsUpdateTags"></a>
# **exportsUpdateTags**
> ExportVM exportsUpdateTags(id, fileTagsUpdateVM)

Update tags

User with Update Tags permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ExportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileTagsUpdateVM : FileTagsUpdateVM =  // FileTagsUpdateVM | 
try {
    val result : ExportVM = apiInstance.exportsUpdateTags(id, fileTagsUpdateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportsApi#exportsUpdateTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportsApi#exportsUpdateTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileTagsUpdateVM** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional]

### Return type

[**ExportVM**](ExportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

