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
import cloud.fastreport.model.TaskSettingsVM
import cloud.fastreport.model.TimePeriodType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 */


interface SubscriptionPlanVM : CloudBaseVM {

    @Json(name = "\$t")
    override val dollarT: kotlin.String
    @Json(name = "id")
    val id: kotlin.String?
    @Json(name = "isActive")
    val isActive: kotlin.Boolean?
    @Json(name = "displayName")
    val displayName: kotlin.String?
    @Json(name = "timePeriodType")
    val timePeriodType: TimePeriodType?
    @Json(name = "timePeriod")
    val timePeriod: kotlin.Int?
    @Json(name = "readonlyTimeLimitType")
    val readonlyTimeLimitType: TimePeriodType?
    @Json(name = "readonlyTimeLimit")
    val readonlyTimeLimit: kotlin.Int?
    @Json(name = "templatesSpaceLimit")
    val templatesSpaceLimit: kotlin.Long?
    @Json(name = "reportsSpaceLimit")
    val reportsSpaceLimit: kotlin.Long?
    @Json(name = "exportsSpaceLimit")
    val exportsSpaceLimit: kotlin.Long?
    @Json(name = "fileUploadSizeLimit")
    val fileUploadSizeLimit: kotlin.Long?
    @Json(name = "dataSourceLimit")
    val dataSourceLimit: kotlin.Int?
    @Json(name = "maxUsersCount")
    val maxUsersCount: kotlin.Int?
    @Json(name = "groupLimit")
    val groupLimit: kotlin.Int?
    @Json(name = "onlineDesigner")
    val onlineDesigner: kotlin.Boolean?
    @Json(name = "isDemo")
    val isDemo: kotlin.Boolean?
    @Json(name = "urlToBuy")
    val urlToBuy: kotlin.String?
    @Json(name = "unlimitedPage")
    val unlimitedPage: kotlin.Boolean?
    @Json(name = "pageLimit")
    val pageLimit: kotlin.Int?
    @Json(name = "tasks")
    val tasks: TaskSettingsVM?
}

