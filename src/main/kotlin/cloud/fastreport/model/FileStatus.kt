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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: none,inQueue,inProcess,success,failed
 */

@JsonClass(generateAdapter = false)
enum class FileStatus(val value: kotlin.String) {

    @Json(name = "None")
    none("None"),

    @Json(name = "InQueue")
    inQueue("InQueue"),

    @Json(name = "InProcess")
    inProcess("InProcess"),

    @Json(name = "Success")
    success("Success"),

    @Json(name = "Failed")
    failed("Failed");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FileStatus) "$data" else null

        /**
         * Returns a valid [FileStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FileStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

