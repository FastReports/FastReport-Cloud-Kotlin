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
import cloud.fastreport.model.GroupAdministrate
import cloud.fastreport.model.GroupPermissionsCRUDVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface UpdateGroupPermissionsVM : CloudBaseVM {

    @Json(name = "newPermissions")
    val newPermissions: GroupPermissionsCRUDVM
    @Json(name = "administrate")
    val administrate: GroupAdministrate
    @Json(name = "\$t")
    override val dollarT: kotlin.String
}

