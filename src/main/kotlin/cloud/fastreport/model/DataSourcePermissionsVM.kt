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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface DataSourcePermissionsVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "permissions")
    val permissions: DataSourcePermissionsCRUDVM?
}
