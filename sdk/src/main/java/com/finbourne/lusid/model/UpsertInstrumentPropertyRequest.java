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
import com.finbourne.lusid.model.Property;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpsertInstrumentPropertyRequest
 */

public class UpsertInstrumentPropertyRequest {
  public static final String SERIALIZED_NAME_IDENTIFIER_TYPE = "identifierType";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_TYPE)
  private String identifierType;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<Property> properties = new ArrayList<>();

  public UpsertInstrumentPropertyRequest identifierType(String identifierType) {
    this.identifierType = identifierType;
    return this;
  }

   /**
   * The instrument identifier type.
   * @return identifierType
  **/
  @ApiModelProperty(required = true, value = "The instrument identifier type.")
  public String getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }

  public UpsertInstrumentPropertyRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The unique instrument identifier of the instrument to update or insert properties on.
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "The unique instrument identifier of the instrument to update or insert properties on.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public UpsertInstrumentPropertyRequest properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public UpsertInstrumentPropertyRequest addPropertiesItem(Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Set of unique instrument properties and associated values to store with the instrument. Each property must be from the &#39;Instrument&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "Set of unique instrument properties and associated values to store with the instrument. Each property must be from the 'Instrument' domain.")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertInstrumentPropertyRequest upsertInstrumentPropertyRequest = (UpsertInstrumentPropertyRequest) o;
    return Objects.equals(this.identifierType, upsertInstrumentPropertyRequest.identifierType) &&
        Objects.equals(this.identifier, upsertInstrumentPropertyRequest.identifier) &&
        Objects.equals(this.properties, upsertInstrumentPropertyRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierType, identifier, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertInstrumentPropertyRequest {\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
