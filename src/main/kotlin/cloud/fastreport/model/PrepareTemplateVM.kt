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

import cloud.fastreport.model.CloudBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface PrepareTemplateVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "locale")
    val locale: kotlin.String?
    @Json(name = "folderId")
    val folderId: kotlin.String?
    @Json(name = "pagesCount")
    val pagesCount: kotlin.Int?
    @Json(name = "reportParameters")
    val reportParameters: kotlin.collections.Map<kotlin.String, kotlin.String>?
}

