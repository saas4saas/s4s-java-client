/**
 * s4s-full
 * description
 *
 * OpenAPI spec version: stable
 * Contact: rui.p.oliveira@impactinglabs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Price;


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class OneTimePay   {
  @SerializedName("cost")
  private Price cost = null;

  /**
   * Gets or Sets whenPay
   */
  public enum WhenPayEnum {
    @SerializedName("EndPeriod")
    ENDPERIOD("EndPeriod"),
    
    @SerializedName("StartPeriod")
    STARTPERIOD("StartPeriod");

    private String value;

    WhenPayEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("whenPay")
  private WhenPayEnum whenPay = null;

  public OneTimePay cost(Price cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(example = "null", value = "")
  public Price getCost() {
    return cost;
  }

  public void setCost(Price cost) {
    this.cost = cost;
  }

  public OneTimePay whenPay(WhenPayEnum whenPay) {
    this.whenPay = whenPay;
    return this;
  }

   /**
   * Get whenPay
   * @return whenPay
  **/
  @ApiModelProperty(example = "null", value = "")
  public WhenPayEnum getWhenPay() {
    return whenPay;
  }

  public void setWhenPay(WhenPayEnum whenPay) {
    this.whenPay = whenPay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneTimePay oneTimePay = (OneTimePay) o;
    return Objects.equals(this.cost, oneTimePay.cost) &&
        Objects.equals(this.whenPay, oneTimePay.whenPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, whenPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneTimePay {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    whenPay: ").append(toIndentedString(whenPay)).append("\n");
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
