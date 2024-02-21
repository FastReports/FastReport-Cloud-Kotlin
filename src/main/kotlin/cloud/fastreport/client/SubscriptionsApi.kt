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

import cloud.fastreport.model.DefaultPermissionsVM
import cloud.fastreport.model.MyPermissionsVM
import cloud.fastreport.model.ProblemDetails
import cloud.fastreport.model.RenameSubscriptionVM
import cloud.fastreport.model.SubscriptionPermissionsVM
import cloud.fastreport.model.SubscriptionVM
import cloud.fastreport.model.SubscriptionsVM
import cloud.fastreport.model.UpdateDefaultPermissionsVM
import cloud.fastreport.model.UpdateSubscriptionLocaleVM
import cloud.fastreport.model.UpdateSubscriptionPermissionsVM

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

class SubscriptionsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Get subscription&#39;s default permissions for new entities
     * 
     * @param subscriptionId id
     * @return DefaultPermissionsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsGetDefaultPermissions(subscriptionId: kotlin.String) : DefaultPermissionsVM {
        val localVarResponse = subscriptionsGetDefaultPermissionsWithHttpInfo(subscriptionId = subscriptionId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DefaultPermissionsVM
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
     * Get subscription&#39;s default permissions for new entities
     * 
     * @param subscriptionId id
     * @return ApiResponse<DefaultPermissionsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsGetDefaultPermissionsWithHttpInfo(subscriptionId: kotlin.String) : ApiResponse<DefaultPermissionsVM?> {
        val localVariableConfig = subscriptionsGetDefaultPermissionsRequestConfig(subscriptionId = subscriptionId)

        return request<Unit, DefaultPermissionsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsGetDefaultPermissions
     *
     * @param subscriptionId id
     * @return RequestConfig
     */
    fun subscriptionsGetDefaultPermissionsRequestConfig(subscriptionId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get user&#39;s permissions for a subscription by id
     * 
     * @param subId subscription id
     * @return MyPermissionsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsGetMyPermissions(subId: kotlin.String) : MyPermissionsVM {
        val localVarResponse = subscriptionsGetMyPermissionsWithHttpInfo(subId = subId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MyPermissionsVM
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
     * Get user&#39;s permissions for a subscription by id
     * 
     * @param subId subscription id
     * @return ApiResponse<MyPermissionsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsGetMyPermissionsWithHttpInfo(subId: kotlin.String) : ApiResponse<MyPermissionsVM?> {
        val localVariableConfig = subscriptionsGetMyPermissionsRequestConfig(subId = subId)

        return request<Unit, MyPermissionsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsGetMyPermissions
     *
     * @param subId subscription id
     * @return RequestConfig
     */
    fun subscriptionsGetMyPermissionsRequestConfig(subId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions/{subId}/mypermissions".replace("{"+"subId"+"}", encodeURIComponent(subId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get permissions for a subscription by id
     * 
     * @param id 
     * @return SubscriptionPermissionsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsGetPermissions(id: kotlin.String) : SubscriptionPermissionsVM {
        val localVarResponse = subscriptionsGetPermissionsWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionPermissionsVM
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
     * Get permissions for a subscription by id
     * 
     * @param id 
     * @return ApiResponse<SubscriptionPermissionsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsGetPermissionsWithHttpInfo(id: kotlin.String) : ApiResponse<SubscriptionPermissionsVM?> {
        val localVariableConfig = subscriptionsGetPermissionsRequestConfig(id = id)

        return request<Unit, SubscriptionPermissionsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsGetPermissions
     *
     * @param id 
     * @return RequestConfig
     */
    fun subscriptionsGetPermissionsRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions/{id}/permissions".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Returns the subscription by id
     * 
     * @param id Identifier of subscription
     * @return SubscriptionVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsGetSubscription(id: kotlin.String) : SubscriptionVM {
        val localVarResponse = subscriptionsGetSubscriptionWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionVM
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
     * Returns the subscription by id
     * 
     * @param id Identifier of subscription
     * @return ApiResponse<SubscriptionVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsGetSubscriptionWithHttpInfo(id: kotlin.String) : ApiResponse<SubscriptionVM?> {
        val localVariableConfig = subscriptionsGetSubscriptionRequestConfig(id = id)

        return request<Unit, SubscriptionVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsGetSubscription
     *
     * @param id Identifier of subscription
     * @return RequestConfig
     */
    fun subscriptionsGetSubscriptionRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Returns a list of all subscriptions of current user
     * 
     * @param skip Variable for pagination, defautl value is 0 (optional, default to 0)
     * @param take Variable for pagination, default value is 10 (optional, default to 10)
     * @return SubscriptionsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsGetSubscriptions(skip: kotlin.Int? = 0, take: kotlin.Int? = 10) : SubscriptionsVM {
        val localVarResponse = subscriptionsGetSubscriptionsWithHttpInfo(skip = skip, take = take)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionsVM
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
     * Returns a list of all subscriptions of current user
     * 
     * @param skip Variable for pagination, defautl value is 0 (optional, default to 0)
     * @param take Variable for pagination, default value is 10 (optional, default to 10)
     * @return ApiResponse<SubscriptionsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsGetSubscriptionsWithHttpInfo(skip: kotlin.Int?, take: kotlin.Int?) : ApiResponse<SubscriptionsVM?> {
        val localVariableConfig = subscriptionsGetSubscriptionsRequestConfig(skip = skip, take = take)

        return request<Unit, SubscriptionsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsGetSubscriptions
     *
     * @param skip Variable for pagination, defautl value is 0 (optional, default to 0)
     * @param take Variable for pagination, default value is 10 (optional, default to 10)
     * @return RequestConfig
     */
    fun subscriptionsGetSubscriptionsRequestConfig(skip: kotlin.Int?, take: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (skip != null) {
                    put("skip", listOf(skip.toString()))
                }
                if (take != null) {
                    put("take", listOf(take.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Rename subscription
     * 
     * @param subscriptionId id
     * @param renameSubscriptionVM rename VM
     * @return SubscriptionVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsRenameSubscription(subscriptionId: kotlin.String, renameSubscriptionVM: RenameSubscriptionVM) : SubscriptionVM {
        val localVarResponse = subscriptionsRenameSubscriptionWithHttpInfo(subscriptionId = subscriptionId, renameSubscriptionVM = renameSubscriptionVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionVM
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
     * Rename subscription
     * 
     * @param subscriptionId id
     * @param renameSubscriptionVM rename VM
     * @return ApiResponse<SubscriptionVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsRenameSubscriptionWithHttpInfo(subscriptionId: kotlin.String, renameSubscriptionVM: RenameSubscriptionVM) : ApiResponse<SubscriptionVM?> {
        val localVariableConfig = subscriptionsRenameSubscriptionRequestConfig(subscriptionId = subscriptionId, renameSubscriptionVM = renameSubscriptionVM)

        return request<RenameSubscriptionVM, SubscriptionVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsRenameSubscription
     *
     * @param subscriptionId id
     * @param renameSubscriptionVM rename VM
     * @return RequestConfig
     */
    fun subscriptionsRenameSubscriptionRequestConfig(subscriptionId: kotlin.String, renameSubscriptionVM: RenameSubscriptionVM) : RequestConfig<RenameSubscriptionVM> {
        val localVariableBody = renameSubscriptionVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/rename".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Change subscription&#39;s default permissions for new entities
     * 
     * @param subscriptionId id
     * @param updateDefaultPermissionsVM update default permissions VM
     * @return DefaultPermissionsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsUpdateDefaultPermissions(subscriptionId: kotlin.String, updateDefaultPermissionsVM: UpdateDefaultPermissionsVM) : DefaultPermissionsVM {
        val localVarResponse = subscriptionsUpdateDefaultPermissionsWithHttpInfo(subscriptionId = subscriptionId, updateDefaultPermissionsVM = updateDefaultPermissionsVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DefaultPermissionsVM
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
     * Change subscription&#39;s default permissions for new entities
     * 
     * @param subscriptionId id
     * @param updateDefaultPermissionsVM update default permissions VM
     * @return ApiResponse<DefaultPermissionsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsUpdateDefaultPermissionsWithHttpInfo(subscriptionId: kotlin.String, updateDefaultPermissionsVM: UpdateDefaultPermissionsVM) : ApiResponse<DefaultPermissionsVM?> {
        val localVariableConfig = subscriptionsUpdateDefaultPermissionsRequestConfig(subscriptionId = subscriptionId, updateDefaultPermissionsVM = updateDefaultPermissionsVM)

        return request<UpdateDefaultPermissionsVM, DefaultPermissionsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsUpdateDefaultPermissions
     *
     * @param subscriptionId id
     * @param updateDefaultPermissionsVM update default permissions VM
     * @return RequestConfig
     */
    fun subscriptionsUpdateDefaultPermissionsRequestConfig(subscriptionId: kotlin.String, updateDefaultPermissionsVM: UpdateDefaultPermissionsVM) : RequestConfig<UpdateDefaultPermissionsVM> {
        val localVariableBody = updateDefaultPermissionsVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/defaultPermissions".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update subscription&#39;s default locale
     * 
     * @param subscriptionId id
     * @param updateSubscriptionLocaleVM update VM
     * @return SubscriptionVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsUpdateLocale(subscriptionId: kotlin.String, updateSubscriptionLocaleVM: UpdateSubscriptionLocaleVM) : SubscriptionVM {
        val localVarResponse = subscriptionsUpdateLocaleWithHttpInfo(subscriptionId = subscriptionId, updateSubscriptionLocaleVM = updateSubscriptionLocaleVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionVM
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
     * Update subscription&#39;s default locale
     * 
     * @param subscriptionId id
     * @param updateSubscriptionLocaleVM update VM
     * @return ApiResponse<SubscriptionVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsUpdateLocaleWithHttpInfo(subscriptionId: kotlin.String, updateSubscriptionLocaleVM: UpdateSubscriptionLocaleVM) : ApiResponse<SubscriptionVM?> {
        val localVariableConfig = subscriptionsUpdateLocaleRequestConfig(subscriptionId = subscriptionId, updateSubscriptionLocaleVM = updateSubscriptionLocaleVM)

        return request<UpdateSubscriptionLocaleVM, SubscriptionVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsUpdateLocale
     *
     * @param subscriptionId id
     * @param updateSubscriptionLocaleVM update VM
     * @return RequestConfig
     */
    fun subscriptionsUpdateLocaleRequestConfig(subscriptionId: kotlin.String, updateSubscriptionLocaleVM: UpdateSubscriptionLocaleVM) : RequestConfig<UpdateSubscriptionLocaleVM> {
        val localVariableBody = updateSubscriptionLocaleVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/Locale".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update permissions
     * 
     * @param id 
     * @param updateSubscriptionPermissionsVM  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionsUpdatePermissions(id: kotlin.String, updateSubscriptionPermissionsVM: UpdateSubscriptionPermissionsVM? = null) : Unit {
        val localVarResponse = subscriptionsUpdatePermissionsWithHttpInfo(id = id, updateSubscriptionPermissionsVM = updateSubscriptionPermissionsVM)

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
     * @param id 
     * @param updateSubscriptionPermissionsVM  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionsUpdatePermissionsWithHttpInfo(id: kotlin.String, updateSubscriptionPermissionsVM: UpdateSubscriptionPermissionsVM?) : ApiResponse<Unit?> {
        val localVariableConfig = subscriptionsUpdatePermissionsRequestConfig(id = id, updateSubscriptionPermissionsVM = updateSubscriptionPermissionsVM)

        return request<UpdateSubscriptionPermissionsVM, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionsUpdatePermissions
     *
     * @param id 
     * @param updateSubscriptionPermissionsVM  (optional)
     * @return RequestConfig
     */
    fun subscriptionsUpdatePermissionsRequestConfig(id: kotlin.String, updateSubscriptionPermissionsVM: UpdateSubscriptionPermissionsVM?) : RequestConfig<UpdateSubscriptionPermissionsVM> {
        val localVariableBody = updateSubscriptionPermissionsVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/manage/v1/Subscriptions/{id}/permissions".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}