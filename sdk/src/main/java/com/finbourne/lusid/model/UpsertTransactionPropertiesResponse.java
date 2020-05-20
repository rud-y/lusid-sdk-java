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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Version;
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
 * UpsertTransactionPropertiesResponse
 */

public class UpsertTransactionPropertiesResponse {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public UpsertTransactionPropertiesResponse href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @ApiModelProperty(value = "The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public UpsertTransactionPropertiesResponse version(Version version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public UpsertTransactionPropertiesResponse properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
    return this;
  }

  public UpsertTransactionPropertiesResponse putPropertiesItem(String key, PerpetualProperty propertiesItem) {
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

  public UpsertTransactionPropertiesResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public UpsertTransactionPropertiesResponse addLinksItem(Link linksItem) {
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
    UpsertTransactionPropertiesResponse upsertTransactionPropertiesResponse = (UpsertTransactionPropertiesResponse) o;
    return Objects.equals(this.href, upsertTransactionPropertiesResponse.href) &&
        Objects.equals(this.version, upsertTransactionPropertiesResponse.version) &&
        Objects.equals(this.properties, upsertTransactionPropertiesResponse.properties) &&
        Objects.equals(this.links, upsertTransactionPropertiesResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, version, properties, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertTransactionPropertiesResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
