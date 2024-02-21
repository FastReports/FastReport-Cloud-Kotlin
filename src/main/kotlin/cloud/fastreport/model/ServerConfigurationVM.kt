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

import cloud.fastreport.model.AuthConfigVM
import cloud.fastreport.model.CloudBaseVM
import cloud.fastreport.model.FrontendAppVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface ServerConfigurationVM : CloudBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "title")
    val title: kotlin.String?
    @Json(name = "logoLink")
    val logoLink: kotlin.String?
    @Json(name = "copyright")
    val copyright: kotlin.String?
    @Json(name = "corporateServerMode")
    val corporateServerMode: kotlin.Boolean?
    @Json(name = "lastSLAVersion")
    val lastSLAVersion: java.time.OffsetDateTime?
    @Json(name = "isDisabled")
    val isDisabled: kotlin.Boolean?
    @Json(name = "frontend")
    val frontend: FrontendAppVM?
    @Json(name = "invariantLocale")
    val invariantLocale: kotlin.String?
    @Json(name = "auth")
    val auth: AuthConfigVM?
    @Json(name = "designerForAnons")
    val designerForAnons: kotlin.Boolean?
    @Json(name = "slaLink")
    val slaLink: kotlin.String?
    @Json(name = "firstStepsVideoLink")
    val firstStepsVideoLink: kotlin.String?
    @Json(name = "aboutLink")
    val aboutLink: kotlin.String?
    @Json(name = "homePageLink")
    val homePageLink: kotlin.String?
    @Json(name = "authServerName")
    val authServerName: kotlin.String?
    @Json(name = "updateWorkspaceLink")
    val updateWorkspaceLink: kotlin.String?
}

