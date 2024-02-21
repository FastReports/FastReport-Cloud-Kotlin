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

import cloud.fastreport.model.CreateTransformTaskBaseVM
import cloud.fastreport.model.CreateTransportTaskBaseVM
import cloud.fastreport.model.ExportFormat
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


interface CreateExportReportTaskVM : CreateTransformTaskBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "exportParameters")
    val exportParameters: kotlin.collections.Map<kotlin.String, kotlin.String>?
    @Json(name = "format")
    val format: ExportFormat?
    @Json(name = "pagesCount")
    val pagesCount: kotlin.Int?
}

