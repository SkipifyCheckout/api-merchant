/*
 * GoCart Partner Callback API
 * API callbacks that need to be implemented by GoCart partners to enable a complete integration with the GoCart checkout workflows. <p/> For instance, a callback method that calculates the shipping options and taxes for an order based on the passed in shipping address.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@gocartpay.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ShippingAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * ShippingAndTaxRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-01-11T23:42:27.117Z[GMT]")
public class ShippingAndTaxRequest {
  @SerializedName("merchantOrderId")
  private String merchantOrderId = null;

  @SerializedName("goCartOrderId")
  private UUID goCartOrderId = null;

  @SerializedName("shippingAddress")
  private ShippingAddress shippingAddress = null;

  public ShippingAndTaxRequest merchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

   /**
   * Get merchantOrderId
   * @return merchantOrderId
  **/
  @Schema(example = "someMerchantOrderId", required = true, description = "")
  public String getMerchantOrderId() {
    return merchantOrderId;
  }

  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }

  public ShippingAndTaxRequest goCartOrderId(UUID goCartOrderId) {
    this.goCartOrderId = goCartOrderId;
    return this;
  }

   /**
   * Get goCartOrderId
   * @return goCartOrderId
  **/
  @Schema(example = "77a051d8-be26-11eb-8529-0242ac130003", required = true, description = "")
  public UUID getGoCartOrderId() {
    return goCartOrderId;
  }

  public void setGoCartOrderId(UUID goCartOrderId) {
    this.goCartOrderId = goCartOrderId;
  }

  public ShippingAndTaxRequest shippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @Schema(required = true, description = "")
  public ShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingAndTaxRequest shippingAndTaxRequest = (ShippingAndTaxRequest) o;
    return Objects.equals(this.merchantOrderId, shippingAndTaxRequest.merchantOrderId) &&
        Objects.equals(this.goCartOrderId, shippingAndTaxRequest.goCartOrderId) &&
        Objects.equals(this.shippingAddress, shippingAndTaxRequest.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrderId, goCartOrderId, shippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingAndTaxRequest {\n");
    
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
    sb.append("    goCartOrderId: ").append(toIndentedString(goCartOrderId)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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
