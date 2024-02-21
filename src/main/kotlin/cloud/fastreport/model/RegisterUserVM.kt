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

import cloud.fastreport.model.AdminPermission
import cloud.fastreport.model.CloudBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface RegisterUserVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "subscriptions")
    val subscriptions: kotlin.collections.List<kotlin.String>?
    @Json(name = "groups")
    val groups: kotlin.collections.List<kotlin.String>?
    @Json(name = "adminPermission")
    val adminPermission: AdminPermission?
    @Json(name = "name")
    val name: kotlin.String?
    @Json(name = "username")
    val username: kotlin.String?
    @Json(name = "email")
    val email: kotlin.String?
    @Json(name = "password")
    val password: kotlin.String?
    @Json(name = "isAdmin")
    val isAdmin: kotlin.Boolean?
    @Json(name = "provider")
    val provider: kotlin.String?
}
