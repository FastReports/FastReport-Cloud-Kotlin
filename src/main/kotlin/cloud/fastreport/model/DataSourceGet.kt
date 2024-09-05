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
 * Values: _0,_1,_2,_4,_8,_16,minus1
 */

@JsonClass(generateAdapter = false)
enum class DataSourceGet(val value: kotlin.Int) {

    @Json(name = "0")
    _0(0),

    @Json(name = "1")
    _1(1),

    @Json(name = "2")
    _2(2),

    @Json(name = "4")
    _4(4),

    @Json(name = "8")
    _8(8),

    @Json(name = "16")
    _16(16),

    @Json(name = "-1")
    minus1(-1);

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value.toString()

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DataSourceGet) "$data" else null

        /**
         * Returns a valid [DataSourceGet] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): DataSourceGet? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

