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

import cloud.fastreport.model.FilePermissionCRUDVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param expires 
 * @param name 
 * @param permission 
 * @param key 
 */


data class FileShareVM (

    @Json(name = "expires")
    val expires: java.time.OffsetDateTime? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "permission")
    val permission: FilePermissionCRUDVM? = null,

    @Json(name = "key")
    val key: kotlin.String? = null

)

