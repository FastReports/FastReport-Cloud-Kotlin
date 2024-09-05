# TemplatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templateFolderAndFileClearRecycleBin**](TemplatesApi.md#templateFolderAndFileClearRecycleBin) | **DELETE** /api/rp/v1/Templates/{subscriptionId}/ClearRecycleBin | Delete all folders and files from recycle bin
[**templateFolderAndFileCopyFiles**](TemplatesApi.md#templateFolderAndFileCopyFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/CopyFiles | Copy folders and files to a specified folder
[**templateFolderAndFileCountRecycleBinFoldersAndFiles**](TemplatesApi.md#templateFolderAndFileCountRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Templates/{subscriptionId}/CountRecycleBinFolderAndFiles | Count all folders and files from recycle bin
[**templateFolderAndFileDeleteFiles**](TemplatesApi.md#templateFolderAndFileDeleteFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/DeleteFiles | Delete folders and files
[**templateFolderAndFileGetCount**](TemplatesApi.md#templateFolderAndFileGetCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolderAndFiles | Get count of files and folders what contains in a specified folder
[**templateFolderAndFileGetFoldersAndFiles**](TemplatesApi.md#templateFolderAndFileGetFoldersAndFiles) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolderAndFiles | Get all folders and files from specified folder
[**templateFolderAndFileGetRecycleBinFoldersAndFiles**](TemplatesApi.md#templateFolderAndFileGetRecycleBinFoldersAndFiles) | **GET** /api/rp/v1/Templates/{subscriptionId}/ListRecycleBinFolderAndFiles | Get all folders and files from recycle bin
[**templateFolderAndFileMoveFiles**](TemplatesApi.md#templateFolderAndFileMoveFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/MoveFiles | Move folders and files to a specified folder
[**templateFolderAndFileMoveFilesToBin**](TemplatesApi.md#templateFolderAndFileMoveFilesToBin) | **POST** /api/rp/v1/Templates/{subscriptionId}/ToBin | Move folders and files to bin
[**templateFolderAndFileRecoverAllFromRecycleBin**](TemplatesApi.md#templateFolderAndFileRecoverAllFromRecycleBin) | **POST** /api/rp/v1/Templates/{subscriptionId}/RecoverRecycleBin | Recover all folders and files from recycle bin
[**templateFolderAndFileRecoverFiles**](TemplatesApi.md#templateFolderAndFileRecoverFiles) | **POST** /api/rp/v1/Templates/{subscriptionId}/RecoverFiles | Recover folders and files from bin
[**templateFoldersCalculateFolderSize**](TemplatesApi.md#templateFoldersCalculateFolderSize) | **GET** /api/rp/v1/Templates/Folder/{id}/size | Get specified folder, calculate it&#39;s size
[**templateFoldersCopyFolder**](TemplatesApi.md#templateFoldersCopyFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Copy/{folderId} | Move folder to a specified folder
[**templateFoldersDeleteFolder**](TemplatesApi.md#templateFoldersDeleteFolder) | **DELETE** /api/rp/v1/Templates/Folder/{id} | Delete specified folder
[**templateFoldersExport**](TemplatesApi.md#templateFoldersExport) | **POST** /api/rp/v1/Templates/Folder/{id}/Export | Export specified template folder to a specified format
[**templateFoldersGetBreadcrumbs**](TemplatesApi.md#templateFoldersGetBreadcrumbs) | **GET** /api/rp/v1/Templates/Folder/{id}/Breadcrumbs | Get specified folder breadcrumbs
[**templateFoldersGetFolder**](TemplatesApi.md#templateFoldersGetFolder) | **GET** /api/rp/v1/Templates/Folder/{id} | Get specified folder
[**templateFoldersGetFolders**](TemplatesApi.md#templateFoldersGetFolders) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFolders | Get all folders from specified folder
[**templateFoldersGetFoldersCount**](TemplatesApi.md#templateFoldersGetFoldersCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFolders | Get count of folders what contains in a specified folder
[**templateFoldersGetOrCreate**](TemplatesApi.md#templateFoldersGetOrCreate) | **GET** /api/rp/v1/Templates/Folder/getOrCreate | Get specified folder
[**templateFoldersGetPermissions**](TemplatesApi.md#templateFoldersGetPermissions) | **GET** /api/rp/v1/Templates/Folder/{id}/permissions | Get all folder permissions
[**templateFoldersGetRootFolder**](TemplatesApi.md#templateFoldersGetRootFolder) | **GET** /api/rp/v1/Templates/Root | Get user&#39;s root folder (without parents)
[**templateFoldersMoveFolder**](TemplatesApi.md#templateFoldersMoveFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Move/{folderId} | Move folder to a specified folder
[**templateFoldersMoveFolderToBin**](TemplatesApi.md#templateFoldersMoveFolderToBin) | **DELETE** /api/rp/v1/Templates/Folder/{id}/ToBin | Move specified folder to recycle bin
[**templateFoldersPostFolder**](TemplatesApi.md#templateFoldersPostFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Folder | Create folder
[**templateFoldersPrepare**](TemplatesApi.md#templateFoldersPrepare) | **POST** /api/rp/v1/Templates/Folder/{id}/Prepare | Prepare specified template folder to report folder
[**templateFoldersRecoverFolder**](TemplatesApi.md#templateFoldersRecoverFolder) | **POST** /api/rp/v1/Templates/Folder/{id}/Recover | Recover specified folder
[**templateFoldersRenameFolder**](TemplatesApi.md#templateFoldersRenameFolder) | **PUT** /api/rp/v1/Templates/Folder/{id}/Rename | Rename a folder
[**templateFoldersUpdateIcon**](TemplatesApi.md#templateFoldersUpdateIcon) | **PUT** /api/rp/v1/Templates/Folder/{id}/Icon | Update a folder&#39;s icon
[**templateFoldersUpdatePermissions**](TemplatesApi.md#templateFoldersUpdatePermissions) | **POST** /api/rp/v1/Templates/{id}/permissions | Update permissions
[**templateFoldersUpdateTags**](TemplatesApi.md#templateFoldersUpdateTags) | **PUT** /api/rp/v1/Templates/Folder/{id}/UpdateTags | Update tags
[**templatesCopyFile**](TemplatesApi.md#templatesCopyFile) | **POST** /api/rp/v1/Templates/File/{id}/Copy/{folderId} | Copy file to a specified folder
[**templatesCreateSharingKey**](TemplatesApi.md#templatesCreateSharingKey) | **POST** /api/rp/v1/Templates/File/{id}/sharingKey | Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)
[**templatesDeleteFile**](TemplatesApi.md#templatesDeleteFile) | **DELETE** /api/rp/v1/Templates/File/{id} | Delete specified file
[**templatesDeleteSharingKey**](TemplatesApi.md#templatesDeleteSharingKey) | **DELETE** /api/rp/v1/Templates/File/{id}/sharingKey | Deletes a sharing key, making links, that utilizing it no longer work
[**templatesExport**](TemplatesApi.md#templatesExport) | **POST** /api/rp/v1/Templates/File/{id}/Export | Export specified report template to a specified format
[**templatesGetFile**](TemplatesApi.md#templatesGetFile) | **GET** /api/rp/v1/Templates/File/{id} | Get specified file
[**templatesGetFileHistory**](TemplatesApi.md#templatesGetFileHistory) | **GET** /api/rp/v1/Templates/File/{id}/History | Returns list of actions, performed on this file
[**templatesGetFilesCount**](TemplatesApi.md#templatesGetFilesCount) | **GET** /api/rp/v1/Templates/Folder/{id}/CountFiles | Get count of files what contains in a specified folder
[**templatesGetFilesList**](TemplatesApi.md#templatesGetFilesList) | **GET** /api/rp/v1/Templates/Folder/{id}/ListFiles | Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.
[**templatesGetPermissions**](TemplatesApi.md#templatesGetPermissions) | **GET** /api/rp/v1/Templates/File/{id}/permissions | 
[**templatesGetSharingKeys**](TemplatesApi.md#templatesGetSharingKeys) | **GET** /api/rp/v1/Templates/File/{id}/sharingKeys | Returns all sharing keys, associated with the file
[**templatesMoveFile**](TemplatesApi.md#templatesMoveFile) | **POST** /api/rp/v1/Templates/File/{id}/Move/{folderId} | Move file to a specified folder
[**templatesMoveFileToBin**](TemplatesApi.md#templatesMoveFileToBin) | **DELETE** /api/rp/v1/Templates/File/{id}/ToBin | Move specified file to recycle bin
[**templatesPrepare**](TemplatesApi.md#templatesPrepare) | **POST** /api/rp/v1/Templates/File/{id}/Prepare | Prepare specified template to report
[**templatesRecoverFile**](TemplatesApi.md#templatesRecoverFile) | **POST** /api/rp/v1/Templates/File/{id}/Recover | Recover specified file from bin
[**templatesRenameFile**](TemplatesApi.md#templatesRenameFile) | **PUT** /api/rp/v1/Templates/File/{id}/Rename | Rename a file
[**templatesStaticPreview**](TemplatesApi.md#templatesStaticPreview) | **POST** /api/rp/v1/Templates/File/{id}/StaticPreview | Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp
[**templatesUpdateContent**](TemplatesApi.md#templatesUpdateContent) | **PUT** /api/rp/v1/Templates/File/{id}/Content | Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead!
[**templatesUpdateContentV2**](TemplatesApi.md#templatesUpdateContentV2) | **PUT** /api/rp/v2/Templates/File/{id}/Content | Updates contnet of the template.
[**templatesUpdateIcon**](TemplatesApi.md#templatesUpdateIcon) | **PUT** /api/rp/v1/Templates/File/{id}/Icon | Update a files&#39;s icon
[**templatesUpdatePermissions**](TemplatesApi.md#templatesUpdatePermissions) | **POST** /api/rp/v1/Templates/File/{id}/permissions | Update permissions
[**templatesUpdateTags**](TemplatesApi.md#templatesUpdateTags) | **PUT** /api/rp/v1/Templates/File/{id}/UpdateTags | Update tags
[**templatesUploadFile**](TemplatesApi.md#templatesUploadFile) | **POST** /api/rp/v1/Templates/Folder/{id}/File | Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!
[**templatesUploadFileV2**](TemplatesApi.md#templatesUploadFileV2) | **POST** /api/rp/v2/Templates/Folder/{id}/File | Alternative api for upload a file to the specified folder!


<a id="templateFolderAndFileClearRecycleBin"></a>
# **templateFolderAndFileClearRecycleBin**
> templateFolderAndFileClearRecycleBin(subscriptionId)

Delete all folders and files from recycle bin

User with a Delete RecycleBin permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
try {
    apiInstance.templateFolderAndFileClearRecycleBin(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileClearRecycleBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileClearRecycleBin")
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

<a id="templateFolderAndFileCopyFiles"></a>
# **templateFolderAndFileCopyFiles**
> templateFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)

Copy folders and files to a specified folder

User with a Get permission for a files and Create permission for a destination folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.templateFolderAndFileCopyFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileCopyFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileCopyFiles")
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

<a id="templateFolderAndFileCountRecycleBinFoldersAndFiles"></a>
# **templateFolderAndFileCountRecycleBinFoldersAndFiles**
> CountVM templateFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)

Count all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CountVM = apiInstance.templateFolderAndFileCountRecycleBinFoldersAndFiles(subscriptionId, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileCountRecycleBinFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileCountRecycleBinFoldersAndFiles")
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

<a id="templateFolderAndFileDeleteFiles"></a>
# **templateFolderAndFileDeleteFiles**
> templateFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)

Delete folders and files

User with a Delete permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.templateFolderAndFileDeleteFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileDeleteFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileDeleteFiles")
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

<a id="templateFolderAndFileGetCount"></a>
# **templateFolderAndFileGetCount**
> CountVM templateFolderAndFileGetCount(id, searchPattern, useRegex)

Get count of files and folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | string, that must be incuded in file or folder name to be counted <br />              (leave undefined to count all files and folders)
val useRegex : kotlin.Boolean = true // kotlin.Boolean | set this to true if you want to use regular expression to search
try {
    val result : CountVM = apiInstance.templateFolderAndFileGetCount(id, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileGetCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileGetCount")
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

<a id="templateFolderAndFileGetFoldersAndFiles"></a>
# **templateFolderAndFileGetFoldersAndFiles**
> FilesVM templateFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be returned
val orderBy : FileSorting =  // FileSorting | indicates a field to sort by
val desc : kotlin.Boolean = true // kotlin.Boolean | indicates if sorting is descending
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.templateFolderAndFileGetFoldersAndFiles(id, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileGetFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileGetFoldersAndFiles")
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

<a id="templateFolderAndFileGetRecycleBinFoldersAndFiles"></a>
# **templateFolderAndFileGetRecycleBinFoldersAndFiles**
> FilesVM templateFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders and files from recycle bin

User with a Get DeletedFiles permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val skip : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of folder and files, that have to be returned
val orderBy : FileSorting =  // FileSorting | indicates a field to sort by
val desc : kotlin.Boolean = true // kotlin.Boolean | indicates if sorting is descending
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.templateFolderAndFileGetRecycleBinFoldersAndFiles(subscriptionId, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileGetRecycleBinFoldersAndFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileGetRecycleBinFoldersAndFiles")
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

<a id="templateFolderAndFileMoveFiles"></a>
# **templateFolderAndFileMoveFiles**
> templateFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)

Move folders and files to a specified folder

User with a Update Place permission for a files and Create permission for a destination folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.templateFolderAndFileMoveFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileMoveFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileMoveFiles")
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

<a id="templateFolderAndFileMoveFilesToBin"></a>
# **templateFolderAndFileMoveFilesToBin**
> templateFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)

Move folders and files to bin

User with a Delete permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.templateFolderAndFileMoveFilesToBin(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileMoveFilesToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileMoveFilesToBin")
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

<a id="templateFolderAndFileRecoverAllFromRecycleBin"></a>
# **templateFolderAndFileRecoverAllFromRecycleBin**
> templateFolderAndFileRecoverAllFromRecycleBin(subscriptionId)

Recover all folders and files from recycle bin

User with a Create RecycleBin permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
try {
    apiInstance.templateFolderAndFileRecoverAllFromRecycleBin(subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileRecoverAllFromRecycleBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileRecoverAllFromRecycleBin")
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

<a id="templateFolderAndFileRecoverFiles"></a>
# **templateFolderAndFileRecoverFiles**
> templateFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)

Recover folders and files from bin

User with a SubscriptionCreate permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of current subscription
val selectedFilesVM : SelectedFilesVM =  // SelectedFilesVM | VM with files' ids and params of their destination
try {
    apiInstance.templateFolderAndFileRecoverFiles(subscriptionId, selectedFilesVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFolderAndFileRecoverFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFolderAndFileRecoverFiles")
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

<a id="templateFoldersCalculateFolderSize"></a>
# **templateFoldersCalculateFolderSize**
> FolderSizeVM templateFoldersCalculateFolderSize(id)

Get specified folder, calculate it&#39;s size

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : FolderSizeVM = apiInstance.templateFoldersCalculateFolderSize(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersCalculateFolderSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersCalculateFolderSize")
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

<a id="templateFoldersCopyFolder"></a>
# **templateFoldersCopyFolder**
> FileVM templateFoldersCopyFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | moving folder id
val folderId : kotlin.String = folderId_example // kotlin.String | destination folder id
try {
    val result : FileVM = apiInstance.templateFoldersCopyFolder(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersCopyFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersCopyFolder")
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

<a id="templateFoldersDeleteFolder"></a>
# **templateFoldersDeleteFolder**
> templateFoldersDeleteFolder(id)

Delete specified folder

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    apiInstance.templateFoldersDeleteFolder(id)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersDeleteFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersDeleteFolder")
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

<a id="templateFoldersExport"></a>
# **templateFoldersExport**
> FileVM templateFoldersExport(id, exportTemplateVM)

Export specified template folder to a specified format

User with Execute Export permission on template folder and  Create Entity on an export folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template folder id
val exportTemplateVM : ExportTemplateVM =  // ExportTemplateVM | export parameters (string only)
try {
    val result : FileVM = apiInstance.templateFoldersExport(id, exportTemplateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template folder id |
 **exportTemplateVM** | [**ExportTemplateVM**](ExportTemplateVM.md)| export parameters (string only) | [optional]

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

<a id="templateFoldersGetBreadcrumbs"></a>
# **templateFoldersGetBreadcrumbs**
> BreadcrumbsVM templateFoldersGetBreadcrumbs(id)

Get specified folder breadcrumbs

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : BreadcrumbsVM = apiInstance.templateFoldersGetBreadcrumbs(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetBreadcrumbs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetBreadcrumbs")
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

<a id="templateFoldersGetFolder"></a>
# **templateFoldersGetFolder**
> FileVM templateFoldersGetFolder(id)

Get specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : FileVM = apiInstance.templateFoldersGetFolder(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetFolder")
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

<a id="templateFoldersGetFolders"></a>
# **templateFoldersGetFolders**
> FilesVM templateFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)

Get all folders from specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of files, that have to be returned
val orderBy : FileSorting =  // FileSorting | 
val desc : kotlin.Boolean = true // kotlin.Boolean | 
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FilesVM = apiInstance.templateFoldersGetFolders(id, skip, take, orderBy, desc, searchPattern, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetFolders")
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

<a id="templateFoldersGetFoldersCount"></a>
# **templateFoldersGetFoldersCount**
> CountVM templateFoldersGetFoldersCount(id)

Get count of folders what contains in a specified folder

User with a Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : CountVM = apiInstance.templateFoldersGetFoldersCount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetFoldersCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetFoldersCount")
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

<a id="templateFoldersGetOrCreate"></a>
# **templateFoldersGetOrCreate**
> FileVM templateFoldersGetOrCreate(name, subscriptionId, parentId)

Get specified folder

User with a Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val name : kotlin.String = name_example // kotlin.String | folder name
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscriptionId
val parentId : kotlin.String = parentId_example // kotlin.String | parent folder id
try {
    val result : FileVM = apiInstance.templateFoldersGetOrCreate(name, subscriptionId, parentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetOrCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetOrCreate")
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

<a id="templateFoldersGetPermissions"></a>
# **templateFoldersGetPermissions**
> FilePermissionsVM templateFoldersGetPermissions(id)

Get all folder permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FilePermissionsVM = apiInstance.templateFoldersGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetPermissions")
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

<a id="templateFoldersGetRootFolder"></a>
# **templateFoldersGetRootFolder**
> FileVM templateFoldersGetRootFolder(subscriptionId)

Get user&#39;s root folder (without parents)

&gt; Breakchange. Now user model doesn&#39;t contain a root folders.  This method can return error 400 and 404 when subscription is not found.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | 
try {
    val result : FileVM = apiInstance.templateFoldersGetRootFolder(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersGetRootFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersGetRootFolder")
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

<a id="templateFoldersMoveFolder"></a>
# **templateFoldersMoveFolder**
> FileVM templateFoldersMoveFolder(id, folderId)

Move folder to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | moving folder id
val folderId : kotlin.String = folderId_example // kotlin.String | destination folder id
try {
    val result : FileVM = apiInstance.templateFoldersMoveFolder(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersMoveFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersMoveFolder")
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

<a id="templateFoldersMoveFolderToBin"></a>
# **templateFoldersMoveFolderToBin**
> templateFoldersMoveFolderToBin(id)

Move specified folder to recycle bin

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    apiInstance.templateFoldersMoveFolderToBin(id)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersMoveFolderToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersMoveFolderToBin")
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

<a id="templateFoldersPostFolder"></a>
# **templateFoldersPostFolder**
> FileVM templateFoldersPostFolder(id, templateFolderCreateVM)

Create folder

User with a Create Entity permisison can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of parent folder id
val templateFolderCreateVM : TemplateFolderCreateVM =  // TemplateFolderCreateVM | create VM
try {
    val result : FileVM = apiInstance.templateFoldersPostFolder(id, templateFolderCreateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersPostFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersPostFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of parent folder id |
 **templateFolderCreateVM** | [**TemplateFolderCreateVM**](TemplateFolderCreateVM.md)| create VM | [optional]

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

<a id="templateFoldersPrepare"></a>
# **templateFoldersPrepare**
> FileVM templateFoldersPrepare(id, prepareTemplateVM)

Prepare specified template folder to report folder

User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template id
val prepareTemplateVM : PrepareTemplateVM =  // PrepareTemplateVM | Template folder prepare view model
try {
    val result : FileVM = apiInstance.templateFoldersPrepare(id, prepareTemplateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersPrepare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersPrepare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **prepareTemplateVM** | [**PrepareTemplateVM**](PrepareTemplateVM.md)| Template folder prepare view model | [optional]

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

<a id="templateFoldersRecoverFolder"></a>
# **templateFoldersRecoverFolder**
> templateFoldersRecoverFolder(id, recoveryPath)

Recover specified folder

User with a Delete Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val recoveryPath : kotlin.String = recoveryPath_example // kotlin.String | 
try {
    apiInstance.templateFoldersRecoverFolder(id, recoveryPath)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersRecoverFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersRecoverFolder")
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

<a id="templateFoldersRenameFolder"></a>
# **templateFoldersRenameFolder**
> FileVM templateFoldersRenameFolder(id, folderRenameVM)

Rename a folder

User with a Update Name permision can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val folderRenameVM : FolderRenameVM =  // FolderRenameVM | 
try {
    val result : FileVM = apiInstance.templateFoldersRenameFolder(id, folderRenameVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersRenameFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersRenameFolder")
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

<a id="templateFoldersUpdateIcon"></a>
# **templateFoldersUpdateIcon**
> FileVM templateFoldersUpdateIcon(id, folderIconVM)

Update a folder&#39;s icon

User with a Update Icon permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val folderIconVM : FolderIconVM =  // FolderIconVM | Update icon model
try {
    val result : FileVM = apiInstance.templateFoldersUpdateIcon(id, folderIconVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersUpdateIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersUpdateIcon")
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

<a id="templateFoldersUpdatePermissions"></a>
# **templateFoldersUpdatePermissions**
> templateFoldersUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateFilePermissionsVM : UpdateFilePermissionsVM =  // UpdateFilePermissionsVM | 
try {
    apiInstance.templateFoldersUpdatePermissions(id, updateFilePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersUpdatePermissions")
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

<a id="templateFoldersUpdateTags"></a>
# **templateFoldersUpdateTags**
> FileVM templateFoldersUpdateTags(id, folderTagsUpdateVM)

Update tags

User with a Update Tags permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val folderTagsUpdateVM : FolderTagsUpdateVM =  // FolderTagsUpdateVM | 
try {
    val result : FileVM = apiInstance.templateFoldersUpdateTags(id, folderTagsUpdateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templateFoldersUpdateTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templateFoldersUpdateTags")
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

<a id="templatesCopyFile"></a>
# **templatesCopyFile**
> TemplateVM templatesCopyFile(id, folderId)

Copy file to a specified folder

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
val folderId : kotlin.String = folderId_example // kotlin.String | folder id
try {
    val result : TemplateVM = apiInstance.templatesCopyFile(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesCopyFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesCopyFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **folderId** | **kotlin.String**| folder id |

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="templatesCreateSharingKey"></a>
# **templatesCreateSharingKey**
> FileSharingKeysVM templatesCreateSharingKey(id, createFileShareVM)

Create a new key, that can be used to share access to a file  (You need Administrate.Anon permission to create a new key)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
val createFileShareVM : CreateFileShareVM =  // CreateFileShareVM | parameters for sharing key creation
try {
    val result : FileSharingKeysVM = apiInstance.templatesCreateSharingKey(id, createFileShareVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesCreateSharingKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesCreateSharingKey")
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

<a id="templatesDeleteFile"></a>
# **templatesDeleteFile**
> templatesDeleteFile(id)

Delete specified file

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    apiInstance.templatesDeleteFile(id)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesDeleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesDeleteFile")
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

<a id="templatesDeleteSharingKey"></a>
# **templatesDeleteSharingKey**
> templatesDeleteSharingKey(id, key)

Deletes a sharing key, making links, that utilizing it no longer work

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
val key : kotlin.String = key_example // kotlin.String | key to delete
try {
    apiInstance.templatesDeleteSharingKey(id, key)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesDeleteSharingKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesDeleteSharingKey")
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

<a id="templatesExport"></a>
# **templatesExport**
> ExportVM templatesExport(id, exportTemplateVM)

Export specified report template to a specified format

User with Execute Export permission on prepared report and  Create Entity on an export folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template id
val exportTemplateVM : ExportTemplateVM =  // ExportTemplateVM | export parameters (string only)
try {
    val result : ExportVM = apiInstance.templatesExport(id, exportTemplateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **exportTemplateVM** | [**ExportTemplateVM**](ExportTemplateVM.md)| export parameters (string only) | [optional]

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

<a id="templatesGetFile"></a>
# **templatesGetFile**
> TemplateVM templatesGetFile(id)

Get specified file

User with Get Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    val result : TemplateVM = apiInstance.templatesGetFile(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesGetFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesGetFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="templatesGetFileHistory"></a>
# **templatesGetFileHistory**
> AuditActionsVM templatesGetFileHistory(id, skip, take)

Returns list of actions, performed on this file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AuditActionsVM = apiInstance.templatesGetFileHistory(id, skip, take)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesGetFileHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesGetFileHistory")
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

<a id="templatesGetFilesCount"></a>
# **templatesGetFilesCount**
> CountVM templatesGetFilesCount(id)

Get count of files what contains in a specified folder

User with Get Count permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
try {
    val result : CountVM = apiInstance.templatesGetFilesCount(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesGetFilesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesGetFilesCount")
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

<a id="templatesGetFilesList"></a>
# **templatesGetFilesList**
> TemplatesVM templatesGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)

Get all files from specified folder. &lt;br /&gt;  User with Get Entity permission can access this method. &lt;br /&gt;  The method will returns minimal infomration about the file: &lt;br /&gt;  id, name, size, editedTime, createdTime, tags, status, statusReason.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | folder id
val skip : kotlin.Int = 56 // kotlin.Int | number of files, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of files, that have to be returned
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
val orderBy : FileSorting =  // FileSorting | 
val desc : kotlin.Boolean = true // kotlin.Boolean | 
val useRegex : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : TemplatesVM = apiInstance.templatesGetFilesList(id, skip, take, searchPattern, orderBy, desc, useRegex)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesGetFilesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesGetFilesList")
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

[**TemplatesVM**](TemplatesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="templatesGetPermissions"></a>
# **templatesGetPermissions**
> FilePermissionsVM templatesGetPermissions(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : FilePermissionsVM = apiInstance.templatesGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesGetPermissions")
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

<a id="templatesGetSharingKeys"></a>
# **templatesGetSharingKeys**
> FileSharingKeysVM templatesGetSharingKeys(id)

Returns all sharing keys, associated with the file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    val result : FileSharingKeysVM = apiInstance.templatesGetSharingKeys(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesGetSharingKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesGetSharingKeys")
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

<a id="templatesMoveFile"></a>
# **templatesMoveFile**
> TemplateVM templatesMoveFile(id, folderId)

Move file to a specified folder

User with a Update Place permission for a folder and Create Entity  for a Parent Folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
val folderId : kotlin.String = folderId_example // kotlin.String | folder id
try {
    val result : TemplateVM = apiInstance.templatesMoveFile(id, folderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesMoveFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesMoveFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| file id |
 **folderId** | **kotlin.String**| folder id |

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="templatesMoveFileToBin"></a>
# **templatesMoveFileToBin**
> templatesMoveFileToBin(id)

Move specified file to recycle bin

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
try {
    apiInstance.templatesMoveFileToBin(id)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesMoveFileToBin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesMoveFileToBin")
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

<a id="templatesPrepare"></a>
# **templatesPrepare**
> ReportVM templatesPrepare(id, prepareTemplateVM)

Prepare specified template to report

User with Execute Prepare permission on report and  Create Entity on a prepared report folder can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template id
val prepareTemplateVM : PrepareTemplateVM =  // PrepareTemplateVM | Template prepare view model
try {
    val result : ReportVM = apiInstance.templatesPrepare(id, prepareTemplateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesPrepare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesPrepare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **prepareTemplateVM** | [**PrepareTemplateVM**](PrepareTemplateVM.md)| Template prepare view model | [optional]

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

<a id="templatesRecoverFile"></a>
# **templatesRecoverFile**
> templatesRecoverFile(id, recoveryPath)

Recover specified file from bin

User with Delete permission can access the method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | file id
val recoveryPath : kotlin.String = recoveryPath_example // kotlin.String | 
try {
    apiInstance.templatesRecoverFile(id, recoveryPath)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesRecoverFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesRecoverFile")
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

<a id="templatesRenameFile"></a>
# **templatesRenameFile**
> TemplateVM templatesRenameFile(id, fileRenameVM)

Rename a file

User with Update Name permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileRenameVM : FileRenameVM =  // FileRenameVM | 
try {
    val result : TemplateVM = apiInstance.templatesRenameFile(id, fileRenameVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesRenameFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesRenameFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileRenameVM** | [**FileRenameVM**](FileRenameVM.md)|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="templatesStaticPreview"></a>
# **templatesStaticPreview**
> ExportVM templatesStaticPreview(id, previewTemplateVM)

Make preview for the report.  Generate a new or return exist prepared svg files.  If template was changed will be returned a new.  Pass the &#x60;&#x60; parameter to check prepared timestamp

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template id
val previewTemplateVM : PreviewTemplateVM =  // PreviewTemplateVM | Model with parameters
try {
    val result : ExportVM = apiInstance.templatesStaticPreview(id, previewTemplateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesStaticPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesStaticPreview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **previewTemplateVM** | [**PreviewTemplateVM**](PreviewTemplateVM.md)| Model with parameters | [optional]

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

<a id="templatesUpdateContent"></a>
# **templatesUpdateContent**
> templatesUpdateContent(id, updateFileContentVM)

Updates contnet of the template. The method is deprecated, use the UpdateContentV2 method instead!

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template id
val updateFileContentVM : UpdateFileContentVM =  // UpdateFileContentVM | VM with only byte[] with new content
try {
    apiInstance.templatesUpdateContent(id, updateFileContentVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUpdateContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUpdateContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **updateFileContentVM** | [**UpdateFileContentVM**](UpdateFileContentVM.md)| VM with only byte[] with new content | [optional]

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

<a id="templatesUpdateContentV2"></a>
# **templatesUpdateContentV2**
> templatesUpdateContentV2(id, fileContent)

Updates contnet of the template.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | template id
val fileContent : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.templatesUpdateContentV2(id, fileContent)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUpdateContentV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUpdateContentV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |
 **fileContent** | **java.io.File**|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="templatesUpdateIcon"></a>
# **templatesUpdateIcon**
> TemplateVM templatesUpdateIcon(id, fileIconVM)

Update a files&#39;s icon

User with Update Icon permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileIconVM : FileIconVM =  // FileIconVM | 
try {
    val result : TemplateVM = apiInstance.templatesUpdateIcon(id, fileIconVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUpdateIcon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUpdateIcon")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileIconVM** | [**FileIconVM**](FileIconVM.md)|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="templatesUpdatePermissions"></a>
# **templatesUpdatePermissions**
> templatesUpdatePermissions(id, updateFilePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateFilePermissionsVM : UpdateFilePermissionsVM =  // UpdateFilePermissionsVM | 
try {
    apiInstance.templatesUpdatePermissions(id, updateFilePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUpdatePermissions")
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

<a id="templatesUpdateTags"></a>
# **templatesUpdateTags**
> TemplateVM templatesUpdateTags(id, fileTagsUpdateVM)

Update tags

User with Update Tags permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | 
val fileTagsUpdateVM : FileTagsUpdateVM =  // FileTagsUpdateVM | 
try {
    val result : TemplateVM = apiInstance.templatesUpdateTags(id, fileTagsUpdateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUpdateTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUpdateTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **fileTagsUpdateVM** | [**FileTagsUpdateVM**](FileTagsUpdateVM.md)|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="templatesUploadFile"></a>
# **templatesUploadFile**
> TemplateVM templatesUploadFile(id, templateCreateVM)

Upload a file to the specified folder. The method is deprecated, use the UploadFileV2 method instead!

User with Create Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val templateCreateVM : TemplateCreateVM =  // TemplateCreateVM | file's view model
try {
    val result : TemplateVM = apiInstance.templatesUploadFile(id, templateCreateVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUploadFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of folder |
 **templateCreateVM** | [**TemplateCreateVM**](TemplateCreateVM.md)| file&#39;s view model | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="templatesUploadFileV2"></a>
# **templatesUploadFileV2**
> TemplateVM templatesUploadFileV2(id, fileContent, tags, icon)

Alternative api for upload a file to the specified folder!

User with Create Entity permission can access this method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | Identifier of folder
val fileContent : java.io.File = BINARY_DATA_HERE // java.io.File | 
val tags : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val icon : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : TemplateVM = apiInstance.templatesUploadFileV2(id, fileContent, tags, icon)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#templatesUploadFileV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#templatesUploadFileV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of folder |
 **fileContent** | **java.io.File**|  |
 **tags** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **icon** | **java.io.File**|  | [optional]

### Return type

[**TemplateVM**](TemplateVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

