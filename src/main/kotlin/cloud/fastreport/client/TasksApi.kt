/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package cloud.fastreport.client

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import cloud.fastreport.model.CreateTaskBaseVM
import cloud.fastreport.model.ProblemDetails
import cloud.fastreport.model.RunTaskBaseVM
import cloud.fastreport.model.TaskBaseVM
import cloud.fastreport.model.TaskPermissionsVM
import cloud.fastreport.model.TasksVM
import cloud.fastreport.model.UpdateTaskBaseVM
import cloud.fastreport.model.UpdateTaskPermissionsVM

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class TasksApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create a new task
     * 
     * @param createTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) (optional)
     * @return TaskBaseVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksCreateTask(createTaskBaseVM: CreateTaskBaseVM? = null) : TaskBaseVM {
        val localVarResponse = tasksCreateTaskWithHttpInfo(createTaskBaseVM = createTaskBaseVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskBaseVM
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Create a new task
     * 
     * @param createTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) (optional)
     * @return ApiResponse<TaskBaseVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksCreateTaskWithHttpInfo(createTaskBaseVM: CreateTaskBaseVM?) : ApiResponse<TaskBaseVM?> {
        val localVariableConfig = tasksCreateTaskRequestConfig(createTaskBaseVM = createTaskBaseVM)

        return request<CreateTaskBaseVM, TaskBaseVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksCreateTask
     *
     * @param createTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) (optional)
     * @return RequestConfig
     */
    fun tasksCreateTaskRequestConfig(createTaskBaseVM: CreateTaskBaseVM?) : RequestConfig<CreateTaskBaseVM> {
        val localVariableBody = createTaskBaseVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/tasks/v1/Tasks",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete a task from a storage
     * 
     * @param taskId deleting task id
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksDeleteTask(taskId: kotlin.String) : Unit {
        val localVarResponse = tasksDeleteTaskWithHttpInfo(taskId = taskId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Delete a task from a storage
     * 
     * @param taskId deleting task id
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksDeleteTaskWithHttpInfo(taskId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = tasksDeleteTaskRequestConfig(taskId = taskId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksDeleteTask
     *
     * @param taskId deleting task id
     * @return RequestConfig
     */
    fun tasksDeleteTaskRequestConfig(taskId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/tasks/v1/Tasks/{taskId}".replace("{"+"taskId"+"}", encodeURIComponent(taskId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get a task by a specified id
     * 
     * @param taskId a task id
     * @return TaskBaseVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksGet(taskId: kotlin.String) : TaskBaseVM {
        val localVarResponse = tasksGetWithHttpInfo(taskId = taskId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskBaseVM
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get a task by a specified id
     * 
     * @param taskId a task id
     * @return ApiResponse<TaskBaseVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksGetWithHttpInfo(taskId: kotlin.String) : ApiResponse<TaskBaseVM?> {
        val localVariableConfig = tasksGetRequestConfig(taskId = taskId)

        return request<Unit, TaskBaseVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksGet
     *
     * @param taskId a task id
     * @return RequestConfig
     */
    fun tasksGetRequestConfig(taskId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/tasks/v1/Tasks/{taskId}".replace("{"+"taskId"+"}", encodeURIComponent(taskId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get tasks list
     * 
     * @param skip number of tasks, that have to be skipped (optional, default to 0)
     * @param take number of tasks, that have to be returned (optional, default to 10)
     * @param subscriptionId subscription id (optional)
     * @param searchPattern  (optional, default to "")
     * @return TasksVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksGetList(skip: kotlin.Int? = 0, take: kotlin.Int? = 10, subscriptionId: kotlin.String? = null, searchPattern: kotlin.String? = "") : TasksVM {
        val localVarResponse = tasksGetListWithHttpInfo(skip = skip, take = take, subscriptionId = subscriptionId, searchPattern = searchPattern)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TasksVM
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get tasks list
     * 
     * @param skip number of tasks, that have to be skipped (optional, default to 0)
     * @param take number of tasks, that have to be returned (optional, default to 10)
     * @param subscriptionId subscription id (optional)
     * @param searchPattern  (optional, default to "")
     * @return ApiResponse<TasksVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksGetListWithHttpInfo(skip: kotlin.Int?, take: kotlin.Int?, subscriptionId: kotlin.String?, searchPattern: kotlin.String?) : ApiResponse<TasksVM?> {
        val localVariableConfig = tasksGetListRequestConfig(skip = skip, take = take, subscriptionId = subscriptionId, searchPattern = searchPattern)

        return request<Unit, TasksVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksGetList
     *
     * @param skip number of tasks, that have to be skipped (optional, default to 0)
     * @param take number of tasks, that have to be returned (optional, default to 10)
     * @param subscriptionId subscription id (optional)
     * @param searchPattern  (optional, default to "")
     * @return RequestConfig
     */
    fun tasksGetListRequestConfig(skip: kotlin.Int?, take: kotlin.Int?, subscriptionId: kotlin.String?, searchPattern: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (skip != null) {
                    put("skip", listOf(skip.toString()))
                }
                if (take != null) {
                    put("take", listOf(take.toString()))
                }
                if (subscriptionId != null) {
                    put("subscriptionId", listOf(subscriptionId.toString()))
                }
                if (searchPattern != null) {
                    put("searchPattern", listOf(searchPattern.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/tasks/v1/Tasks",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get all Task permissions
     * 
     * @param id task id
     * @return TaskPermissionsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksGetPermissions(id: kotlin.String) : TaskPermissionsVM {
        val localVarResponse = tasksGetPermissionsWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskPermissionsVM
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get all Task permissions
     * 
     * @param id task id
     * @return ApiResponse<TaskPermissionsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksGetPermissionsWithHttpInfo(id: kotlin.String) : ApiResponse<TaskPermissionsVM?> {
        val localVariableConfig = tasksGetPermissionsRequestConfig(id = id)

        return request<Unit, TaskPermissionsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksGetPermissions
     *
     * @param id task id
     * @return RequestConfig
     */
    fun tasksGetPermissionsRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/tasks/v1/Tasks/{id}/permissions".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Rename a task
     * 
     * @param taskId renaming task id
     * @param newName task&#39;s new Name (optional)
     * @return TaskBaseVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksRenameTask(taskId: kotlin.String, newName: kotlin.String? = null) : TaskBaseVM {
        val localVarResponse = tasksRenameTaskWithHttpInfo(taskId = taskId, newName = newName)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskBaseVM
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Rename a task
     * 
     * @param taskId renaming task id
     * @param newName task&#39;s new Name (optional)
     * @return ApiResponse<TaskBaseVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksRenameTaskWithHttpInfo(taskId: kotlin.String, newName: kotlin.String?) : ApiResponse<TaskBaseVM?> {
        val localVariableConfig = tasksRenameTaskRequestConfig(taskId = taskId, newName = newName)

        return request<Unit, TaskBaseVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksRenameTask
     *
     * @param taskId renaming task id
     * @param newName task&#39;s new Name (optional)
     * @return RequestConfig
     */
    fun tasksRenameTaskRequestConfig(taskId: kotlin.String, newName: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (newName != null) {
                    put("newName", listOf(newName.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/tasks/v1/Tasks/{taskId}/rename".replace("{"+"taskId"+"}", encodeURIComponent(taskId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Run a task from request body
     * 
     * @param runTaskBaseVM task&#39;s view model (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksRunTask(runTaskBaseVM: RunTaskBaseVM? = null) : Unit {
        val localVarResponse = tasksRunTaskWithHttpInfo(runTaskBaseVM = runTaskBaseVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Run a task from request body
     * 
     * @param runTaskBaseVM task&#39;s view model (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksRunTaskWithHttpInfo(runTaskBaseVM: RunTaskBaseVM?) : ApiResponse<Unit?> {
        val localVariableConfig = tasksRunTaskRequestConfig(runTaskBaseVM = runTaskBaseVM)

        return request<RunTaskBaseVM, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksRunTask
     *
     * @param runTaskBaseVM task&#39;s view model (optional)
     * @return RequestConfig
     */
    fun tasksRunTaskRequestConfig(runTaskBaseVM: RunTaskBaseVM?) : RequestConfig<RunTaskBaseVM> {
        val localVariableBody = runTaskBaseVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/tasks/v1/Tasks/run",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Run a task by id
     * 
     * @param taskId task id
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksRunTaskById(taskId: kotlin.String) : Unit {
        val localVarResponse = tasksRunTaskByIdWithHttpInfo(taskId = taskId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Run a task by id
     * 
     * @param taskId task id
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksRunTaskByIdWithHttpInfo(taskId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = tasksRunTaskByIdRequestConfig(taskId = taskId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksRunTaskById
     *
     * @param taskId task id
     * @return RequestConfig
     */
    fun tasksRunTaskByIdRequestConfig(taskId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/tasks/v1/Tasks/{taskId}/run".replace("{"+"taskId"+"}", encodeURIComponent(taskId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update permissions
     * 
     * @param id task id
     * @param updateTaskPermissionsVM new permissions (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksUpdatePermissions(id: kotlin.String, updateTaskPermissionsVM: UpdateTaskPermissionsVM? = null) : Unit {
        val localVarResponse = tasksUpdatePermissionsWithHttpInfo(id = id, updateTaskPermissionsVM = updateTaskPermissionsVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Update permissions
     * 
     * @param id task id
     * @param updateTaskPermissionsVM new permissions (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksUpdatePermissionsWithHttpInfo(id: kotlin.String, updateTaskPermissionsVM: UpdateTaskPermissionsVM?) : ApiResponse<Unit?> {
        val localVariableConfig = tasksUpdatePermissionsRequestConfig(id = id, updateTaskPermissionsVM = updateTaskPermissionsVM)

        return request<UpdateTaskPermissionsVM, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksUpdatePermissions
     *
     * @param id task id
     * @param updateTaskPermissionsVM new permissions (optional)
     * @return RequestConfig
     */
    fun tasksUpdatePermissionsRequestConfig(id: kotlin.String, updateTaskPermissionsVM: UpdateTaskPermissionsVM?) : RequestConfig<UpdateTaskPermissionsVM> {
        val localVariableBody = updateTaskPermissionsVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/tasks/v1/Tasks/{id}/permissions".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update a task
     * 
     * @param taskId updating task id
     * @param updateTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) (optional)
     * @return TaskBaseVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun tasksUpdateTask(taskId: kotlin.String, updateTaskBaseVM: UpdateTaskBaseVM? = null) : TaskBaseVM {
        val localVarResponse = tasksUpdateTaskWithHttpInfo(taskId = taskId, updateTaskBaseVM = updateTaskBaseVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskBaseVM
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Update a task
     * 
     * @param taskId updating task id
     * @param updateTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) (optional)
     * @return ApiResponse<TaskBaseVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun tasksUpdateTaskWithHttpInfo(taskId: kotlin.String, updateTaskBaseVM: UpdateTaskBaseVM?) : ApiResponse<TaskBaseVM?> {
        val localVariableConfig = tasksUpdateTaskRequestConfig(taskId = taskId, updateTaskBaseVM = updateTaskBaseVM)

        return request<UpdateTaskBaseVM, TaskBaseVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation tasksUpdateTask
     *
     * @param taskId updating task id
     * @param updateTaskBaseVM task&#39;s view model. You have to specify task type (type: \&quot;ExportTemplate\&quot;) (optional)
     * @return RequestConfig
     */
    fun tasksUpdateTaskRequestConfig(taskId: kotlin.String, updateTaskBaseVM: UpdateTaskBaseVM?) : RequestConfig<UpdateTaskBaseVM> {
        val localVariableBody = updateTaskBaseVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/tasks/v1/Tasks/{taskId}".replace("{"+"taskId"+"}", encodeURIComponent(taskId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
