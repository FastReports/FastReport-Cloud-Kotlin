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
import cloud.fastreport.model.TaskAdministrate
import cloud.fastreport.model.TaskCreate
import cloud.fastreport.model.TaskDelete
import cloud.fastreport.model.TaskExecute
import cloud.fastreport.model.TaskGet
import cloud.fastreport.model.TaskUpdate

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface TaskPermissionCRUDVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "create")
    val create: TaskCreate?
    @Json(name = "delete")
    val delete: TaskDelete?
    @Json(name = "execute")
    val execute: TaskExecute?
    @Json(name = "get")
    val get: TaskGet?
    @Json(name = "update")
    val update: TaskUpdate?
    @Json(name = "administrate")
    val administrate: TaskAdministrate?
}

