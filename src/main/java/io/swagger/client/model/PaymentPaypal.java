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
public class PaymentPaypal   {
  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("sandBoxSecret")
  private String sandBoxSecret = null;

  @SerializedName("liveSecret")
  private String liveSecret = null;

  public PaymentPaypal clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public PaymentPaypal sandBoxSecret(String sandBoxSecret) {
    this.sandBoxSecret = sandBoxSecret;
    return this;
  }

   /**
   * Get sandBoxSecret
   * @return sandBoxSecret
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSandBoxSecret() {
    return sandBoxSecret;
  }

  public void setSandBoxSecret(String sandBoxSecret) {
    this.sandBoxSecret = sandBoxSecret;
  }

  public PaymentPaypal liveSecret(String liveSecret) {
    this.liveSecret = liveSecret;
    return this;
  }

   /**
   * Get liveSecret
   * @return liveSecret
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLiveSecret() {
    return liveSecret;
  }

  public void setLiveSecret(String liveSecret) {
    this.liveSecret = liveSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPaypal paymentPaypal = (PaymentPaypal) o;
    return Objects.equals(this.clientId, paymentPaypal.clientId) &&
        Objects.equals(this.sandBoxSecret, paymentPaypal.sandBoxSecret) &&
        Objects.equals(this.liveSecret, paymentPaypal.liveSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, sandBoxSecret, liveSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPaypal {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    sandBoxSecret: ").append(toIndentedString(sandBoxSecret)).append("\n");
    sb.append("    liveSecret: ").append(toIndentedString(liveSecret)).append("\n");
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

