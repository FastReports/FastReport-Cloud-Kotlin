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

import cloud.fastreport.model.CreateTaskBaseVM
import cloud.fastreport.model.CreateTaskEndVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param cronExpression 
 * @param startsOn 
 * @param ends 
 * @param name 
 * @param subscriptionId 
 */


interface CreateFetchTaskVM : CreateTaskBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "dataSourceId")
    val dataSourceId: kotlin.String?
}

