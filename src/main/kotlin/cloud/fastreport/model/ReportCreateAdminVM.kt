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

import cloud.fastreport.model.ReportCreateVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param templateId 
 * @param name 
 * @param tags 
 * @param icon 
 * @param content 
 */


interface ReportCreateAdminVM : ReportCreateVM {

    @Json(name = "ownerId")
    val ownerId: kotlin.String
    @Json(name = "parentId")
    val parentId: kotlin.String
    @Json(name = "\$t")
    override val dollarT: kotlin.String
}

