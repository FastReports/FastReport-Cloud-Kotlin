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

import cloud.fastreport.model.TaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param cronExpression 
 * @param delayedRunTime 
 * @param delayedWasRunTime 
 * @param id 
 * @param name 
 * @param recurrentRunTime 
 * @param recurrentWasRunTime 
 * @param subscriptionId 
 */


interface ThumbnailTemplateTaskVM : TaskBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "templateId")
    val templateId: kotlin.String?
}

