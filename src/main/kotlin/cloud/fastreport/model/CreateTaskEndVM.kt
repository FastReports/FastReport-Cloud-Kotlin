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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param after 
 * @param on 
 */


data class CreateTaskEndVM (

    @Json(name = "after")
    val after: kotlin.Int? = null,

    @Json(name = "on")
    val on: java.time.OffsetDateTime? = null

)

