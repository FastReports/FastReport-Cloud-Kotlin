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

import cloud.fastreport.model.InputFileVM
import cloud.fastreport.model.TransportTaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param inputFile 
 * @param cronExpression 
 * @param delayedRunTime 
 * @param delayedWasRunTime 
 * @param id 
 * @param name 
 * @param recurrentRunTime 
 * @param recurrentWasRunTime 
 * @param subscriptionId 
 */


interface WebhookTaskVM : TransportTaskBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>?
    @Json(name = "url")
    val url: java.net.URI?
}
