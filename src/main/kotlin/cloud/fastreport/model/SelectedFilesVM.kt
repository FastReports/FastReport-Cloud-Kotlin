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


interface SelectedFilesVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "isAllSelected")
    val isAllSelected: kotlin.Boolean?
    @Json(name = "folderId")
    val folderId: kotlin.String?
    @Json(name = "searchPattern")
    val searchPattern: kotlin.String?
    @Json(name = "useRegex")
    val useRegex: kotlin.Boolean?
    @Json(name = "files")
    val files: kotlin.collections.List<kotlin.String>?
    @Json(name = "folders")
    val folders: kotlin.collections.List<kotlin.String>?
    @Json(name = "path")
    val path: kotlin.String?
    @Json(name = "isBin")
    val isBin: kotlin.Boolean?
}

