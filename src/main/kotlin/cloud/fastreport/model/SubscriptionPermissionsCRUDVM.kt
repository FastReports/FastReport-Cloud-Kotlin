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
import cloud.fastreport.model.SubscriptionPermissionCRUDVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface SubscriptionPermissionsCRUDVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "ownerId")
    val ownerId: kotlin.String?
    @Json(name = "owner")
    val owner: SubscriptionPermissionCRUDVM?
    @Json(name = "groups")
    val groups: kotlin.collections.Map<kotlin.String, SubscriptionPermissionCRUDVM>?
    @Json(name = "other")
    val other: SubscriptionPermissionCRUDVM?
    @Json(name = "anon")
    val anon: SubscriptionPermissionCRUDVM?
}

