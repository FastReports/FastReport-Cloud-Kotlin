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

import cloud.fastreport.model.AcceptAgreementsVM
import cloud.fastreport.model.ProblemDetails
import cloud.fastreport.model.UpdateUserSettingsVM
import cloud.fastreport.model.UserSettingsVM

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

class UserSettingsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Use this endpoint to accept current version of service license agreement
     * 
     * @param acceptAgreementsVM  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun userSettingsAcceptAgreements(acceptAgreementsVM: AcceptAgreementsVM? = null) : Unit {
        val localVarResponse = userSettingsAcceptAgreementsWithHttpInfo(acceptAgreementsVM = acceptAgreementsVM)

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
     * Use this endpoint to accept current version of service license agreement
     * 
     * @param acceptAgreementsVM  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun userSettingsAcceptAgreementsWithHttpInfo(acceptAgreementsVM: AcceptAgreementsVM?) : ApiResponse<Unit?> {
        val localVariableConfig = userSettingsAcceptAgreementsRequestConfig(acceptAgreementsVM = acceptAgreementsVM)

        return request<AcceptAgreementsVM, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userSettingsAcceptAgreements
     *
     * @param acceptAgreementsVM  (optional)
     * @return RequestConfig
     */
    fun userSettingsAcceptAgreementsRequestConfig(acceptAgreementsVM: AcceptAgreementsVM?) : RequestConfig<AcceptAgreementsVM> {
        val localVariableBody = acceptAgreementsVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        
        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/manage/v1/UserSettings/accept",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Return current user settings.
     * 
     * @return UserSettingsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun userSettingsGetCurrentUserSettings() : UserSettingsVM {
        val localVarResponse = userSettingsGetCurrentUserSettingsWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UserSettingsVM
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
     * Return current user settings.
     * 
     * @return ApiResponse<UserSettingsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun userSettingsGetCurrentUserSettingsWithHttpInfo() : ApiResponse<UserSettingsVM?> {
        val localVariableConfig = userSettingsGetCurrentUserSettingsRequestConfig()

        return request<Unit, UserSettingsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userSettingsGetCurrentUserSettings
     *
     * @return RequestConfig
     */
    fun userSettingsGetCurrentUserSettingsRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/manage/v1/UserSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update settings of the current user
     * 
     * @param updateUserSettingsVM  (optional)
     * @return UserSettingsVM
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun userSettingsUpdateMySettings(updateUserSettingsVM: UpdateUserSettingsVM? = null) : UserSettingsVM {
        val localVarResponse = userSettingsUpdateMySettingsWithHttpInfo(updateUserSettingsVM = updateUserSettingsVM)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UserSettingsVM
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
     * Update settings of the current user
     * 
     * @param updateUserSettingsVM  (optional)
     * @return ApiResponse<UserSettingsVM?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun userSettingsUpdateMySettingsWithHttpInfo(updateUserSettingsVM: UpdateUserSettingsVM?) : ApiResponse<UserSettingsVM?> {
        val localVariableConfig = userSettingsUpdateMySettingsRequestConfig(updateUserSettingsVM = updateUserSettingsVM)

        return request<UpdateUserSettingsVM, UserSettingsVM>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userSettingsUpdateMySettings
     *
     * @param updateUserSettingsVM  (optional)
     * @return RequestConfig
     */
    fun userSettingsUpdateMySettingsRequestConfig(updateUserSettingsVM: UpdateUserSettingsVM?) : RequestConfig<UpdateUserSettingsVM> {
        val localVariableBody = updateUserSettingsVM
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/manage/v1/UserSettings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
