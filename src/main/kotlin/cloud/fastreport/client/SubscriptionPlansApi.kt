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

import cloud.fastreport.model.ProblemDetails
import cloud.fastreport.model.SubscriptionPlanVM
import cloud.fastreport.model.SubscriptionPlansVM

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

class SubscriptionPlansApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Returns a subscription plan. Not all subscriptions can be issued for customer.
     * 
     * @param id Identifier of subsctiption plan
     * @return SubscriptionPlanVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionPlansGetSubscriptionPlan(id: kotlin.String) : SubscriptionPlanVM {
        val localVarResponse = subscriptionPlansGetSubscriptionPlanWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionPlanVM
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
     * Returns a subscription plan. Not all subscriptions can be issued for customer.
     * 
     * @param id Identifier of subsctiption plan
     * @return ApiResponse<SubscriptionPlanVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionPlansGetSubscriptionPlanWithHttpInfo(id: kotlin.String) : ApiResponse<SubscriptionPlanVM?> {
        val localVariableConfig = subscriptionPlansGetSubscriptionPlanRequestConfig(id = id)

        return request<Unit, SubscriptionPlanVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionPlansGetSubscriptionPlan
     *
     * @param id Identifier of subsctiption plan
     * @return RequestConfig
     */
    fun subscriptionPlansGetSubscriptionPlanRequestConfig(id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/SubscriptionPlans/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Returns a list of active subscription plans that can be issued to the user.
     * If no active subscription plans, then the endpoint will return empty list
     * @param skip Variable for pagination, defautl value is 0 (optional, default to 0)
     * @param take Variable for pagination, default value is 10 (optional, default to 10)
     * @return SubscriptionPlansVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriptionPlansGetSubscriptionPlans(skip: kotlin.Int? = 0, take: kotlin.Int? = 10) : SubscriptionPlansVM {
        val localVarResponse = subscriptionPlansGetSubscriptionPlansWithHttpInfo(skip = skip, take = take)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SubscriptionPlansVM
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
     * Returns a list of active subscription plans that can be issued to the user.
     * If no active subscription plans, then the endpoint will return empty list
     * @param skip Variable for pagination, defautl value is 0 (optional, default to 0)
     * @param take Variable for pagination, default value is 10 (optional, default to 10)
     * @return ApiResponse<SubscriptionPlansVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriptionPlansGetSubscriptionPlansWithHttpInfo(skip: kotlin.Int?, take: kotlin.Int?) : ApiResponse<SubscriptionPlansVM?> {
        val localVariableConfig = subscriptionPlansGetSubscriptionPlansRequestConfig(skip = skip, take = take)

        return request<Unit, SubscriptionPlansVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriptionPlansGetSubscriptionPlans
     *
     * @param skip Variable for pagination, defautl value is 0 (optional, default to 0)
     * @param take Variable for pagination, default value is 10 (optional, default to 10)
     * @return RequestConfig
     */
    fun subscriptionPlansGetSubscriptionPlansRequestConfig(skip: kotlin.Int?, take: kotlin.Int?) : RequestConfig<Unit> {
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
            path = "/api/manage/v1/SubscriptionPlans",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}