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
public class EmailRecover   {
  @SerializedName("usr")
  private String usr = null;

  @SerializedName("newPwd")
  private String newPwd = null;

  public EmailRecover usr(String usr) {
    this.usr = usr;
    return this;
  }

   /**
   * Get usr
   * @return usr
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUsr() {
    return usr;
  }

  public void setUsr(String usr) {
    this.usr = usr;
  }

  public EmailRecover newPwd(String newPwd) {
    this.newPwd = newPwd;
    return this;
  }

   /**
   * Get newPwd
   * @return newPwd
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNewPwd() {
    return newPwd;
  }

  public void setNewPwd(String newPwd) {
    this.newPwd = newPwd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailRecover emailRecover = (EmailRecover) o;
    return Objects.equals(this.usr, emailRecover.usr) &&
        Objects.equals(this.newPwd, emailRecover.newPwd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usr, newPwd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRecover {\n");
    
    sb.append("    usr: ").append(toIndentedString(usr)).append("\n");
    sb.append("    newPwd: ").append(toIndentedString(newPwd)).append("\n");
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

