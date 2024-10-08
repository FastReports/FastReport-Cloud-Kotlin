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
import cloud.fastreport.model.DataSourceSelectCommandVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface UpdateDataSourceVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "subscriptionId")
    val subscriptionId: kotlin.String?
    @Json(name = "connectionString")
    val connectionString: kotlin.String?
    @Json(name = "selectCommands")
    val selectCommands: kotlin.collections.List<DataSourceSelectCommandVM>?
}

