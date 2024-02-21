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
import cloud.fastreport.model.DataSourceVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface DataSourcesVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "dataSources")
    val dataSources: kotlin.collections.List<DataSourceVM>?
    @Json(name = "count")
    val count: kotlin.Long?
    @Json(name = "skip")
    val skip: kotlin.Int?
    @Json(name = "take")
    val take: kotlin.Int?
}

