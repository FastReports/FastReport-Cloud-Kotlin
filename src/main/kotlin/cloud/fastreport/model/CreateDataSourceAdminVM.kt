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

import cloud.fastreport.model.CreateDataSourceVM
import cloud.fastreport.model.DataSourceConnectionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param connectionString 
 * @param subscriptionId 
 * @param dollarT 
 * @param name 
 * @param connectionType 
 */


interface CreateDataSourceAdminVM : CreateDataSourceVM {

    @Json(name = "ownerId")
    val ownerId: kotlin.String
    @Json(name = "\$t")
    val dollarT: kotlin.String
}

