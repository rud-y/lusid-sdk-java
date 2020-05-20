/*
 * LUSID API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1392
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionConfigurationTypeAlias
 */

public class TransactionConfigurationTypeAlias {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRANSACTION_CLASS = "transactionClass";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CLASS)
  private String transactionClass;

  public static final String SERIALIZED_NAME_TRANSACTION_GROUP = "transactionGroup";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_GROUP)
  private String transactionGroup;

  /**
   * Transactions role within a class. E.g. Increase a long position
   */
  @JsonAdapter(TransactionRolesEnum.Adapter.class)
  public enum TransactionRolesEnum {
    NONE("None"),
    
    LONGLONGER("LongLonger"),
    
    LONGSHORTER("LongShorter"),
    
    SHORTSHORTER("ShortShorter"),
    
    SHORTLONGER("ShortLonger"),
    
    LONGER("Longer"),
    
    SHORTER("Shorter"),
    
    ALLROLES("AllRoles");

    private String value;

    TransactionRolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionRolesEnum fromValue(String value) {
      for (TransactionRolesEnum b : TransactionRolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionRolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionRolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionRolesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionRolesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_ROLES = "transactionRoles";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ROLES)
  private TransactionRolesEnum transactionRoles;

  public TransactionConfigurationTypeAlias type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The transaction type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The transaction type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionConfigurationTypeAlias description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of the transaction
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Brief description of the transaction")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransactionConfigurationTypeAlias transactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
    return this;
  }

   /**
   * Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut
   * @return transactionClass
  **/
  @ApiModelProperty(required = true, value = "Relates types of a similar class. E.g. Buy/Sell, StockIn/StockOut")
  public String getTransactionClass() {
    return transactionClass;
  }

  public void setTransactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
  }

  public TransactionConfigurationTypeAlias transactionGroup(String transactionGroup) {
    this.transactionGroup = transactionGroup;
    return this;
  }

   /**
   * Group is a set of codes related to a source, or sync
   * @return transactionGroup
  **/
  @ApiModelProperty(required = true, value = "Group is a set of codes related to a source, or sync")
  public String getTransactionGroup() {
    return transactionGroup;
  }

  public void setTransactionGroup(String transactionGroup) {
    this.transactionGroup = transactionGroup;
  }

  public TransactionConfigurationTypeAlias transactionRoles(TransactionRolesEnum transactionRoles) {
    this.transactionRoles = transactionRoles;
    return this;
  }

   /**
   * Transactions role within a class. E.g. Increase a long position
   * @return transactionRoles
  **/
  @ApiModelProperty(required = true, value = "Transactions role within a class. E.g. Increase a long position")
  public TransactionRolesEnum getTransactionRoles() {
    return transactionRoles;
  }

  public void setTransactionRoles(TransactionRolesEnum transactionRoles) {
    this.transactionRoles = transactionRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionConfigurationTypeAlias transactionConfigurationTypeAlias = (TransactionConfigurationTypeAlias) o;
    return Objects.equals(this.type, transactionConfigurationTypeAlias.type) &&
        Objects.equals(this.description, transactionConfigurationTypeAlias.description) &&
        Objects.equals(this.transactionClass, transactionConfigurationTypeAlias.transactionClass) &&
        Objects.equals(this.transactionGroup, transactionConfigurationTypeAlias.transactionGroup) &&
        Objects.equals(this.transactionRoles, transactionConfigurationTypeAlias.transactionRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, transactionClass, transactionGroup, transactionRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionConfigurationTypeAlias {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionClass: ").append(toIndentedString(transactionClass)).append("\n");
    sb.append("    transactionGroup: ").append(toIndentedString(transactionGroup)).append("\n");
    sb.append("    transactionRoles: ").append(toIndentedString(transactionRoles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
