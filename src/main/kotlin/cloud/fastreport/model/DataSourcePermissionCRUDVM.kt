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
import cloud.fastreport.model.DataSourceAdministrate
import cloud.fastreport.model.DataSourceCreate
import cloud.fastreport.model.DataSourceDelete
import cloud.fastreport.model.DataSourceExecute
import cloud.fastreport.model.DataSourceGet
import cloud.fastreport.model.DataSourceUpdate

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface DataSourcePermissionCRUDVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "create")
    val create: DataSourceCreate?
    @Json(name = "delete")
    val delete: DataSourceDelete?
    @Json(name = "execute")
    val execute: DataSourceExecute?
    @Json(name = "get")
    val get: DataSourceGet?
    @Json(name = "update")
    val update: DataSourceUpdate?
    @Json(name = "administrate")
    val administrate: DataSourceAdministrate?
}

