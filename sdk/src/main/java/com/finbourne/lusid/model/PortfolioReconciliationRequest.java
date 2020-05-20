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
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * PortfolioReconciliationRequest
 */

public class PortfolioReconciliationRequest {
  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private ResourceId portfolioId = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private String effectiveAt;

  public static final String SERIALIZED_NAME_AS_AT = "asAt";
  @SerializedName(SERIALIZED_NAME_AS_AT)
  private OffsetDateTime asAt;

  public PortfolioReconciliationRequest portfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
  }

  public PortfolioReconciliationRequest effectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The effective date of the portfolio
   * @return effectiveAt
  **/
  @ApiModelProperty(required = true, value = "The effective date of the portfolio")
  public String getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public PortfolioReconciliationRequest asAt(OffsetDateTime asAt) {
    this.asAt = asAt;
    return this;
  }

   /**
   * Optional. The AsAt date of the portfolio
   * @return asAt
  **/
  @ApiModelProperty(value = "Optional. The AsAt date of the portfolio")
  public OffsetDateTime getAsAt() {
    return asAt;
  }

  public void setAsAt(OffsetDateTime asAt) {
    this.asAt = asAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioReconciliationRequest portfolioReconciliationRequest = (PortfolioReconciliationRequest) o;
    return Objects.equals(this.portfolioId, portfolioReconciliationRequest.portfolioId) &&
        Objects.equals(this.effectiveAt, portfolioReconciliationRequest.effectiveAt) &&
        Objects.equals(this.asAt, portfolioReconciliationRequest.asAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, effectiveAt, asAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioReconciliationRequest {\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    asAt: ").append(toIndentedString(asAt)).append("\n");
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
