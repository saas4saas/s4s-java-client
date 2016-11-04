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
public class GoogleTokenId   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email_verified")
  private Boolean emailVerified = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("exp")
  private Long exp = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("picture")
  private String picture = null;

  @SerializedName("iat")
  private Long iat = null;

  @SerializedName("sub")
  private String sub = null;

  @SerializedName("at_hash")
  private String atHash = null;

  @SerializedName("azp")
  private String azp = null;

  @SerializedName("aud")
  private String aud = null;

  @SerializedName("hd")
  private String hd = null;

  @SerializedName("iss")
  private String iss = null;

  public GoogleTokenId name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoogleTokenId emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public GoogleTokenId email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GoogleTokenId exp(Long exp) {
    this.exp = exp;
    return this;
  }

   /**
   * Get exp
   * @return exp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExp() {
    return exp;
  }

  public void setExp(Long exp) {
    this.exp = exp;
  }

  public GoogleTokenId profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public GoogleTokenId picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public GoogleTokenId iat(Long iat) {
    this.iat = iat;
    return this;
  }

   /**
   * Get iat
   * @return iat
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getIat() {
    return iat;
  }

  public void setIat(Long iat) {
    this.iat = iat;
  }

  public GoogleTokenId sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public GoogleTokenId atHash(String atHash) {
    this.atHash = atHash;
    return this;
  }

   /**
   * Get atHash
   * @return atHash
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAtHash() {
    return atHash;
  }

  public void setAtHash(String atHash) {
    this.atHash = atHash;
  }

  public GoogleTokenId azp(String azp) {
    this.azp = azp;
    return this;
  }

   /**
   * Get azp
   * @return azp
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAzp() {
    return azp;
  }

  public void setAzp(String azp) {
    this.azp = azp;
  }

  public GoogleTokenId aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public GoogleTokenId hd(String hd) {
    this.hd = hd;
    return this;
  }

   /**
   * Get hd
   * @return hd
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHd() {
    return hd;
  }

  public void setHd(String hd) {
    this.hd = hd;
  }

  public GoogleTokenId iss(String iss) {
    this.iss = iss;
    return this;
  }

   /**
   * Get iss
   * @return iss
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleTokenId googleTokenId = (GoogleTokenId) o;
    return Objects.equals(this.name, googleTokenId.name) &&
        Objects.equals(this.emailVerified, googleTokenId.emailVerified) &&
        Objects.equals(this.email, googleTokenId.email) &&
        Objects.equals(this.exp, googleTokenId.exp) &&
        Objects.equals(this.profile, googleTokenId.profile) &&
        Objects.equals(this.picture, googleTokenId.picture) &&
        Objects.equals(this.iat, googleTokenId.iat) &&
        Objects.equals(this.sub, googleTokenId.sub) &&
        Objects.equals(this.atHash, googleTokenId.atHash) &&
        Objects.equals(this.azp, googleTokenId.azp) &&
        Objects.equals(this.aud, googleTokenId.aud) &&
        Objects.equals(this.hd, googleTokenId.hd) &&
        Objects.equals(this.iss, googleTokenId.iss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, emailVerified, email, exp, profile, picture, iat, sub, atHash, azp, aud, hd, iss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleTokenId {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    atHash: ").append(toIndentedString(atHash)).append("\n");
    sb.append("    azp: ").append(toIndentedString(azp)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    hd: ").append(toIndentedString(hd)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
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
