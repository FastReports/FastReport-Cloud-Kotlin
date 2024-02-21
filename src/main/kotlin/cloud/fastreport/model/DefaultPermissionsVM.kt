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
import cloud.fastreport.model.DataSourcePermissionsCRUDVM
import cloud.fastreport.model.FilePermissionsCRUDVM
import cloud.fastreport.model.GroupPermissionsCRUDVM
import cloud.fastreport.model.TaskPermissionsCRUDVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface DefaultPermissionsVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "filePermissions")
    val filePermissions: FilePermissionsCRUDVM?
    @Json(name = "dataSourcePermissions")
    val dataSourcePermissions: DataSourcePermissionsCRUDVM?
    @Json(name = "groupPermissions")
    val groupPermissions: GroupPermissionsCRUDVM?
    @Json(name = "taskPermissions")
    val taskPermissions: TaskPermissionsCRUDVM?
}

