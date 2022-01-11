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
import io.swagger.client.model.Shipping;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * ShippingAndTaxResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-01-11T22:43:24.886Z[GMT]")
public class ShippingAndTaxResponse {
  @SerializedName("shippingAddressId")
  private UUID shippingAddressId = null;

  @SerializedName("currencyCode")
  private String currencyCode = "USD";

  @SerializedName("shippingOptions")
  private List<Shipping> shippingOptions = null;

  @SerializedName("preferredShippingOptionId")
  private Integer preferredShippingOptionId = null;

  @SerializedName("tax")
  private Double tax = null;

  public ShippingAndTaxResponse shippingAddressId(UUID shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
    return this;
  }

   /**
   * Send back the value provided in the request. This value is used for correlation and validation purposes.
   * @return shippingAddressId
  **/
  @Schema(example = "53e2a852-be23-11eb-8529-0242ac130003", required = true, description = "Send back the value provided in the request. This value is used for correlation and validation purposes.")
  public UUID getShippingAddressId() {
    return shippingAddressId;
  }

  public void setShippingAddressId(UUID shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public ShippingAndTaxResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The ISO 4217 three character currency code.
   * @return currencyCode
  **/
  @Schema(example = "USD", required = true, description = "The ISO 4217 three character currency code.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ShippingAndTaxResponse shippingOptions(List<Shipping> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public ShippingAndTaxResponse addShippingOptionsItem(Shipping shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<Shipping>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
  }

   /**
   * The collection of shipping options for the order can include zero to 10 shipping options.
   * @return shippingOptions
  **/
  @Schema(description = "The collection of shipping options for the order can include zero to 10 shipping options.")
  public List<Shipping> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<Shipping> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  public ShippingAndTaxResponse preferredShippingOptionId(Integer preferredShippingOptionId) {
    this.preferredShippingOptionId = preferredShippingOptionId;
    return this;
  }

   /**
   * The prefered pre-selected shipping option identifier (&#x27;id&#x27;) from the shippingOptions array.
   * minimum: 0
   * maximum: 10
   * @return preferredShippingOptionId
  **/
  @Schema(example = "1", description = "The prefered pre-selected shipping option identifier ('id') from the shippingOptions array.")
  public Integer getPreferredShippingOptionId() {
    return preferredShippingOptionId;
  }

  public void setPreferredShippingOptionId(Integer preferredShippingOptionId) {
    this.preferredShippingOptionId = preferredShippingOptionId;
  }

  public ShippingAndTaxResponse tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * The taxes for the order factoring in the shipping address.
   * minimum: 0
   * @return tax
  **/
  @Schema(example = "10.5", description = "The taxes for the order factoring in the shipping address.")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingAndTaxResponse shippingAndTaxResponse = (ShippingAndTaxResponse) o;
    return Objects.equals(this.shippingAddressId, shippingAndTaxResponse.shippingAddressId) &&
        Objects.equals(this.currencyCode, shippingAndTaxResponse.currencyCode) &&
        Objects.equals(this.shippingOptions, shippingAndTaxResponse.shippingOptions) &&
        Objects.equals(this.preferredShippingOptionId, shippingAndTaxResponse.preferredShippingOptionId) &&
        Objects.equals(this.tax, shippingAndTaxResponse.tax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddressId, currencyCode, shippingOptions, preferredShippingOptionId, tax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingAndTaxResponse {\n");
    
    sb.append("    shippingAddressId: ").append(toIndentedString(shippingAddressId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    preferredShippingOptionId: ").append(toIndentedString(preferredShippingOptionId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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
