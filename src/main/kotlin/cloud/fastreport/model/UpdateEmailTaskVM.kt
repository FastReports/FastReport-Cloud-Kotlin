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

package cloud.fastreport.model

import cloud.fastreport.model.CreateTaskEndVM
import cloud.fastreport.model.InputFileVM
import cloud.fastreport.model.UpdateTransportTaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param inputFile 
 * @param cronExpression 
 * @param startsOn 
 * @param ends 
 * @param name 
 */


interface UpdateEmailTaskVM : UpdateTransportTaskBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "body")
    val body: kotlin.String?
    @Json(name = "enableSsl")
    val enableSsl: kotlin.Boolean?
    @Json(name = "from")
    val from: kotlin.String?
    @Json(name = "isBodyHtml")
    val isBodyHtml: kotlin.Boolean?
    @Json(name = "password")
    val password: kotlin.String?
    @Json(name = "port")
    val port: kotlin.Int?
    @Json(name = "server")
    val server: kotlin.String?
    @Json(name = "subject")
    val subject: kotlin.String?
    @Json(name = "to")
    val to: kotlin.collections.List<kotlin.String>?
    @Json(name = "username")
    val username: kotlin.String?
}

