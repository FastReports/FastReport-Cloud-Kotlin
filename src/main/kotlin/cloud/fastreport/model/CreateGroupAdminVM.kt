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

import cloud.fastreport.model.CreateGroupVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param dollarT 
 * @param subscriptionId 
 */


interface CreateGroupAdminVM : CreateGroupVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "ownerId")
    val ownerId: kotlin.String?
}
