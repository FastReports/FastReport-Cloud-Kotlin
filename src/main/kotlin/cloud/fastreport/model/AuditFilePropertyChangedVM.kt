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
import cloud.fastreport.model.EntityType

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


interface AuditFilePropertyChangedVM : AuditActionVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "propertyName")
    val propertyName: kotlin.String?
    @Json(name = "oldValue")
    val oldValue: kotlin.Any?
    @Json(name = "newValue")
    val newValue: kotlin.Any?
    @Json(name = "entityType")
    val entityType: EntityType?
}

