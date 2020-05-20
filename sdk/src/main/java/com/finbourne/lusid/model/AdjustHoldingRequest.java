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
import com.finbourne.lusid.model.TargetTaxLotRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This request specifies target holdings. i.e. holding data that the  system should match. When processed by the movement  engine, it will create &#39;true-up&#39; adjustments on the fly.
 */
@ApiModel(description = "This request specifies target holdings. i.e. holding data that the  system should match. When processed by the movement  engine, it will create 'true-up' adjustments on the fly.")

public class AdjustHoldingRequest {
  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_SUB_HOLDING_KEYS = "subHoldingKeys";
  @SerializedName(SERIALIZED_NAME_SUB_HOLDING_KEYS)
  private Map<String, PerpetualProperty> subHoldingKeys = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_TAX_LOTS = "taxLots";
  @SerializedName(SERIALIZED_NAME_TAX_LOTS)
  private List<TargetTaxLotRequest> taxLots = new ArrayList<>();

  public AdjustHoldingRequest instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
    return this;
  }

  public AdjustHoldingRequest putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * A set of instrument identifiers to use to resolve the holding adjustment to a unique instrument.
   * @return instrumentIdentifiers
  **/
  @ApiModelProperty(required = true, value = "A set of instrument identifiers to use to resolve the holding adjustment to a unique instrument.")
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }

  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }

  public AdjustHoldingRequest subHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
    return this;
  }

  public AdjustHoldingRequest putSubHoldingKeysItem(String key, PerpetualProperty subHoldingKeysItem) {
    if (this.subHoldingKeys == null) {
      this.subHoldingKeys = new HashMap<>();
    }
    this.subHoldingKeys.put(key, subHoldingKeysItem);
    return this;
  }

   /**
   * Set of unique transaction properties and associated values to store with the holding adjustment transaction automatically created by LUSID. Each property must be from the &#39;Transaction&#39; domain.
   * @return subHoldingKeys
  **/
  @ApiModelProperty(value = "Set of unique transaction properties and associated values to store with the holding adjustment transaction automatically created by LUSID. Each property must be from the 'Transaction' domain.")
  public Map<String, PerpetualProperty> getSubHoldingKeys() {
    return subHoldingKeys;
  }

  public void setSubHoldingKeys(Map<String, PerpetualProperty> subHoldingKeys) {
    this.subHoldingKeys = subHoldingKeys;
  }

  public AdjustHoldingRequest properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
    return this;
  }

  public AdjustHoldingRequest putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Set of unique holding properties and associated values to store with the target holding. Each property must be from the &#39;Holding&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "Set of unique holding properties and associated values to store with the target holding. Each property must be from the 'Holding' domain.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }

  public AdjustHoldingRequest taxLots(List<TargetTaxLotRequest> taxLots) {
    this.taxLots = taxLots;
    return this;
  }

  public AdjustHoldingRequest addTaxLotsItem(TargetTaxLotRequest taxLotsItem) {
    this.taxLots.add(taxLotsItem);
    return this;
  }

   /**
   * The tax-lots that together make up the target holding.
   * @return taxLots
  **/
  @ApiModelProperty(required = true, value = "The tax-lots that together make up the target holding.")
  public List<TargetTaxLotRequest> getTaxLots() {
    return taxLots;
  }

  public void setTaxLots(List<TargetTaxLotRequest> taxLots) {
    this.taxLots = taxLots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustHoldingRequest adjustHoldingRequest = (AdjustHoldingRequest) o;
    return Objects.equals(this.instrumentIdentifiers, adjustHoldingRequest.instrumentIdentifiers) &&
        Objects.equals(this.subHoldingKeys, adjustHoldingRequest.subHoldingKeys) &&
        Objects.equals(this.properties, adjustHoldingRequest.properties) &&
        Objects.equals(this.taxLots, adjustHoldingRequest.taxLots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentIdentifiers, subHoldingKeys, properties, taxLots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustHoldingRequest {\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    subHoldingKeys: ").append(toIndentedString(subHoldingKeys)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    taxLots: ").append(toIndentedString(taxLots)).append("\n");
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
