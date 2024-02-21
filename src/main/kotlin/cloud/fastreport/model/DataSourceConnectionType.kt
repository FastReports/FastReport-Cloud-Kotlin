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
 * Values: jSON,mSSQL,cSV,xML,mySQL,postgres,oracleDB,firebirdDB,mongoDB,clickHouse
 */

@JsonClass(generateAdapter = false)
enum class DataSourceConnectionType(val value: kotlin.String) {

    @Json(name = "JSON")
    jSON("JSON"),

    @Json(name = "MSSQL")
    mSSQL("MSSQL"),

    @Json(name = "CSV")
    cSV("CSV"),

    @Json(name = "XML")
    xML("XML"),

    @Json(name = "MySQL")
    mySQL("MySQL"),

    @Json(name = "Postgres")
    postgres("Postgres"),

    @Json(name = "OracleDB")
    oracleDB("OracleDB"),

    @Json(name = "FirebirdDB")
    firebirdDB("FirebirdDB"),

    @Json(name = "MongoDB")
    mongoDB("MongoDB"),

    @Json(name = "ClickHouse")
    clickHouse("ClickHouse");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is DataSourceConnectionType) "$data" else null

        /**
         * Returns a valid [DataSourceConnectionType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): DataSourceConnectionType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

