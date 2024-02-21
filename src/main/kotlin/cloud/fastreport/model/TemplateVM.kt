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

import cloud.fastreport.model.FileStatus
import cloud.fastreport.model.FileStatusReason
import cloud.fastreport.model.FileType
import cloud.fastreport.model.FileVM
import cloud.fastreport.model.ReportInfo

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param id 
 * @param createdTime 
 * @param creatorUserId 
 * @param editedTime 
 * @param editorUserId 
 * @param name 
 * @param parentId 
 * @param tags 
 * @param icon 
 * @param type 
 * @param propertySize 
 * @param subscriptionId 
 * @param status 
 * @param statusReason 
 * @param errorMessage 
 * @param isDeleted 
 */


interface TemplateVM : FileVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "reportInfo")
    val reportInfo: ReportInfo?
}
