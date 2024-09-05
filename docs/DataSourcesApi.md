# DataSourcesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataSourcesCountDataSourcesAsync**](DataSourcesApi.md#dataSourcesCountDataSourcesAsync) | **GET** /api/data/v1/DataSources/{subscriptionId}/count | Returns a number of data sources in subscription
[**dataSourcesCreateDataSource**](DataSourcesApi.md#dataSourcesCreateDataSource) | **POST** /api/data/v1/DataSources | Create new data source
[**dataSourcesDeleteDataSource**](DataSourcesApi.md#dataSourcesDeleteDataSource) | **DELETE** /api/data/v1/DataSources/{id} | Delete data source by id
[**dataSourcesFetchData**](DataSourcesApi.md#dataSourcesFetchData) | **GET** /api/data/v1/DataSources/{id}/fetch | This should connect to a database and set data structure
[**dataSourcesGetAvailableDataSources**](DataSourcesApi.md#dataSourcesGetAvailableDataSources) | **GET** /api/data/v1/DataSources | Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.
[**dataSourcesGetDataSource**](DataSourcesApi.md#dataSourcesGetDataSource) | **GET** /api/data/v1/DataSources/{id} | Get data source by id
[**dataSourcesGetParameterTypes**](DataSourcesApi.md#dataSourcesGetParameterTypes) | **GET** /api/data/v1/DataSources/parameterTypes/{dataSourceType} | Get data source parameter DataType&#39;s
[**dataSourcesGetPermissions**](DataSourcesApi.md#dataSourcesGetPermissions) | **GET** /api/data/v1/DataSources/{id}/permissions | Get all Data source permissions
[**dataSourcesRenameDataSource**](DataSourcesApi.md#dataSourcesRenameDataSource) | **PUT** /api/data/v1/DataSources/{id}/rename | Rename data source by id
[**dataSourcesUpdateConnectionString**](DataSourcesApi.md#dataSourcesUpdateConnectionString) | **PUT** /api/data/v1/DataSources/{id}/connectionString | Update data source&#39;s connection string by id
[**dataSourcesUpdatePermissions**](DataSourcesApi.md#dataSourcesUpdatePermissions) | **POST** /api/data/v1/DataSources/{id}/permissions | Update permissions
[**dataSourcesUpdateSelectCommands**](DataSourcesApi.md#dataSourcesUpdateSelectCommands) | **PUT** /api/data/v1/DataSources/{id}/selectCommands | Update data source&#39;s select commands by id
[**dataSourcesUpdateSubscriptionDataSource**](DataSourcesApi.md#dataSourcesUpdateSubscriptionDataSource) | **PUT** /api/data/v1/DataSources/{id}/updateSubscription | Update data source&#39;s subscription


<a id="dataSourcesCountDataSourcesAsync"></a>
# **dataSourcesCountDataSourcesAsync**
> kotlin.Long dataSourcesCountDataSourcesAsync(subscriptionId)

Returns a number of data sources in subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscripiton id
try {
    val result : kotlin.Long = apiInstance.dataSourcesCountDataSourcesAsync(subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesCountDataSourcesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesCountDataSourcesAsync")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| subscripiton id |

### Return type

**kotlin.Long**

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dataSourcesCreateDataSource"></a>
# **dataSourcesCreateDataSource**
> DataSourceVM dataSourcesCreateDataSource(createDataSourceVM)

Create new data source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val createDataSourceVM : CreateDataSourceVM =  // CreateDataSourceVM | create viewmodel
try {
    val result : DataSourceVM = apiInstance.dataSourcesCreateDataSource(createDataSourceVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesCreateDataSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesCreateDataSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDataSourceVM** | [**CreateDataSourceVM**](CreateDataSourceVM.md)| create viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dataSourcesDeleteDataSource"></a>
# **dataSourcesDeleteDataSource**
> dataSourcesDeleteDataSource(id)

Delete data source by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
try {
    apiInstance.dataSourcesDeleteDataSource(id)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesDeleteDataSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesDeleteDataSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |

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

<a id="dataSourcesFetchData"></a>
# **dataSourcesFetchData**
> dataSourcesFetchData(id)

This should connect to a database and set data structure

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | datasource's id
try {
    apiInstance.dataSourcesFetchData(id)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesFetchData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesFetchData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| datasource&#39;s id |

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

<a id="dataSourcesGetAvailableDataSources"></a>
# **dataSourcesGetAvailableDataSources**
> DataSourcesVM dataSourcesGetAvailableDataSources(subscriptionId, skip, take, orderBy, desc)

Returns all of the data sources, that current user have permission for in a subscription &lt;br /&gt;  The method will return minimal infomration about the datasources: &lt;br /&gt;  id, name, editedTime, status.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | id of subscription where the datasources are located
val skip : kotlin.Int = 56 // kotlin.Int | how many data sources will be skipped
val take : kotlin.Int = 56 // kotlin.Int | how many data sources will be taken
val orderBy : DataSourceSorting =  // DataSourceSorting | field to order by
val desc : kotlin.Boolean = true // kotlin.Boolean | descending sort
try {
    val result : DataSourcesVM = apiInstance.dataSourcesGetAvailableDataSources(subscriptionId, skip, take, orderBy, desc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesGetAvailableDataSources")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesGetAvailableDataSources")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **kotlin.String**| id of subscription where the datasources are located | [optional]
 **skip** | **kotlin.Int**| how many data sources will be skipped | [optional] [default to 0]
 **take** | **kotlin.Int**| how many data sources will be taken | [optional] [default to 10]
 **orderBy** | [**DataSourceSorting**](.md)| field to order by | [optional] [enum: CreatedTime, EditedTime, Name]
 **desc** | **kotlin.Boolean**| descending sort | [optional] [default to false]

### Return type

[**DataSourcesVM**](DataSourcesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dataSourcesGetDataSource"></a>
# **dataSourcesGetDataSource**
> DataSourceVM dataSourcesGetDataSource(id)

Get data source by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
try {
    val result : DataSourceVM = apiInstance.dataSourcesGetDataSource(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesGetDataSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesGetDataSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dataSourcesGetParameterTypes"></a>
# **dataSourcesGetParameterTypes**
> DataSourceParameterTypesVM dataSourcesGetParameterTypes(dataSourceType)

Get data source parameter DataType&#39;s

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val dataSourceType : DataSourceConnectionType =  // DataSourceConnectionType | data source type (MsSql, MySql, etc.)
try {
    val result : DataSourceParameterTypesVM = apiInstance.dataSourcesGetParameterTypes(dataSourceType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesGetParameterTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesGetParameterTypes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataSourceType** | [**DataSourceConnectionType**](.md)| data source type (MsSql, MySql, etc.) | [enum: JSON, MSSQL, CSV, XML, MySQL, Postgres, OracleDB, FirebirdDB, MongoDB, ClickHouse]

### Return type

[**DataSourceParameterTypesVM**](DataSourceParameterTypesVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dataSourcesGetPermissions"></a>
# **dataSourcesGetPermissions**
> DataSourcePermissionsVM dataSourcesGetPermissions(id)

Get all Data source permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
try {
    val result : DataSourcePermissionsVM = apiInstance.dataSourcesGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesGetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |

### Return type

[**DataSourcePermissionsVM**](DataSourcePermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dataSourcesRenameDataSource"></a>
# **dataSourcesRenameDataSource**
> DataSourceVM dataSourcesRenameDataSource(id, renameDataSourceVM)

Rename data source by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
val renameDataSourceVM : RenameDataSourceVM =  // RenameDataSourceVM | rename viewmodel
try {
    val result : DataSourceVM = apiInstance.dataSourcesRenameDataSource(id, renameDataSourceVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesRenameDataSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesRenameDataSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |
 **renameDataSourceVM** | [**RenameDataSourceVM**](RenameDataSourceVM.md)| rename viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dataSourcesUpdateConnectionString"></a>
# **dataSourcesUpdateConnectionString**
> DataSourceVM dataSourcesUpdateConnectionString(id, updateDataSourceConnectionStringVM)

Update data source&#39;s connection string by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
val updateDataSourceConnectionStringVM : UpdateDataSourceConnectionStringVM =  // UpdateDataSourceConnectionStringVM | update viewmodel
try {
    val result : DataSourceVM = apiInstance.dataSourcesUpdateConnectionString(id, updateDataSourceConnectionStringVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesUpdateConnectionString")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesUpdateConnectionString")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |
 **updateDataSourceConnectionStringVM** | [**UpdateDataSourceConnectionStringVM**](UpdateDataSourceConnectionStringVM.md)| update viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dataSourcesUpdatePermissions"></a>
# **dataSourcesUpdatePermissions**
> dataSourcesUpdatePermissions(id, updateDataSourcePermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | 
val updateDataSourcePermissionsVM : UpdateDataSourcePermissionsVM =  // UpdateDataSourcePermissionsVM | 
try {
    apiInstance.dataSourcesUpdatePermissions(id, updateDataSourcePermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesUpdatePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **updateDataSourcePermissionsVM** | [**UpdateDataSourcePermissionsVM**](UpdateDataSourcePermissionsVM.md)|  | [optional]

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

<a id="dataSourcesUpdateSelectCommands"></a>
# **dataSourcesUpdateSelectCommands**
> DataSourceVM dataSourcesUpdateSelectCommands(id, updateDataSourceSelectCommandsVM)

Update data source&#39;s select commands by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
val updateDataSourceSelectCommandsVM : UpdateDataSourceSelectCommandsVM =  // UpdateDataSourceSelectCommandsVM | update viewmodel
try {
    val result : DataSourceVM = apiInstance.dataSourcesUpdateSelectCommands(id, updateDataSourceSelectCommandsVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesUpdateSelectCommands")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesUpdateSelectCommands")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |
 **updateDataSourceSelectCommandsVM** | [**UpdateDataSourceSelectCommandsVM**](UpdateDataSourceSelectCommandsVM.md)| update viewmodel | [optional]

### Return type

[**DataSourceVM**](DataSourceVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dataSourcesUpdateSubscriptionDataSource"></a>
# **dataSourcesUpdateSubscriptionDataSource**
> dataSourcesUpdateSubscriptionDataSource(id, updateDataSourceSubscriptionVM)

Update data source&#39;s subscription

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = DataSourcesApi()
val id : kotlin.String = id_example // kotlin.String | data source id
val updateDataSourceSubscriptionVM : UpdateDataSourceSubscriptionVM =  // UpdateDataSourceSubscriptionVM | update subscription viewmodel
try {
    apiInstance.dataSourcesUpdateSubscriptionDataSource(id, updateDataSourceSubscriptionVM)
} catch (e: ClientException) {
    println("4xx response calling DataSourcesApi#dataSourcesUpdateSubscriptionDataSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataSourcesApi#dataSourcesUpdateSubscriptionDataSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| data source id |
 **updateDataSourceSubscriptionVM** | [**UpdateDataSourceSubscriptionVM**](UpdateDataSourceSubscriptionVM.md)| update subscription viewmodel | [optional]

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

