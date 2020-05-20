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
import com.finbourne.lusid.model.ConstituentsAdjustmentHeader;
import com.finbourne.lusid.model.Link;
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
 * ResourceListOfConstituentsAdjustmentHeader
 */

public class ResourceListOfConstituentsAdjustmentHeader {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<ConstituentsAdjustmentHeader> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public ResourceListOfConstituentsAdjustmentHeader values(List<ConstituentsAdjustmentHeader> values) {
    this.values = values;
    return this;
  }

  public ResourceListOfConstituentsAdjustmentHeader addValuesItem(ConstituentsAdjustmentHeader valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ConstituentsAdjustmentHeader> getValues() {
    return values;
  }

  public void setValues(List<ConstituentsAdjustmentHeader> values) {
    this.values = values;
  }

  public ResourceListOfConstituentsAdjustmentHeader href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ResourceListOfConstituentsAdjustmentHeader links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ResourceListOfConstituentsAdjustmentHeader addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceListOfConstituentsAdjustmentHeader resourceListOfConstituentsAdjustmentHeader = (ResourceListOfConstituentsAdjustmentHeader) o;
    return Objects.equals(this.values, resourceListOfConstituentsAdjustmentHeader.values) &&
        Objects.equals(this.href, resourceListOfConstituentsAdjustmentHeader.href) &&
        Objects.equals(this.links, resourceListOfConstituentsAdjustmentHeader.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, href, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceListOfConstituentsAdjustmentHeader {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
