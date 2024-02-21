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

import cloud.fastreport.model.AuditActionVM
import cloud.fastreport.model.AuditType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param userId 
 * @param entityId 
 * @param subscriptionId 
 * @param type 
 * @param id 
 * @param createdTime 
 * @param creatorUserId 
 * @param name 
 * @param adminAction 
 */


interface AuditSubscriptionActionVM : AuditActionVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "periodStart")
    val periodStart: java.time.OffsetDateTime?
    @Json(name = "periodEnd")
    val periodEnd: java.time.OffsetDateTime?
    @Json(name = "planId")
    val planId: kotlin.String?
}

