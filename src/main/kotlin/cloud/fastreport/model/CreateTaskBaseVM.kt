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

import cloud.fastreport.model.CloudBaseVM
import cloud.fastreport.model.CreateTaskEndVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface CreateTaskBaseVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "cronExpression")
    val cronExpression: kotlin.String?
    @Json(name = "startsOn")
    val startsOn: java.time.OffsetDateTime?
    @Json(name = "ends")
    val ends: CreateTaskEndVM?
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "subscriptionId")
    val subscriptionId: kotlin.String?
}

