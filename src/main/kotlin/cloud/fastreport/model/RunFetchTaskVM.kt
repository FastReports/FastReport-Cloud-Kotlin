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

import cloud.fastreport.model.RunTaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param subscriptionId 
 */


interface RunFetchTaskVM : RunTaskBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "dataSourceId")
    val dataSourceId: kotlin.String?
}

