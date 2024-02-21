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

import cloud.fastreport.model.CreateSubscriptionInviteVM
import cloud.fastreport.model.ProblemDetails
import cloud.fastreport.model.SubscriptionInviteVM
import cloud.fastreport.model.SubscriptionInvitesVM

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

class SubscriptionInvitesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
     * 
     * @param subscriptionId Idenitifier of subscription
     * @param accessToken access token of the subscription
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionInvitesAcceptInvite(subscriptionId: kotlin.String, accessToken: kotlin.String) : Unit {
        val localVarResponse = subscriptionInvitesAcceptInviteWithHttpInfo(subscriptionId = subscriptionId, accessToken = accessToken)

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
     * Add a user to the subscription using invite,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
     * 
     * @param subscriptionId Idenitifier of subscription
     * @param accessToken access token of the subscription
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionInvitesAcceptInviteWithHttpInfo(subscriptionId: kotlin.String, accessToken: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = subscriptionInvitesAcceptInviteRequestConfig(subscriptionId = subscriptionId, accessToken = accessToken)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionInvitesAcceptInvite
     *
     * @param subscriptionId Idenitifier of subscription
     * @param accessToken access token of the subscription
     * @return RequestConfig
     */
    fun subscriptionInvitesAcceptInviteRequestConfig(subscriptionId: kotlin.String, accessToken: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/invite/{accessToken}/accept".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())).replace("{"+"accessToken"+"}", encodeURIComponent(accessToken.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Create invite to subscription
     * 
     * @param subscriptionId id
     * @param createSubscriptionInviteVM create VM (optional)
     * @return SubscriptionInviteVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionInvitesCreateInvite(subscriptionId: kotlin.String, createSubscriptionInviteVM: CreateSubscriptionInviteVM? = null) : SubscriptionInviteVM {
        val localVarResponse = subscriptionInvitesCreateInviteWithHttpInfo(subscriptionId = subscriptionId, createSubscriptionInviteVM = createSubscriptionInviteVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionInviteVM
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
     * Create invite to subscription
     * 
     * @param subscriptionId id
     * @param createSubscriptionInviteVM create VM (optional)
     * @return ApiResponse<SubscriptionInviteVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionInvitesCreateInviteWithHttpInfo(subscriptionId: kotlin.String, createSubscriptionInviteVM: CreateSubscriptionInviteVM?) : ApiResponse<SubscriptionInviteVM?> {
        val localVariableConfig = subscriptionInvitesCreateInviteRequestConfig(subscriptionId = subscriptionId, createSubscriptionInviteVM = createSubscriptionInviteVM)

        return request<CreateSubscriptionInviteVM, SubscriptionInviteVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionInvitesCreateInvite
     *
     * @param subscriptionId id
     * @param createSubscriptionInviteVM create VM (optional)
     * @return RequestConfig
     */
    fun subscriptionInvitesCreateInviteRequestConfig(subscriptionId: kotlin.String, createSubscriptionInviteVM: CreateSubscriptionInviteVM?) : RequestConfig<CreateSubscriptionInviteVM> {
        val localVariableBody = createSubscriptionInviteVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/invite".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete invite with specified token
     * 
     * @param subscriptionId id
     * @param accesstoken invite&#39;s token
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionInvitesDeleteInvite(subscriptionId: kotlin.String, accesstoken: kotlin.String) : Unit {
        val localVarResponse = subscriptionInvitesDeleteInviteWithHttpInfo(subscriptionId = subscriptionId, accesstoken = accesstoken)

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
     * Delete invite with specified token
     * 
     * @param subscriptionId id
     * @param accesstoken invite&#39;s token
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionInvitesDeleteInviteWithHttpInfo(subscriptionId: kotlin.String, accesstoken: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = subscriptionInvitesDeleteInviteRequestConfig(subscriptionId = subscriptionId, accesstoken = accesstoken)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionInvitesDeleteInvite
     *
     * @param subscriptionId id
     * @param accesstoken invite&#39;s token
     * @return RequestConfig
     */
    fun subscriptionInvitesDeleteInviteRequestConfig(subscriptionId: kotlin.String, accesstoken: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/invite/{accesstoken}".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())).replace("{"+"accesstoken"+"}", encodeURIComponent(accesstoken.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
     * 
     * @param subscriptionId Idenitifier of subscription
     * @return SubscriptionInvitesVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionInvitesGetInvites(subscriptionId: kotlin.String) : SubscriptionInvitesVM {
        val localVarResponse = subscriptionInvitesGetInvitesWithHttpInfo(subscriptionId = subscriptionId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionInvitesVM
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
     * Get list of invites in a subscription,  the added users will be displayed in the list of users of the subscription,  and these users will also have an active subscription.
     * 
     * @param subscriptionId Idenitifier of subscription
     * @return ApiResponse<SubscriptionInvitesVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionInvitesGetInvitesWithHttpInfo(subscriptionId: kotlin.String) : ApiResponse<SubscriptionInvitesVM?> {
        val localVariableConfig = subscriptionInvitesGetInvitesRequestConfig(subscriptionId = subscriptionId)

        return request<Unit, SubscriptionInvitesVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionInvitesGetInvites
     *
     * @param subscriptionId Idenitifier of subscription
     * @return RequestConfig
     */
    fun subscriptionInvitesGetInvitesRequestConfig(subscriptionId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/Subscriptions/{subscriptionId}/invites".replace("{"+"subscriptionId"+"}", encodeURIComponent(subscriptionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}