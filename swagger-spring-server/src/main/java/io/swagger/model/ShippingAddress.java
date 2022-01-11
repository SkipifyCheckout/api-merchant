package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShippingAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T23:44:19.255Z[GMT]")


public class ShippingAddress   {
  @JsonProperty("shippingAddressId")
  private UUID shippingAddressId = null;

  @JsonProperty("streetAddress")
  private String streetAddress = null;

  @JsonProperty("addressLocality")
  private String addressLocality = null;

  @JsonProperty("addressRegion")
  private String addressRegion = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public ShippingAddress shippingAddressId(UUID shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
    return this;
  }

  /**
   * Get shippingAddressId
   * @return shippingAddressId
   **/
  @Schema(example = "53e2a852-be23-11eb-8529-0242ac130003", required = true, description = "")
      @NotNull

    @Valid
    public UUID getShippingAddressId() {
    return shippingAddressId;
  }

  public void setShippingAddressId(UUID shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public ShippingAddress streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   **/
  @Schema(example = "123 Main Street", required = true, description = "")
      @NotNull

    public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public ShippingAddress addressLocality(String addressLocality) {
    this.addressLocality = addressLocality;
    return this;
  }

  /**
   * Get addressLocality
   * @return addressLocality
   **/
  @Schema(example = "Denver", required = true, description = "")
      @NotNull

    public String getAddressLocality() {
    return addressLocality;
  }

  public void setAddressLocality(String addressLocality) {
    this.addressLocality = addressLocality;
  }

  public ShippingAddress addressRegion(String addressRegion) {
    this.addressRegion = addressRegion;
    return this;
  }

  /**
   * Get addressRegion
   * @return addressRegion
   **/
  @Schema(example = "CO", required = true, description = "")
      @NotNull

    public String getAddressRegion() {
    return addressRegion;
  }

  public void setAddressRegion(String addressRegion) {
    this.addressRegion = addressRegion;
  }

  public ShippingAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   **/
  @Schema(example = "80209", required = true, description = "")
      @NotNull

    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingAddress shippingAddress = (ShippingAddress) o;
    return Objects.equals(this.shippingAddressId, shippingAddress.shippingAddressId) &&
        Objects.equals(this.streetAddress, shippingAddress.streetAddress) &&
        Objects.equals(this.addressLocality, shippingAddress.addressLocality) &&
        Objects.equals(this.addressRegion, shippingAddress.addressRegion) &&
        Objects.equals(this.postalCode, shippingAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddressId, streetAddress, addressLocality, addressRegion, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingAddress {\n");
    
    sb.append("    shippingAddressId: ").append(toIndentedString(shippingAddressId)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    addressLocality: ").append(toIndentedString(addressLocality)).append("\n");
    sb.append("    addressRegion: ").append(toIndentedString(addressRegion)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
