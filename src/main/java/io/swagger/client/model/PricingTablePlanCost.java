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
public class PricingTablePlanCost   {
  @SerializedName("description")
  private String description = null;

  @SerializedName("per")
  private String per = null;

  @SerializedName("bill")
  private String bill = null;

  @SerializedName("cost")
  private Price cost = null;

  @SerializedName("costText")
  private String costText = null;

  @SerializedName("period")
  private String period = null;

  public PricingTablePlanCost description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PricingTablePlanCost per(String per) {
    this.per = per;
    return this;
  }

   /**
   * Get per
   * @return per
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPer() {
    return per;
  }

  public void setPer(String per) {
    this.per = per;
  }

  public PricingTablePlanCost bill(String bill) {
    this.bill = bill;
    return this;
  }

   /**
   * Get bill
   * @return bill
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBill() {
    return bill;
  }

  public void setBill(String bill) {
    this.bill = bill;
  }

  public PricingTablePlanCost cost(Price cost) {
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

  public PricingTablePlanCost costText(String costText) {
    this.costText = costText;
    return this;
  }

   /**
   * Get costText
   * @return costText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCostText() {
    return costText;
  }

  public void setCostText(String costText) {
    this.costText = costText;
  }

  public PricingTablePlanCost period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTablePlanCost pricingTablePlanCost = (PricingTablePlanCost) o;
    return Objects.equals(this.description, pricingTablePlanCost.description) &&
        Objects.equals(this.per, pricingTablePlanCost.per) &&
        Objects.equals(this.bill, pricingTablePlanCost.bill) &&
        Objects.equals(this.cost, pricingTablePlanCost.cost) &&
        Objects.equals(this.costText, pricingTablePlanCost.costText) &&
        Objects.equals(this.period, pricingTablePlanCost.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, per, bill, cost, costText, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTablePlanCost {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    costText: ").append(toIndentedString(costText)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

