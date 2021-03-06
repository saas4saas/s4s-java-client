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
import io.swagger.client.model.GoogleAuth;
import io.swagger.client.model.UserContact;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class User   {
  @SerializedName("privateData")
  private Map<String, String> privateData = new HashMap<String, String>();

  @SerializedName("data")
  private Map<String, String> data = new HashMap<String, String>();

  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("contacts")
  private UserContact contacts = null;

  @SerializedName("pwd")
  private String pwd = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("apiTkn")
  private String apiTkn = null;

  @SerializedName("googleAuth")
  private GoogleAuth googleAuth = null;

  @SerializedName("typ")
  private String typ = null;

  @SerializedName("usr")
  private String usr = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  public User privateData(Map<String, String> privateData) {
    this.privateData = privateData;
    return this;
  }

  public User putPrivateDataItem(String key, String privateDataItem) {
    this.privateData.put(key, privateDataItem);
    return this;
  }

   /**
   * Get privateData
   * @return privateData
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getPrivateData() {
    return privateData;
  }

  public void setPrivateData(Map<String, String> privateData) {
    this.privateData = privateData;
  }

  public User data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public User putDataItem(String key, String dataItem) {
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }

  public User accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public User contacts(UserContact contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserContact getContacts() {
    return contacts;
  }

  public void setContacts(UserContact contacts) {
    this.contacts = contacts;
  }

  public User pwd(String pwd) {
    this.pwd = pwd;
    return this;
  }

   /**
   * Get pwd
   * @return pwd
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public User id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User apiTkn(String apiTkn) {
    this.apiTkn = apiTkn;
    return this;
  }

   /**
   * Get apiTkn
   * @return apiTkn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getApiTkn() {
    return apiTkn;
  }

  public void setApiTkn(String apiTkn) {
    this.apiTkn = apiTkn;
  }

  public User googleAuth(GoogleAuth googleAuth) {
    this.googleAuth = googleAuth;
    return this;
  }

   /**
   * Get googleAuth
   * @return googleAuth
  **/
  @ApiModelProperty(example = "null", value = "")
  public GoogleAuth getGoogleAuth() {
    return googleAuth;
  }

  public void setGoogleAuth(GoogleAuth googleAuth) {
    this.googleAuth = googleAuth;
  }

  public User typ(String typ) {
    this.typ = typ;
    return this;
  }

   /**
   * Get typ
   * @return typ
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }

  public User usr(String usr) {
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

  public User tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.privateData, user.privateData) &&
        Objects.equals(this.data, user.data) &&
        Objects.equals(this.accountId, user.accountId) &&
        Objects.equals(this.contacts, user.contacts) &&
        Objects.equals(this.pwd, user.pwd) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.apiTkn, user.apiTkn) &&
        Objects.equals(this.googleAuth, user.googleAuth) &&
        Objects.equals(this.typ, user.typ) &&
        Objects.equals(this.usr, user.usr) &&
        Objects.equals(this.tenantId, user.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateData, data, accountId, contacts, pwd, id, apiTkn, googleAuth, typ, usr, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    privateData: ").append(toIndentedString(privateData)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    apiTkn: ").append(toIndentedString(apiTkn)).append("\n");
    sb.append("    googleAuth: ").append(toIndentedString(googleAuth)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
    sb.append("    usr: ").append(toIndentedString(usr)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

