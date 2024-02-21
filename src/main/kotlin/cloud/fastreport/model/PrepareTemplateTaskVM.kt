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
import cloud.fastreport.model.OutputFileVM
import cloud.fastreport.model.TransformTaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param inputFile 
 * @param locale 
 * @param outputFile 
 * @param transportIds 
 * @param cronExpression 
 * @param delayedRunTime 
 * @param delayedWasRunTime 
 * @param id 
 * @param name 
 * @param recurrentRunTime 
 * @param recurrentWasRunTime 
 * @param subscriptionId 
 */


interface PrepareTemplateTaskVM : TransformTaskBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "exportIds")
    val exportIds: kotlin.collections.List<kotlin.String>?
    @Json(name = "pagesCount")
    val pagesCount: kotlin.Int?
    @Json(name = "reportParameters")
    val reportParameters: kotlin.collections.Map<kotlin.String, kotlin.String>?
}
