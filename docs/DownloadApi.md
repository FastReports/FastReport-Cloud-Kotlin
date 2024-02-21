# DownloadApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadGetExport**](DownloadApi.md#downloadGetExport) | **GET** /download/e/{id} | Returns a export file with specified id
[**downloadGetExportThumbnail**](DownloadApi.md#downloadGetExportThumbnail) | **GET** /download/e/{id}/thumbnail | Returns export&#39;s thumbnail
[**downloadGetExports**](DownloadApi.md#downloadGetExports) | **GET** /download/es/{archiveName} | Returns a zip archive with selected ids
[**downloadGetLastSVGExport**](DownloadApi.md#downloadGetLastSVGExport) | **GET** /download/lastPreview/{reportId} | returns export, that was created from report with specified id.  INTERNAL USAGE ONLY!
[**downloadGetReport**](DownloadApi.md#downloadGetReport) | **GET** /download/r/{id} | Returns a prepared file with specified id
[**downloadGetReportThumbnail**](DownloadApi.md#downloadGetReportThumbnail) | **GET** /download/r/{id}/thumbnail | Returns report&#39;s thumbnail
[**downloadGetReports**](DownloadApi.md#downloadGetReports) | **GET** /download/rs/{archiveName} | Returns a zip archive with selected files
[**downloadGetTemplate**](DownloadApi.md#downloadGetTemplate) | **GET** /download/t/{id} | Returns a Template file with specified id
[**downloadGetTemplateThumbnail**](DownloadApi.md#downloadGetTemplateThumbnail) | **GET** /download/t/{id}/thumbnail | Returns template&#39;s thumbnail
[**downloadGetTemplates**](DownloadApi.md#downloadGetTemplates) | **GET** /download/ts/{archiveName} | Returns a zip archive with selected files


<a id="downloadGetExport"></a>
# **downloadGetExport**
> java.io.File downloadGetExport(id, preview)

Returns a export file with specified id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val id : kotlin.String = id_example // kotlin.String | 
val preview : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : java.io.File = apiInstance.downloadGetExport(id, preview)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **preview** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="downloadGetExportThumbnail"></a>
# **downloadGetExportThumbnail**
> java.io.File downloadGetExportThumbnail(id)

Returns export&#39;s thumbnail

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadGetExportThumbnail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetExportThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetExportThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadGetExports"></a>
# **downloadGetExports**
> java.io.File downloadGetExports(archiveName, fileIds, folderIds)

Returns a zip archive with selected ids

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val archiveName : kotlin.String = archiveName_example // kotlin.String | name of the created archive
val fileIds : kotlin.String = fileIds_example // kotlin.String | ids separated with a ',' sign
val folderIds : kotlin.String = folderIds_example // kotlin.String | ids separated with a ',' sign
try {
    val result : java.io.File = apiInstance.downloadGetExports(archiveName, fileIds, folderIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetExports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetExports")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **archiveName** | **kotlin.String**| name of the created archive |
 **fileIds** | **kotlin.String**| ids separated with a &#39;,&#39; sign | [optional]
 **folderIds** | **kotlin.String**| ids separated with a &#39;,&#39; sign | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadGetLastSVGExport"></a>
# **downloadGetLastSVGExport**
> java.io.File downloadGetLastSVGExport(reportId)

returns export, that was created from report with specified id.  INTERNAL USAGE ONLY!

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val reportId : kotlin.String = reportId_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadGetLastSVGExport(reportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetLastSVGExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetLastSVGExport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="downloadGetReport"></a>
# **downloadGetReport**
> java.io.File downloadGetReport(id)

Returns a prepared file with specified id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadGetReport(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="downloadGetReportThumbnail"></a>
# **downloadGetReportThumbnail**
> java.io.File downloadGetReportThumbnail(id)

Returns report&#39;s thumbnail

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadGetReportThumbnail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetReportThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetReportThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadGetReports"></a>
# **downloadGetReports**
> java.io.File downloadGetReports(archiveName, fileIds, folderIds)

Returns a zip archive with selected files

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val archiveName : kotlin.String = archiveName_example // kotlin.String | name of the created archive
val fileIds : kotlin.String = fileIds_example // kotlin.String | ids separated with a ',' sign
val folderIds : kotlin.String = folderIds_example // kotlin.String | ids separated with a ',' sign
try {
    val result : java.io.File = apiInstance.downloadGetReports(archiveName, fileIds, folderIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetReports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetReports")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **archiveName** | **kotlin.String**| name of the created archive |
 **fileIds** | **kotlin.String**| ids separated with a &#39;,&#39; sign | [optional]
 **folderIds** | **kotlin.String**| ids separated with a &#39;,&#39; sign | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadGetTemplate"></a>
# **downloadGetTemplate**
> java.io.File downloadGetTemplate(id)

Returns a Template file with specified id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val id : kotlin.String = id_example // kotlin.String | template id
try {
    val result : java.io.File = apiInstance.downloadGetTemplate(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| template id |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

<a id="downloadGetTemplateThumbnail"></a>
# **downloadGetTemplateThumbnail**
> java.io.File downloadGetTemplateThumbnail(id)

Returns template&#39;s thumbnail

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadGetTemplateThumbnail(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetTemplateThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetTemplateThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadGetTemplates"></a>
# **downloadGetTemplates**
> java.io.File downloadGetTemplates(archiveName, fileIds, folderIds)

Returns a zip archive with selected files

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DownloadApi()
val archiveName : kotlin.String = archiveName_example // kotlin.String | name of the created archive
val fileIds : kotlin.String = fileIds_example // kotlin.String | ids separated with a ',' sign
val folderIds : kotlin.String = folderIds_example // kotlin.String | ids separated with a ',' sign
try {
    val result : java.io.File = apiInstance.downloadGetTemplates(archiveName, fileIds, folderIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DownloadApi#downloadGetTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DownloadApi#downloadGetTemplates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **archiveName** | **kotlin.String**| name of the created archive |
 **fileIds** | **kotlin.String**| ids separated with a &#39;,&#39; sign | [optional]
 **folderIds** | **kotlin.String**| ids separated with a &#39;,&#39; sign | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

