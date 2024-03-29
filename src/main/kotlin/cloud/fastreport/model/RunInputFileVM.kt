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

import cloud.fastreport.model.FileKind
import cloud.fastreport.model.InputFileVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param entityId 
 * @param type 
 */


interface RunInputFileVM : InputFileVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "content")
    val content: kotlin.ByteArray?
    @Json(name = "fileName")
    val fileName: kotlin.String?
}

