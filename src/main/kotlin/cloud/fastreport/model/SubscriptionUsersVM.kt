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
import cloud.fastreport.model.SubscriptionUserVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface SubscriptionUsersVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "users")
    val users: kotlin.collections.List<SubscriptionUserVM>?
    @Json(name = "count")
    val count: kotlin.Long?
    @Json(name = "take")
    val take: kotlin.Int?
    @Json(name = "skip")
    val skip: kotlin.Int?
}

