# TasksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tasksCreateTask**](TasksApi.md#tasksCreateTask) | **POST** /api/tasks/v1/Tasks | Create a new task
[**tasksDeleteTask**](TasksApi.md#tasksDeleteTask) | **DELETE** /api/tasks/v1/Tasks/{taskId} | Delete a task from a storage
[**tasksGet**](TasksApi.md#tasksGet) | **GET** /api/tasks/v1/Tasks/{taskId} | Get a task by a specified id
[**tasksGetList**](TasksApi.md#tasksGetList) | **GET** /api/tasks/v1/Tasks | Get tasks list
[**tasksGetPermissions**](TasksApi.md#tasksGetPermissions) | **GET** /api/tasks/v1/Tasks/{id}/permissions | Get all Task permissions
[**tasksRenameTask**](TasksApi.md#tasksRenameTask) | **PUT** /api/tasks/v1/Tasks/{taskId}/rename | Rename a task
[**tasksRunTask**](TasksApi.md#tasksRunTask) | **POST** /api/tasks/v1/Tasks/run | Run a task from request body
[**tasksRunTaskById**](TasksApi.md#tasksRunTaskById) | **POST** /api/tasks/v1/Tasks/{taskId}/run | Run a task by id
[**tasksUpdatePermissions**](TasksApi.md#tasksUpdatePermissions) | **POST** /api/tasks/v1/Tasks/{id}/permissions | Update permissions
[**tasksUpdateTask**](TasksApi.md#tasksUpdateTask) | **PUT** /api/tasks/v1/Tasks/{taskId} | Update a task


<a id="tasksCreateTask"></a>
# **tasksCreateTask**
> TaskBaseVM tasksCreateTask(createTaskBaseVM)

Create a new task

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val createTaskBaseVM : CreateTaskBaseVM =  // CreateTaskBaseVM | task's view model. You have to specify task type (type: \"ExportTemplate\")
try {
    val result : TaskBaseVM = apiInstance.tasksCreateTask(createTaskBaseVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksCreateTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksCreateTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTaskBaseVM** | [**CreateTaskBaseVM**](CreateTaskBaseVM.md)| task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) | [optional]

### Return type

[**TaskBaseVM**](TaskBaseVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="tasksDeleteTask"></a>
# **tasksDeleteTask**
> tasksDeleteTask(taskId)

Delete a task from a storage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | deleting task id
try {
    apiInstance.tasksDeleteTask(taskId)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksDeleteTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksDeleteTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| deleting task id |

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

<a id="tasksGet"></a>
# **tasksGet**
> TaskBaseVM tasksGet(taskId)

Get a task by a specified id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | a task id
try {
    val result : TaskBaseVM = apiInstance.tasksGet(taskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| a task id |

### Return type

[**TaskBaseVM**](TaskBaseVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tasksGetList"></a>
# **tasksGetList**
> TasksVM tasksGetList(skip, take, subscriptionId, searchPattern)

Get tasks list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val skip : kotlin.Int = 56 // kotlin.Int | number of tasks, that have to be skipped
val take : kotlin.Int = 56 // kotlin.Int | number of tasks, that have to be returned
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | subscription id
val searchPattern : kotlin.String = searchPattern_example // kotlin.String | 
try {
    val result : TasksVM = apiInstance.tasksGetList(skip, take, subscriptionId, searchPattern)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksGetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksGetList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **kotlin.Int**| number of tasks, that have to be skipped | [optional] [default to 0]
 **take** | **kotlin.Int**| number of tasks, that have to be returned | [optional] [default to 10]
 **subscriptionId** | **kotlin.String**| subscription id | [optional]
 **searchPattern** | **kotlin.String**|  | [optional] [default to &quot;&quot;]

### Return type

[**TasksVM**](TasksVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tasksGetPermissions"></a>
# **tasksGetPermissions**
> TaskPermissionsVM tasksGetPermissions(id)

Get all Task permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val id : kotlin.String = id_example // kotlin.String | task id
try {
    val result : TaskPermissionsVM = apiInstance.tasksGetPermissions(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksGetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksGetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| task id |

### Return type

[**TaskPermissionsVM**](TaskPermissionsVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tasksRenameTask"></a>
# **tasksRenameTask**
> TaskBaseVM tasksRenameTask(taskId, newName)

Rename a task

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | renaming task id
val newName : kotlin.String = newName_example // kotlin.String | task's new Name
try {
    val result : TaskBaseVM = apiInstance.tasksRenameTask(taskId, newName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksRenameTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksRenameTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| renaming task id |
 **newName** | **kotlin.String**| task&#39;s new Name | [optional]

### Return type

[**TaskBaseVM**](TaskBaseVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tasksRunTask"></a>
# **tasksRunTask**
> tasksRunTask(runTaskBaseVM)

Run a task from request body

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val runTaskBaseVM : RunTaskBaseVM =  // RunTaskBaseVM | task's view model
try {
    apiInstance.tasksRunTask(runTaskBaseVM)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksRunTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksRunTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runTaskBaseVM** | [**RunTaskBaseVM**](RunTaskBaseVM.md)| task&#39;s view model | [optional]

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

<a id="tasksRunTaskById"></a>
# **tasksRunTaskById**
> tasksRunTaskById(taskId)

Run a task by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | task id
try {
    apiInstance.tasksRunTaskById(taskId)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksRunTaskById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksRunTaskById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| task id |

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

<a id="tasksUpdatePermissions"></a>
# **tasksUpdatePermissions**
> tasksUpdatePermissions(id, updateTaskPermissionsVM)

Update permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val id : kotlin.String = id_example // kotlin.String | task id
val updateTaskPermissionsVM : UpdateTaskPermissionsVM =  // UpdateTaskPermissionsVM | new permissions
try {
    apiInstance.tasksUpdatePermissions(id, updateTaskPermissionsVM)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksUpdatePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksUpdatePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| task id |
 **updateTaskPermissionsVM** | [**UpdateTaskPermissionsVM**](UpdateTaskPermissionsVM.md)| new permissions | [optional]

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

<a id="tasksUpdateTask"></a>
# **tasksUpdateTask**
> TaskBaseVM tasksUpdateTask(taskId, updateTaskBaseVM)

Update a task

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import cloud.fastreport.model.*

val apiInstance = TasksApi()
val taskId : kotlin.String = taskId_example // kotlin.String | updating task id
val updateTaskBaseVM : UpdateTaskBaseVM =  // UpdateTaskBaseVM | task's view model. You have to specify task type (type: \"ExportTemplate\")
try {
    val result : TaskBaseVM = apiInstance.tasksUpdateTask(taskId, updateTaskBaseVM)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TasksApi#tasksUpdateTask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TasksApi#tasksUpdateTask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **kotlin.String**| updating task id |
 **updateTaskBaseVM** | [**UpdateTaskBaseVM**](UpdateTaskBaseVM.md)| task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) | [optional]

### Return type

[**TaskBaseVM**](TaskBaseVM.md)

### Authorization


Configure ApiKey:
    ApiClient.username = ""
    ApiClient.password = ""
Configure JWT:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

