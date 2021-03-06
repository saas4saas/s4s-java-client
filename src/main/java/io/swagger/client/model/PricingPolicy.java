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


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class PricingPolicy   {
  /**
   * Gets or Sets upgrade
   */
  public enum UpgradeEnum {
    @SerializedName("NextPeriod")
    NEXTPERIOD("NextPeriod"),
    
    @SerializedName("Immediately")
    IMMEDIATELY("Immediately"),
    
    @SerializedName("UserCant")
    USERCANT("UserCant");

    private String value;

    UpgradeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("upgrade")
  private UpgradeEnum upgrade = null;

  /**
   * Gets or Sets downgrade
   */
  public enum DowngradeEnum {
    @SerializedName("NextPeriod")
    NEXTPERIOD("NextPeriod"),
    
    @SerializedName("Immediately")
    IMMEDIATELY("Immediately"),
    
    @SerializedName("UserCant")
    USERCANT("UserCant");

    private String value;

    DowngradeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("downgrade")
  private DowngradeEnum downgrade = null;

  public PricingPolicy upgrade(UpgradeEnum upgrade) {
    this.upgrade = upgrade;
    return this;
  }

   /**
   * Get upgrade
   * @return upgrade
  **/
  @ApiModelProperty(example = "null", value = "")
  public UpgradeEnum getUpgrade() {
    return upgrade;
  }

  public void setUpgrade(UpgradeEnum upgrade) {
    this.upgrade = upgrade;
  }

  public PricingPolicy downgrade(DowngradeEnum downgrade) {
    this.downgrade = downgrade;
    return this;
  }

   /**
   * Get downgrade
   * @return downgrade
  **/
  @ApiModelProperty(example = "null", value = "")
  public DowngradeEnum getDowngrade() {
    return downgrade;
  }

  public void setDowngrade(DowngradeEnum downgrade) {
    this.downgrade = downgrade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingPolicy pricingPolicy = (PricingPolicy) o;
    return Objects.equals(this.upgrade, pricingPolicy.upgrade) &&
        Objects.equals(this.downgrade, pricingPolicy.downgrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgrade, downgrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingPolicy {\n");
    
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
    sb.append("    downgrade: ").append(toIndentedString(downgrade)).append("\n");
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

