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

import cloud.fastreport.model.ApiKeyVM
import cloud.fastreport.model.ApiKeysVM
import cloud.fastreport.model.CreateApiKeyVM
import cloud.fastreport.model.DeleteApiKeyVM
import cloud.fastreport.model.ProblemDetails

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

class ApiKeysApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
     * 
     * @param createApiKeyVM 
     * @return ApiKeyVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiKeysCreateApiKey(createApiKeyVM: CreateApiKeyVM) : ApiKeyVM {
        val localVarResponse = apiKeysCreateApiKeyWithHttpInfo(createApiKeyVM = createApiKeyVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApiKeyVM
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
     * Create a new apikey, 5 apikeys for user. Hardcoded for ddos.
     * 
     * @param createApiKeyVM 
     * @return ApiResponse<ApiKeyVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiKeysCreateApiKeyWithHttpInfo(createApiKeyVM: CreateApiKeyVM) : ApiResponse<ApiKeyVM?> {
        val localVariableConfig = apiKeysCreateApiKeyRequestConfig(createApiKeyVM = createApiKeyVM)

        return request<CreateApiKeyVM, ApiKeyVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiKeysCreateApiKey
     *
     * @param createApiKeyVM 
     * @return RequestConfig
     */
    fun apiKeysCreateApiKeyRequestConfig(createApiKeyVM: CreateApiKeyVM) : RequestConfig<CreateApiKeyVM> {
        val localVariableBody = createApiKeyVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/manage/v1/ApiKeys",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an apikey
     * 
     * @param deleteApiKeyVM 
     * @return ApiKeyVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiKeysDeleteApiKey(deleteApiKeyVM: DeleteApiKeyVM) : ApiKeyVM {
        val localVarResponse = apiKeysDeleteApiKeyWithHttpInfo(deleteApiKeyVM = deleteApiKeyVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApiKeyVM
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
     * Delete an apikey
     * 
     * @param deleteApiKeyVM 
     * @return ApiResponse<ApiKeyVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiKeysDeleteApiKeyWithHttpInfo(deleteApiKeyVM: DeleteApiKeyVM) : ApiResponse<ApiKeyVM?> {
        val localVariableConfig = apiKeysDeleteApiKeyRequestConfig(deleteApiKeyVM = deleteApiKeyVM)

        return request<DeleteApiKeyVM, ApiKeyVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiKeysDeleteApiKey
     *
     * @param deleteApiKeyVM 
     * @return RequestConfig
     */
    fun apiKeysDeleteApiKeyRequestConfig(deleteApiKeyVM: DeleteApiKeyVM) : RequestConfig<DeleteApiKeyVM> {
        val localVariableBody = deleteApiKeyVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/manage/v1/ApiKeys",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Returns list with all apikeys of current user
     * Always work, it should make only 200 response (except if user is not authorized).
     * @return ApiKeysVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiKeysGetApiKeys() : ApiKeysVM {
        val localVarResponse = apiKeysGetApiKeysWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApiKeysVM
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
     * Returns list with all apikeys of current user
     * Always work, it should make only 200 response (except if user is not authorized).
     * @return ApiResponse<ApiKeysVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiKeysGetApiKeysWithHttpInfo() : ApiResponse<ApiKeysVM?> {
        val localVariableConfig = apiKeysGetApiKeysRequestConfig()

        return request<Unit, ApiKeysVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiKeysGetApiKeys
     *
     * @return RequestConfig
     */
    fun apiKeysGetApiKeysRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/ApiKeys",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
