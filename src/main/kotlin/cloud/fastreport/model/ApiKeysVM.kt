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

import cloud.fastreport.model.ApiKeyVM
import cloud.fastreport.model.CloudBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface ApiKeysVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "apiKeys")
    val apiKeys: kotlin.collections.List<ApiKeyVM>?
    @Json(name = "count")
    val count: kotlin.Long?
}
