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

import cloud.fastreport.model.FileCreateVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param name 
 * @param tags 
 * @param icon 
 * @param content 
 */


interface ReportCreateVM : FileCreateVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "templateId")
    val templateId: kotlin.String?
}

