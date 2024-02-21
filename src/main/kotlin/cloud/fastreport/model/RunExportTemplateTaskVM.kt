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

import cloud.fastreport.model.ExportFormat
import cloud.fastreport.model.OutputFileVM
import cloud.fastreport.model.RunExportReportTaskVM
import cloud.fastreport.model.RunInputFileVM
import cloud.fastreport.model.RunTransportTaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param exportParameters 
 * @param format 
 * @param pagesCount 
 * @param inputFile 
 * @param locale 
 * @param outputFile 
 * @param transports 
 * @param subscriptionId 
 */


interface RunExportTemplateTaskVM : RunExportReportTaskVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "reportParameters")
    val reportParameters: kotlin.collections.Map<kotlin.String, kotlin.String>?
}

