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
import com.finbourne.lusid.model.PerpetualProperty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ReferencePortfolioConstituent
 */

public class ReferencePortfolioConstituent {
  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_INSTRUMENT_UID = "instrumentUid";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_UID)
  private String instrumentUid;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Double weight;

  public static final String SERIALIZED_NAME_FLOATING_WEIGHT = "floatingWeight";
  @SerializedName(SERIALIZED_NAME_FLOATING_WEIGHT)
  private Double floatingWeight;

  public ReferencePortfolioConstituent instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
    return this;
  }

  public ReferencePortfolioConstituent putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    if (this.instrumentIdentifiers == null) {
      this.instrumentIdentifiers = new HashMap<>();
    }
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * Unique instrument identifiers
   * @return instrumentIdentifiers
  **/
  @ApiModelProperty(value = "Unique instrument identifiers")
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }

  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }

  public ReferencePortfolioConstituent instrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
    return this;
  }

   /**
   * LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers
   * @return instrumentUid
  **/
  @ApiModelProperty(required = true, value = "LUSID's internal unique instrument identifier, resolved from the instrument identifiers")
  public String getInstrumentUid() {
    return instrumentUid;
  }

  public void setInstrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
  }

  public ReferencePortfolioConstituent currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ReferencePortfolioConstituent properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ReferencePortfolioConstituent putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties associated with the constituent
   * @return properties
  **/
  @ApiModelProperty(value = "Properties associated with the constituent")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }

  public ReferencePortfolioConstituent weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * 
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ReferencePortfolioConstituent floatingWeight(Double floatingWeight) {
    this.floatingWeight = floatingWeight;
    return this;
  }

   /**
   * 
   * @return floatingWeight
  **/
  @ApiModelProperty(value = "")
  public Double getFloatingWeight() {
    return floatingWeight;
  }

  public void setFloatingWeight(Double floatingWeight) {
    this.floatingWeight = floatingWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencePortfolioConstituent referencePortfolioConstituent = (ReferencePortfolioConstituent) o;
    return Objects.equals(this.instrumentIdentifiers, referencePortfolioConstituent.instrumentIdentifiers) &&
        Objects.equals(this.instrumentUid, referencePortfolioConstituent.instrumentUid) &&
        Objects.equals(this.currency, referencePortfolioConstituent.currency) &&
        Objects.equals(this.properties, referencePortfolioConstituent.properties) &&
        Objects.equals(this.weight, referencePortfolioConstituent.weight) &&
        Objects.equals(this.floatingWeight, referencePortfolioConstituent.floatingWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentIdentifiers, instrumentUid, currency, properties, weight, floatingWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencePortfolioConstituent {\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    instrumentUid: ").append(toIndentedString(instrumentUid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    floatingWeight: ").append(toIndentedString(floatingWeight)).append("\n");
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
