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

import cloud.fastreport.model.FileCreateFormVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param fileContent 
 * @param dollarT 
 * @param tags 
 * @param icon 
 */


interface ReportCreateFormVM : FileCreateFormVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "templateId")
    val templateId: kotlin.String?
}

