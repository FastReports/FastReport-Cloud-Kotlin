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

import cloud.fastreport.model.CreateExportReportTaskVM
import cloud.fastreport.model.CreateTransformTaskBaseVM
import cloud.fastreport.model.CreateTransportTaskBaseVM
import cloud.fastreport.model.InputFileVM
import cloud.fastreport.model.OutputFileVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param inputFile 
 * @param locale 
 * @param outputFile 
 * @param transports 
 * @param cronExpression 
 * @param delayedRunTime 
 * @param name 
 * @param subscriptionId 
 */


interface CreatePrepareTemplateTaskVM : CreateTransformTaskBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "exports")
    val exports: kotlin.collections.List<CreateExportReportTaskVM>?
    @Json(name = "pagesCount")
    val pagesCount: kotlin.Int?
    @Json(name = "reportParameters")
    val reportParameters: kotlin.collections.Map<kotlin.String, kotlin.String>?
}

