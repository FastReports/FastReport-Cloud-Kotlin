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

import cloud.fastreport.model.FilesVMBase
import cloud.fastreport.model.TemplateVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param files 
 * @param count 
 * @param skip 
 * @param take 
 */


interface TemplatesVM : FilesVMBase {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "files")
    val files: kotlin.collections.List<TemplateVM>?
}
