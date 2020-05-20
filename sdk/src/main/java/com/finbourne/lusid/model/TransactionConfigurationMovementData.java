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
import com.finbourne.lusid.model.TransactionPropertyMapping;
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
 * TransactionConfigurationMovementData
 */

public class TransactionConfigurationMovementData {
  /**
   * The Movement Types
   */
  @JsonAdapter(MovementTypesEnum.Adapter.class)
  public enum MovementTypesEnum {
    SETTLEMENT("Settlement"),
    
    TRADED("Traded"),
    
    FUTURECASH("FutureCash"),
    
    COMMITMENT("Commitment"),
    
    RECEIVABLE("Receivable"),
    
    CASHSETTLEMENT("CashSettlement"),
    
    ACCRUAL("Accrual"),
    
    FORWARDFX("ForwardFx"),
    
    UNSETTLEDCASHTYPES("UnsettledCashTypes"),
    
    STOCKMOVEMENT("StockMovement"),
    
    CASHCOMMITMENT("CashCommitment"),
    
    CASHRECEIVABLE("CashReceivable"),
    
    CASHFORWARD("CashForward"),
    
    CASHFXFORWARD("CashFxForward"),
    
    CASHACCRUAL("CashAccrual");

    private String value;

    MovementTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MovementTypesEnum fromValue(String value) {
      for (MovementTypesEnum b : MovementTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MovementTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MovementTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MovementTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MovementTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MOVEMENT_TYPES = "movementTypes";
  @SerializedName(SERIALIZED_NAME_MOVEMENT_TYPES)
  private MovementTypesEnum movementTypes;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private Integer direction;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_MAPPINGS = "mappings";
  @SerializedName(SERIALIZED_NAME_MAPPINGS)
  private List<TransactionPropertyMapping> mappings = new ArrayList<>();

  public TransactionConfigurationMovementData movementTypes(MovementTypesEnum movementTypes) {
    this.movementTypes = movementTypes;
    return this;
  }

   /**
   * The Movement Types
   * @return movementTypes
  **/
  @ApiModelProperty(required = true, value = "The Movement Types")
  public MovementTypesEnum getMovementTypes() {
    return movementTypes;
  }

  public void setMovementTypes(MovementTypesEnum movementTypes) {
    this.movementTypes = movementTypes;
  }

  public TransactionConfigurationMovementData side(String side) {
    this.side = side;
    return this;
  }

   /**
   * The Movement Side
   * @return side
  **/
  @ApiModelProperty(required = true, value = "The Movement Side")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public TransactionConfigurationMovementData direction(Integer direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The Movement direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "The Movement direction")
  public Integer getDirection() {
    return direction;
  }

  public void setDirection(Integer direction) {
    this.direction = direction;
  }

  public TransactionConfigurationMovementData properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
    return this;
  }

  public TransactionConfigurationMovementData putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }

  public TransactionConfigurationMovementData mappings(List<TransactionPropertyMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public TransactionConfigurationMovementData addMappingsItem(TransactionPropertyMapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Get mappings
   * @return mappings
  **/
  @ApiModelProperty(value = "")
  public List<TransactionPropertyMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<TransactionPropertyMapping> mappings) {
    this.mappings = mappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionConfigurationMovementData transactionConfigurationMovementData = (TransactionConfigurationMovementData) o;
    return Objects.equals(this.movementTypes, transactionConfigurationMovementData.movementTypes) &&
        Objects.equals(this.side, transactionConfigurationMovementData.side) &&
        Objects.equals(this.direction, transactionConfigurationMovementData.direction) &&
        Objects.equals(this.properties, transactionConfigurationMovementData.properties) &&
        Objects.equals(this.mappings, transactionConfigurationMovementData.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movementTypes, side, direction, properties, mappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionConfigurationMovementData {\n");
    sb.append("    movementTypes: ").append(toIndentedString(movementTypes)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
