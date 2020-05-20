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
 * Stream
 */

public class Stream {
  public static final String SERIALIZED_NAME_CAN_READ = "canRead";
  @SerializedName(SERIALIZED_NAME_CAN_READ)
  private Boolean canRead;

  public static final String SERIALIZED_NAME_CAN_SEEK = "canSeek";
  @SerializedName(SERIALIZED_NAME_CAN_SEEK)
  private Boolean canSeek;

  public static final String SERIALIZED_NAME_CAN_TIMEOUT = "canTimeout";
  @SerializedName(SERIALIZED_NAME_CAN_TIMEOUT)
  private Boolean canTimeout;

  public static final String SERIALIZED_NAME_CAN_WRITE = "canWrite";
  @SerializedName(SERIALIZED_NAME_CAN_WRITE)
  private Boolean canWrite;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Long length;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Long position;

  public static final String SERIALIZED_NAME_READ_TIMEOUT = "readTimeout";
  @SerializedName(SERIALIZED_NAME_READ_TIMEOUT)
  private Integer readTimeout;

  public static final String SERIALIZED_NAME_WRITE_TIMEOUT = "writeTimeout";
  @SerializedName(SERIALIZED_NAME_WRITE_TIMEOUT)
  private Integer writeTimeout;

   /**
   * Get canRead
   * @return canRead
  **/
  @ApiModelProperty(value = "")
  public Boolean getCanRead() {
    return canRead;
  }

   /**
   * Get canSeek
   * @return canSeek
  **/
  @ApiModelProperty(value = "")
  public Boolean getCanSeek() {
    return canSeek;
  }

   /**
   * Get canTimeout
   * @return canTimeout
  **/
  @ApiModelProperty(value = "")
  public Boolean getCanTimeout() {
    return canTimeout;
  }

   /**
   * Get canWrite
   * @return canWrite
  **/
  @ApiModelProperty(value = "")
  public Boolean getCanWrite() {
    return canWrite;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Long getLength() {
    return length;
  }

  public Stream position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public Stream readTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

   /**
   * Get readTimeout
   * @return readTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getReadTimeout() {
    return readTimeout;
  }

  public void setReadTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
  }

  public Stream writeTimeout(Integer writeTimeout) {
    this.writeTimeout = writeTimeout;
    return this;
  }

   /**
   * Get writeTimeout
   * @return writeTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getWriteTimeout() {
    return writeTimeout;
  }

  public void setWriteTimeout(Integer writeTimeout) {
    this.writeTimeout = writeTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return Objects.equals(this.canRead, stream.canRead) &&
        Objects.equals(this.canSeek, stream.canSeek) &&
        Objects.equals(this.canTimeout, stream.canTimeout) &&
        Objects.equals(this.canWrite, stream.canWrite) &&
        Objects.equals(this.length, stream.length) &&
        Objects.equals(this.position, stream.position) &&
        Objects.equals(this.readTimeout, stream.readTimeout) &&
        Objects.equals(this.writeTimeout, stream.writeTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRead, canSeek, canTimeout, canWrite, length, position, readTimeout, writeTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    canTimeout: ").append(toIndentedString(canTimeout)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
    sb.append("    writeTimeout: ").append(toIndentedString(writeTimeout)).append("\n");
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
