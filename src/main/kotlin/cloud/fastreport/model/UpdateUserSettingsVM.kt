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

import cloud.fastreport.model.AuditType
import cloud.fastreport.model.CloudBaseVM
import cloud.fastreport.model.ProfileVisibility

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface UpdateUserSettingsVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "profileVisibility")
    val profileVisibility: ProfileVisibility?
    @Json(name = "defaultSubscription")
    val defaultSubscription: kotlin.String?
    @Json(name = "showHiddenFilesAndFolders")
    val showHiddenFilesAndFolders: kotlin.Boolean?
    @Json(name = "subscribedNotifications")
    val subscribedNotifications: kotlin.collections.List<AuditType>?
}

