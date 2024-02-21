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


interface AuditTaskActionVM : AuditActionVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "messageId")
    val messageId: kotlin.String?
    @Json(name = "fileName")
    val fileName: kotlin.String?
}

