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

import cloud.fastreport.model.AdminFolderCreateVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param parentId 
 * @param ownerId 
 * @param dollarT 
 * @param force 
 * @param name 
 * @param tags 
 * @param icon 
 */


interface AdminTemplateFolderCreateVM : AdminFolderCreateVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
}
