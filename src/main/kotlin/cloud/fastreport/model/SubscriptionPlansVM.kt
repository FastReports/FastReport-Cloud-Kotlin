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
import cloud.fastreport.model.SubscriptionPlanVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface SubscriptionPlansVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "subscriptionPlans")
    val subscriptionPlans: kotlin.collections.List<SubscriptionPlanVM>?
    @Json(name = "count")
    val count: kotlin.Long?
    @Json(name = "skip")
    val skip: kotlin.Int?
    @Json(name = "take")
    val take: kotlin.Int?
}

