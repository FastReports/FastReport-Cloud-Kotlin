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

import cloud.fastreport.model.RunInputFileVM
import cloud.fastreport.model.RunTransportTaskBaseVM

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param dollarT 
 * @param inputFile 
 * @param subscriptionId 
 */


interface RunFTPUploadTaskVM : RunTransportTaskBaseVM {

    @Json(name = "\$t")
    val dollarT: kotlin.String
    @Json(name = "archive")
    val archive: kotlin.Boolean?
    @Json(name = "archiveName")
    val archiveName: kotlin.String?
    @Json(name = "destinationFolder")
    val destinationFolder: kotlin.String?
    @Json(name = "ftpHost")
    val ftpHost: kotlin.String?
    @Json(name = "ftpPassword")
    val ftpPassword: kotlin.String?
    @Json(name = "ftpPort")
    val ftpPort: kotlin.Int?
    @Json(name = "ftpUsername")
    val ftpUsername: kotlin.String?
    @Json(name = "useSFTP")
    val useSFTP: kotlin.Boolean?
}
