package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details for a single shipping option. For instance, shipping for 2 day versus next day versus ground freight.
 */
@Schema(description = "Details for a single shipping option. For instance, shipping for 2 day versus next day versus ground freight.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-11T23:42:28.109Z[GMT]")


public class Shipping   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private Double price = null;

  public Shipping id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * A numeric identifier for this option. This id is used to demaracate the default selected shipping option.
   * minimum: 0
   * maximum: 10
   * @return id
   **/
  @Schema(example = "1", description = "A numeric identifier for this option. This id is used to demaracate the default selected shipping option.")
  
  @Min(0) @Max(10)   public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Shipping name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Ground Freight", required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Shipping price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * minimum: 0
   * @return price
   **/
  @Schema(example = "25.98", required = true, description = "")
      @NotNull

  @DecimalMin("0")  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipping shipping = (Shipping) o;
    return Objects.equals(this.id, shipping.id) &&
        Objects.equals(this.name, shipping.name) &&
        Objects.equals(this.price, shipping.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
