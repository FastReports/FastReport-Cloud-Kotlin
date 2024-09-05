# ReportsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportFolderAndFileClearRecycleBin**](ReportsApi.md#reportFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Reports/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin
[**reportFolderAndFileCopyFiles**](ReportsApi.md#reportFolderAndFileCopyFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder
[**reportFolderAndFileCountRecycleBinFoldersAndFiles**](ReportsApi.md#reportFolderAndFileCountRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Reports/{subscriptionId}/CountRecycleBinFolderAndFiles | Count all folders and files from recycle bin
[**reportFolderAndFileDeleteFiles**](ReportsApi.md#reportFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/DeleteFiles | Delete folders and files
[**reportFolderAndFileGetCount**](ReportsApi.md#reportFolderAndFileGetCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder
[**reportFolderAndFileGetFoldersAndFiles**](ReportsApi.md#reportFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder
[**reportFolderAndFileGetRecycleBinFoldersAndFiles**](ReportsApi.md#reportFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Reports/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin
[**reportFolderAndFileMoveFiles**](ReportsApi.md#reportFolderAndFileMoveFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/MoveFiles | Move folders and files to a specified folder
[**reportFolderAndFileMoveFilesToBin**](ReportsApi.md#reportFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Reports/{subscriptionId}/ToBin | Move folders and files to bin
[**reportFolderAndFileRecoverAllFromRecycleBin**](ReportsApi.md#reportFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin
[**reportFolderAndFileRecoverFiles**](ReportsApi.md#reportFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Reports/{subscriptionId}/RecoverFiles | Recover folders and files from bin
[**reportFoldersCalculateFolderSize**](ReportsApi.md#reportFoldersCalculateFolderSize) | **GET** /api/rp/v1/Reports/Folder/{id}/size | Get specified folder, calculate it&#39;s size
[**reportFoldersCopyFolder**](ReportsApi.md#reportFoldersCopyFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Copy/{folderId} | Move folder to a specified folder
[**reportFoldersDeleteFolder**](ReportsApi.md#reportFoldersDeleteFolder) | **DELETE** /api/rp/v1/Reports/Folder/{id} | Delete specified folder
[**reportFoldersExport**](ReportsApi.md#reportFoldersExport) | **POST** /api/rp/v1/Reports/Folder/{id}/Export | Export specified report folder to a specified format
[**reportFoldersGetBreadcrumbs**](ReportsApi.md#reportFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Reports/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs
[**reportFoldersGetFolder**](ReportsApi.md#reportFoldersGetFolder) | **GET** /api/rp/v1/Reports/Folder/{id} | Get specified folder
[**reportFoldersGetFolders**](ReportsApi.md#reportFoldersGetFolders) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFolders | Get all folders from specified folder
[**reportFoldersGetFoldersCount**](ReportsApi.md#reportFoldersGetFoldersCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder
[**reportFoldersGetOrCreate**](ReportsApi.md#reportFoldersGetOrCreate) | **GET** /api/rp/v1/Reports/Folder/getOrCreate | Get specified folder
[**reportFoldersGetPermissions**](ReportsApi.md#reportFoldersGetPermissions) | **GET** /api/rp/v1/Reports/Folder/{id}/permissions | Get all folder permissions
[**reportFoldersGetRootFolder**](ReportsApi.md#reportFoldersGetRootFolder) | **GET** /api/rp/v1/Reports/Root | Get user&#39;s root folder (without parents)
[**reportFoldersMoveFolder**](ReportsApi.md#reportFoldersMoveFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Move/{folderId} | Move folder to a specified folder
[**reportFoldersMoveFolderToBin**](ReportsApi.md#reportFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Reports/Folder/{id}/ToBin | Move specified folder to recycle bin
[**reportFoldersPostFolder**](ReportsApi.md#reportFoldersPostFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Folder | Create folder
[**reportFoldersRecoverFolder**](ReportsApi.md#reportFoldersRecoverFolder) | **POST** /api/rp/v1/Reports/Folder/{id}/Recover | Recover specified folder
[**reportFoldersRenameFolder**](ReportsApi.md#reportFoldersRenameFolder) | **PUT** /api/rp/v1/Reports/Folder/{id}/Rename | Rename a folder
[**reportFoldersUpdateIcon**](ReportsApi.md#reportFoldersUpdateIcon) | **PUT** /api/rp/v1/Reports/Folder/{id}/Icon | Update a folder&#39;s icon
[**reportFoldersUpdatePermissions**](ReportsApi.md#reportFoldersUpdatePermissions) | **POST** /api/rp/v1/Reports/{id}/permissions | Update permissions
[**reportFoldersUpdateTags**](ReportsApi.md#reportFoldersUpdateTags) | **PUT** /api/rp/v1/Reports/Folder/{id}/UpdateTags | Update tags
[**reportsCopyFile**](ReportsApi.md#reportsCopyFile) | **POST** /api/rp/v1/Reports/File/{id}/Copy/{folderId} | Copy file to a specified folder
[**reportsCreateSharingKey**](ReportsApi.md#reportsCreateSharingKey) | **POST** /api/rp/v1/Reports/File/{id}/sharingKey | Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)
[**reportsDeleteFile**](ReportsApi.md#reportsDeleteFile) | **DELETE** /api/rp/v1/Reports/File/{id} | Delete specified file
[**reportsDeleteSharingKey**](ReportsApi.md#reportsDeleteSharingKey) | **DELETE** /api/rp/v1/Reports/File/{id}/sharingKey | Deletes a sharing key, making links, that utilizing it no longer work
[**reportsExport**](ReportsApi.md#reportsExport) | **POST** /api/rp/v1/Reports/File/{id}/Export | Export specified report to a specified format
[**reportsGetFile**](ReportsApi.md#reportsGetFile) | **GET** /api/rp/v1/Reports/File/{id} | Get specified file
[**reportsGetFileHistory**](ReportsApi.md#reportsGetFileHistory) | **GET** /api/rp/v1/Reports/File/{id}/History | Returns list of actions, performed on this file
[**reportsGetFilesCount**](ReportsApi.md#reportsGetFilesCount) | **GET** /api/rp/v1/Reports/Folder/{id}/CountFiles | Get count of files what contains in a specified folder
[**reportsGetFilesList**](ReportsApi.md#reportsGetFilesList) | **GET** /api/rp/v1/Reports/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
[**reportsGetPermissions**](ReportsApi.md#reportsGetPermissions) | **GET** /api/rp/v1/Reports/File/{id}/permissions | 
[**reportsGetSharingKeys**](ReportsApi.md#reportsGetSharingKeys) | **GET** /api/rp/v1/Reports/File/{id}/sharingKeys | Returns all sharing keys, associated with the file
[**reportsMoveFile**](ReportsApi.md#reportsMoveFile) | **POST** /api/rp/v1/Reports/File/{id}/Move/{folderId} | Move file to a specified folder
[**reportsMoveFileToBin**](ReportsApi.md#reportsMoveFileToBin) | **DELETE** /api/rp/v1/Reports/File/{id}/ToBin | Move specified file to recycle bin
[**reportsRecoverFile**](ReportsApi.md#reportsRecoverFile) | **POST** /api/rp/v1/Reports/File/{id}/Recover | Recover specified file from bin
[**reportsRenameFile**](ReportsApi.md#reportsRenameFile) | **PUT** /api/rp/v1/Reports/File/{id}/Rename | Rename a file
[**reportsStaticPreview**](ReportsApi.md#reportsStaticPreview) | **POST** /api/rp/v1/Reports/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp
[**reportsUpdateIcon**](ReportsApi.md#reportsUpdateIcon) | **PUT** /api/rp/v1/Reports/File/{id}/Icon | Update a files&#39;s icon
[**reportsUpdatePermissions**](ReportsApi.md#reportsUpdatePermissions) | **POST** /api/rp/v1/Reports/File/{id}/permissions | Update permissions
[**reportsUpdateTags**](ReportsApi.md#reportsUpdateTags) | **PUT** /api/rp/v1/Reports/File/{id}/UpdateTags | Update tags
[**reportsUploadFile**](ReportsApi.md#reportsUploadFile) | **POST** /api/rp/v1/Reports/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!
[**reportsUploadFileV2**](ReportsApi.md#reportsUploadFileV2) | **POST** /api/rp/v2/Reports/Folder/{id}/File | Alternative api for upload a file to the specified folder!


<a id="reportFolderAndFileClearRecycleBin"></a>
# **reportFolderAndFileClearRecycleBin**
> reportFolderAndFileClearRecycleBin(subscriptionId)

Delete all folders and files from recycle bin

User with a Delete RecycleBin permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
try {
    apiInstance.reportFolderAndFileClearRecycleBin(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileClearRecycleBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileClearRecycleBin")
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

<a id="reportFolderAndFileCopyFiles"></a>
# **reportFolderAndFileCopyFiles**
> reportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

Copy folders and files to a specified folder

User with a Get permission for a files and Create permission for a destination folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.reportFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileCopyFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileCopyFiles")
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

<a id="reportFolderAndFileCountRecycleBinFoldersAndFiles"></a>
# **reportFolderAndFileCountRecycleBinFoldersAndFiles**
> CountVM reportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)

Count all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CountVM = apiInstance.reportFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileCountRecycleBinFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileCountRecycleBinFoldersAndFiles")
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

<a id="reportFolderAndFileDeleteFiles"></a>
# **reportFolderAndFileDeleteFiles**
> reportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

Delete folders and files

User with a Delete permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.reportFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileDeleteFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileDeleteFiles")
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

<a id="reportFolderAndFileGetCount"></a>
# **reportFolderAndFileGetCount**
> CountVM reportFolderAndFileGetCount(id, searchPattern, useRegex)

Get count of files and folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
val useRegex : kotlin.Boolean = true // kotlin.Boolean | set this to true if you want to use regular expression to search
try {
    val result : CountVM = apiInstance.reportFolderAndFileGetCount(id, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileGetCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileGetCount")
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

<a id="reportFolderAndFileGetFoldersAndFiles"></a>
# **reportFolderAndFileGetFoldersAndFiles**
> FilesVM reportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be returned
val orderBy : FileSorting =  // FileSorting | indicates a field to sort by
val desc : kotlin.Boolean = true // kotlin.Boolean | indicates if sorting is descending
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.reportFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileGetFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileGetFoldersAndFiles")
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

<a id="reportFolderAndFileGetRecycleBinFoldersAndFiles"></a>
# **reportFolderAndFileGetRecycleBinFoldersAndFiles**
> FilesVM reportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val skip : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be returned
val orderBy : FileSorting =  // FileSorting | indicates a field to sort by
val desc : kotlin.Boolean = true // kotlin.Boolean | indicates if sorting is descending
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.reportFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileGetRecycleBinFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileGetRecycleBinFoldersAndFiles")
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

<a id="reportFolderAndFileMoveFiles"></a>
# **reportFolderAndFileMoveFiles**
> reportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

Move folders and files to a specified folder

User with a Update Place permission for a files and Create permission for a destination folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.reportFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileMoveFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileMoveFiles")
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

<a id="reportFolderAndFileMoveFilesToBin"></a>
# **reportFolderAndFileMoveFilesToBin**
> reportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

Move folders and files to bin

User with a Delete permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.reportFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileMoveFilesToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileMoveFilesToBin")
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

<a id="reportFolderAndFileRecoverAllFromRecycleBin"></a>
# **reportFolderAndFileRecoverAllFromRecycleBin**
> reportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

Recover all folders and files from recycle bin

User with a Create RecycleBin permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
try {
    apiInstance.reportFolderAndFileRecoverAllFromRecycleBin(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileRecoverAllFromRecycleBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileRecoverAllFromRecycleBin")
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

<a id="reportFolderAndFileRecoverFiles"></a>
# **reportFolderAndFileRecoverFiles**
> reportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

Recover folders and files from bin

User with a SubscriptionCreate permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.reportFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFolderAndFileRecoverFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFolderAndFileRecoverFiles")
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

<a id="reportFoldersCalculateFolderSize"></a>
# **reportFoldersCalculateFolderSize**
> FolderSizeVM reportFoldersCalculateFolderSize(id)

Get specified folder, calculate it&#39;s size

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : FolderSizeVM = apiInstance.reportFoldersCalculateFolderSize(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersCalculateFolderSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersCalculateFolderSize")
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

<a id="reportFoldersCopyFolder"></a>
# **reportFoldersCopyFolder**
> FileVM reportFoldersCopyFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | moving folder id
val folderId : kotlin.String = folderId_example // kotlin.String | destination folder id
try {
    val result : FileVM = apiInstance.reportFoldersCopyFolder(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersCopyFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersCopyFolder")
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

<a id="reportFoldersDeleteFolder"></a>
# **reportFoldersDeleteFolder**
> reportFoldersDeleteFolder(id)

Delete specified folder

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    apiInstance.reportFoldersDeleteFolder(id)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersDeleteFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersDeleteFolder")
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

<a id="reportFoldersExport"></a>
# **reportFoldersExport**
> FileVM reportFoldersExport(id, exportReportVM)

Export specified report folder to a specified format

User with Execute Export permission on report folder and  Create Entity on an export folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | report folder id
val exportReportVM : ExportReportVM =  // ExportReportVM | export parameters
try {
    val result : FileVM = apiInstance.reportFoldersExport(id, exportReportVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| report folder id |
 **exportReportVM** | [**ExportReportVM**](ExportReportVM.md)| export parameters | [optional]

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

<a id="reportFoldersGetBreadcrumbs"></a>
# **reportFoldersGetBreadcrumbs**
> BreadcrumbsVM reportFoldersGetBreadcrumbs(id)

Get specified folder breadcrumbs

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : BreadcrumbsVM = apiInstance.reportFoldersGetBreadcrumbs(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetBreadcrumbs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetBreadcrumbs")
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

<a id="reportFoldersGetFolder"></a>
# **reportFoldersGetFolder**
> FileVM reportFoldersGetFolder(id)

Get specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : FileVM = apiInstance.reportFoldersGetFolder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetFolder")
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

<a id="reportFoldersGetFolders"></a>
# **reportFoldersGetFolders**
> FilesVM reportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders from specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of files, that have to be returned
val orderBy : FileSorting =  // FileSorting | 
val desc : kotlin.Boolean = true // kotlin.Boolean | 
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.reportFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetFolders")
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

<a id="reportFoldersGetFoldersCount"></a>
# **reportFoldersGetFoldersCount**
> CountVM reportFoldersGetFoldersCount(id)

Get count of folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : CountVM = apiInstance.reportFoldersGetFoldersCount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetFoldersCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetFoldersCount")
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

<a id="reportFoldersGetOrCreate"></a>
# **reportFoldersGetOrCreate**
> FileVM reportFoldersGetOrCreate(name, subscriptionId, parentId)

Get specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val name : kotlin.String = name_example // kotlin.String | folder name
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId
val parentId : kotlin.String = parentId_example // kotlin.String | parent folder id
try {
    val result : FileVM = apiInstance.reportFoldersGetOrCreate(name, subscriptionId, parentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetOrCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetOrCreate")
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

<a id="reportFoldersGetPermissions"></a>
# **reportFoldersGetPermissions**
> FilePermissionsVM reportFoldersGetPermissions(id)

Get all folder permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FilePermissionsVM = apiInstance.reportFoldersGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetPermissions")
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

<a id="reportFoldersGetRootFolder"></a>
# **reportFoldersGetRootFolder**
> FileVM reportFoldersGetRootFolder(subscriptionId)

Get user&#39;s root folder (without parents)

&gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
try {
    val result : FileVM = apiInstance.reportFoldersGetRootFolder(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersGetRootFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersGetRootFolder")
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

<a id="reportFoldersMoveFolder"></a>
# **reportFoldersMoveFolder**
> FileVM reportFoldersMoveFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | moving folder id
val folderId : kotlin.String = folderId_example // kotlin.String | destination folder id
try {
    val result : FileVM = apiInstance.reportFoldersMoveFolder(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersMoveFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersMoveFolder")
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

<a id="reportFoldersMoveFolderToBin"></a>
# **reportFoldersMoveFolderToBin**
> reportFoldersMoveFolderToBin(id)

Move specified folder to recycle bin

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    apiInstance.reportFoldersMoveFolderToBin(id)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersMoveFolderToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersMoveFolderToBin")
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

<a id="reportFoldersPostFolder"></a>
# **reportFoldersPostFolder**
> FileVM reportFoldersPostFolder(id, reportFolderCreateVM)

Create folder

User with a Create Entity permisison can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of parent folder id
val reportFolderCreateVM : ReportFolderCreateVM =  // ReportFolderCreateVM | create VM
try {
    val result : FileVM = apiInstance.reportFoldersPostFolder(id, reportFolderCreateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersPostFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersPostFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of parent folder id |
 **reportFolderCreateVM** | [**ReportFolderCreateVM**](ReportFolderCreateVM.md)| create VM | [optional]

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

<a id="reportFoldersRecoverFolder"></a>
# **reportFoldersRecoverFolder**
> reportFoldersRecoverFolder(id, recoveryPath)

Recover specified folder

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val recoveryPath : kotlin.String = recoveryPath_example // kotlin.String | 
try {
    apiInstance.reportFoldersRecoverFolder(id, recoveryPath)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersRecoverFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersRecoverFolder")
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

<a id="reportFoldersRenameFolder"></a>
# **reportFoldersRenameFolder**
> FileVM reportFoldersRenameFolder(id, folderRenameVM)

Rename a folder

User with a Update Name permision can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val folderRenameVM : FolderRenameVM =  // FolderRenameVM | 
try {
    val result : FileVM = apiInstance.reportFoldersRenameFolder(id, folderRenameVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersRenameFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersRenameFolder")
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

<a id="reportFoldersUpdateIcon"></a>
# **reportFoldersUpdateIcon**
> FileVM reportFoldersUpdateIcon(id, folderIconVM)

Update a folder&#39;s icon

User with a Update Icon permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val folderIconVM : FolderIconVM =  // FolderIconVM | Update icon model
try {
    val result : FileVM = apiInstance.reportFoldersUpdateIcon(id, folderIconVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersUpdateIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersUpdateIcon")
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

<a id="reportFoldersUpdatePermissions"></a>
# **reportFoldersUpdatePermissions**
> reportFoldersUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateFilePermissionsVM : UpdateFilePermissionsVM =  // UpdateFilePermissionsVM | 
try {
    apiInstance.reportFoldersUpdatePermissions(id, updateFilePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersUpdatePermissions")
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

<a id="reportFoldersUpdateTags"></a>
# **reportFoldersUpdateTags**
> FileVM reportFoldersUpdateTags(id, folderTagsUpdateVM)

Update tags

User with a Update Tags permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val folderTagsUpdateVM : FolderTagsUpdateVM =  // FolderTagsUpdateVM | 
try {
    val result : FileVM = apiInstance.reportFoldersUpdateTags(id, folderTagsUpdateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportFoldersUpdateTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportFoldersUpdateTags")
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

<a id="reportsCopyFile"></a>
# **reportsCopyFile**
> ReportVM reportsCopyFile(id, folderId)

Copy file to a specified folder

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val folderId : kotlin.String = folderId_example // kotlin.String | folder id
try {
    val result : ReportVM = apiInstance.reportsCopyFile(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsCopyFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsCopyFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **folderId** | **kotlin.String**| folder id |

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reportsCreateSharingKey"></a>
# **reportsCreateSharingKey**
> FileSharingKeysVM reportsCreateSharingKey(id, createFileShareVM)

Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val createFileShareVM : CreateFileShareVM =  // CreateFileShareVM | parameters for sharing key creation
try {
    val result : FileSharingKeysVM = apiInstance.reportsCreateSharingKey(id, createFileShareVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsCreateSharingKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsCreateSharingKey")
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

<a id="reportsDeleteFile"></a>
# **reportsDeleteFile**
> reportsDeleteFile(id)

Delete specified file

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    apiInstance.reportsDeleteFile(id)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsDeleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsDeleteFile")
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

<a id="reportsDeleteSharingKey"></a>
# **reportsDeleteSharingKey**
> reportsDeleteSharingKey(id, key)

Deletes a sharing key, making links, that utilizing it no longer work

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val key : kotlin.String = key_example // kotlin.String | key to delete
try {
    apiInstance.reportsDeleteSharingKey(id, key)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsDeleteSharingKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsDeleteSharingKey")
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

<a id="reportsExport"></a>
# **reportsExport**
> ExportVM reportsExport(id, exportReportVM)

Export specified report to a specified format

User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | report id
val exportReportVM : ExportReportVM =  // ExportReportVM | export parameters
try {
    val result : ExportVM = apiInstance.reportsExport(id, exportReportVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| report id |
 **exportReportVM** | [**ExportReportVM**](ExportReportVM.md)| export parameters | [optional]

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

<a id="reportsGetFile"></a>
# **reportsGetFile**
> ReportVM reportsGetFile(id)

Get specified file

User with Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    val result : ReportVM = apiInstance.reportsGetFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsGetFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsGetFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reportsGetFileHistory"></a>
# **reportsGetFileHistory**
> AuditActionsVM reportsGetFileHistory(id, skip, take)

Returns list of actions, performed on this file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AuditActionsVM = apiInstance.reportsGetFileHistory(id, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsGetFileHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsGetFileHistory")
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

<a id="reportsGetFilesCount"></a>
# **reportsGetFilesCount**
> CountVM reportsGetFilesCount(id)

Get count of files what contains in a specified folder

User with Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : CountVM = apiInstance.reportsGetFilesCount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsGetFilesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsGetFilesCount")
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

<a id="reportsGetFilesList"></a>
# **reportsGetFilesList**
> ReportsVM reportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of files, that have to be returned
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val orderBy : FileSorting =  // FileSorting | 
val desc : kotlin.Boolean = true // kotlin.Boolean | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : ReportsVM = apiInstance.reportsGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsGetFilesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsGetFilesList")
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

[**ReportsVM**](ReportsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reportsGetPermissions"></a>
# **reportsGetPermissions**
> FilePermissionsVM reportsGetPermissions(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FilePermissionsVM = apiInstance.reportsGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsGetPermissions")
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

<a id="reportsGetSharingKeys"></a>
# **reportsGetSharingKeys**
> FileSharingKeysVM reportsGetSharingKeys(id)

Returns all sharing keys, associated with the file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    val result : FileSharingKeysVM = apiInstance.reportsGetSharingKeys(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsGetSharingKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsGetSharingKeys")
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

<a id="reportsMoveFile"></a>
# **reportsMoveFile**
> ReportVM reportsMoveFile(id, folderId)

Move file to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val folderId : kotlin.String = folderId_example // kotlin.String | folder id
try {
    val result : ReportVM = apiInstance.reportsMoveFile(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsMoveFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsMoveFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **folderId** | **kotlin.String**| folder id |

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reportsMoveFileToBin"></a>
# **reportsMoveFileToBin**
> reportsMoveFileToBin(id)

Move specified file to recycle bin

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    apiInstance.reportsMoveFileToBin(id)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsMoveFileToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsMoveFileToBin")
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

<a id="reportsRecoverFile"></a>
# **reportsRecoverFile**
> reportsRecoverFile(id, recoveryPath)

Recover specified file from bin

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | file id
val recoveryPath : kotlin.String = recoveryPath_example // kotlin.String | 
try {
    apiInstance.reportsRecoverFile(id, recoveryPath)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsRecoverFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsRecoverFile")
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

<a id="reportsRenameFile"></a>
# **reportsRenameFile**
> ReportVM reportsRenameFile(id, fileRenameVM)

Rename a file

User with Update Name permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileRenameVM : FileRenameVM =  // FileRenameVM | 
try {
    val result : ReportVM = apiInstance.reportsRenameFile(id, fileRenameVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsRenameFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsRenameFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileRenameVM** | [**FileRenameVM**](FileRenameVM.md)|  | [optional]

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reportsStaticPreview"></a>
# **reportsStaticPreview**
> ExportVM reportsStaticPreview(id, previewReportVM)

Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | template id
val previewReportVM : PreviewReportVM =  // PreviewReportVM | Model with parameters
try {
    val result : ExportVM = apiInstance.reportsStaticPreview(id, previewReportVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsStaticPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsStaticPreview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **previewReportVM** | [**PreviewReportVM**](PreviewReportVM.md)| Model with parameters | [optional]

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

<a id="reportsUpdateIcon"></a>
# **reportsUpdateIcon**
> ReportVM reportsUpdateIcon(id, fileIconVM)

Update a files&#39;s icon

User with Update Icon permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileIconVM : FileIconVM =  // FileIconVM | 
try {
    val result : ReportVM = apiInstance.reportsUpdateIcon(id, fileIconVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsUpdateIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsUpdateIcon")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileIconVM** | [**FileIconVM**](FileIconVM.md)|  | [optional]

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reportsUpdatePermissions"></a>
# **reportsUpdatePermissions**
> reportsUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateFilePermissionsVM : UpdateFilePermissionsVM =  // UpdateFilePermissionsVM | 
try {
    apiInstance.reportsUpdatePermissions(id, updateFilePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsUpdatePermissions")
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

<a id="reportsUpdateTags"></a>
# **reportsUpdateTags**
> ReportVM reportsUpdateTags(id, fileTagsUpdateVM)

Update tags

User with Update Tags permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileTagsUpdateVM : FileTagsUpdateVM =  // FileTagsUpdateVM | 
try {
    val result : ReportVM = apiInstance.reportsUpdateTags(id, fileTagsUpdateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsUpdateTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsUpdateTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileTagsUpdateVM** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional]

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reportsUploadFile"></a>
# **reportsUploadFile**
> ReportVM reportsUploadFile(id, reportCreateVM)

Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!

User with Create Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val reportCreateVM : ReportCreateVM =  // ReportCreateVM | file's view model
try {
    val result : ReportVM = apiInstance.reportsUploadFile(id, reportCreateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsUploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsUploadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of folder |
 **reportCreateVM** | [**ReportCreateVM**](ReportCreateVM.md)| file&#39;s view model | [optional]

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reportsUploadFileV2"></a>
# **reportsUploadFileV2**
> ReportVM reportsUploadFileV2(id, fileContent, templateId, tags, icon)

Alternative api for upload a file to the specified folder!

User with Create Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = ReportsApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val fileContent : java.io.File = BINARY_DATA_HERE // java.io.File | 
val templateId : kotlin.String = templateId_example // kotlin.String | 
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val icon : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : ReportVM = apiInstance.reportsUploadFileV2(id, fileContent, templateId, tags, icon)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#reportsUploadFileV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#reportsUploadFileV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of folder |
 **fileContent** | **java.io.File**|  |
 **templateId** | **kotlin.String**|  | [optional]
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **icon** | **java.io.File**|  | [optional]

### Return type

[**ReportVM**](ReportVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

