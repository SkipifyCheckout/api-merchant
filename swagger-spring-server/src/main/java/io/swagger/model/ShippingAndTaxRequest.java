package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ShippingAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShippingAndTaxRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T22:38:48.881Z[GMT]")


public class ShippingAndTaxRequest   {
  @JsonProperty("merchantOrderId")
  private String merchantOrderId = null;

  @JsonProperty("goCartOrderId")
  private UUID goCartOrderId = null;

  @JsonProperty("shippingAddress")
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
      @NotNull

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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
