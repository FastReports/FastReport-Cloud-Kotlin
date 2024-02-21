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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param cronExpression 
 * @param delayedRunTime 
 * @param name 
 * @param subscriptionId 
 */


interface CreateFetchTaskVM : CreateTaskBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "dataSourceId")
    val dataSourceId: kotlin.String?
}

