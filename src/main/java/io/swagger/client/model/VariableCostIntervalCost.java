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
import io.swagger.client.model.FinalInterval;
import io.swagger.client.model.QuantiyIntervalPrice;
import java.util.ArrayList;
import java.util.List;


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class VariableCostIntervalCost   {
  @SerializedName("intervals")
  private List<QuantiyIntervalPrice> intervals = new ArrayList<QuantiyIntervalPrice>();

  @SerializedName("hasFinalInterval")
  private Boolean hasFinalInterval = null;

  @SerializedName("finalInterval")
  private FinalInterval finalInterval = null;

  public VariableCostIntervalCost intervals(List<QuantiyIntervalPrice> intervals) {
    this.intervals = intervals;
    return this;
  }

  public VariableCostIntervalCost addIntervalsItem(QuantiyIntervalPrice intervalsItem) {
    this.intervals.add(intervalsItem);
    return this;
  }

   /**
   * Get intervals
   * @return intervals
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<QuantiyIntervalPrice> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<QuantiyIntervalPrice> intervals) {
    this.intervals = intervals;
  }

  public VariableCostIntervalCost hasFinalInterval(Boolean hasFinalInterval) {
    this.hasFinalInterval = hasFinalInterval;
    return this;
  }

   /**
   * Get hasFinalInterval
   * @return hasFinalInterval
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasFinalInterval() {
    return hasFinalInterval;
  }

  public void setHasFinalInterval(Boolean hasFinalInterval) {
    this.hasFinalInterval = hasFinalInterval;
  }

  public VariableCostIntervalCost finalInterval(FinalInterval finalInterval) {
    this.finalInterval = finalInterval;
    return this;
  }

   /**
   * Get finalInterval
   * @return finalInterval
  **/
  @ApiModelProperty(example = "null", value = "")
  public FinalInterval getFinalInterval() {
    return finalInterval;
  }

  public void setFinalInterval(FinalInterval finalInterval) {
    this.finalInterval = finalInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableCostIntervalCost variableCostIntervalCost = (VariableCostIntervalCost) o;
    return Objects.equals(this.intervals, variableCostIntervalCost.intervals) &&
        Objects.equals(this.hasFinalInterval, variableCostIntervalCost.hasFinalInterval) &&
        Objects.equals(this.finalInterval, variableCostIntervalCost.finalInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervals, hasFinalInterval, finalInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableCostIntervalCost {\n");
    
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    hasFinalInterval: ").append(toIndentedString(hasFinalInterval)).append("\n");
    sb.append("    finalInterval: ").append(toIndentedString(finalInterval)).append("\n");
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

