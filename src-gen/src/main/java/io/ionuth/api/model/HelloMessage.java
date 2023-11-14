package io.ionuth.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * HelloMessage
 */
@Validated

@JacksonXmlRootElement(localName = "HelloMessage")
@XmlRootElement(name = "HelloMessage")
@XmlAccessorType(XmlAccessType.FIELD)

public class HelloMessage  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("headerStr")
  @JacksonXmlProperty(localName = "headerStr")
  private String headerStr = null;

  @JsonProperty("contentStr")
  @JacksonXmlProperty(localName = "contentStr")
  private String contentStr = null;

  public HelloMessage headerStr(String headerStr) {
    this.headerStr = headerStr;
    return this;
  }

  /**
   * Get headerStr
   * @return headerStr
   **/
  @ApiModelProperty(value = "")
  
    public String getHeaderStr() {
    return headerStr;
  }

  public void setHeaderStr(String headerStr) {
    this.headerStr = headerStr;
  }

  public HelloMessage contentStr(String contentStr) {
    this.contentStr = contentStr;
    return this;
  }

  /**
   * Get contentStr
   * @return contentStr
   **/
  @ApiModelProperty(value = "")
  
    public String getContentStr() {
    return contentStr;
  }

  public void setContentStr(String contentStr) {
    this.contentStr = contentStr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelloMessage helloMessage = (HelloMessage) o;
    return Objects.equals(this.headerStr, helloMessage.headerStr) &&
        Objects.equals(this.contentStr, helloMessage.contentStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerStr, contentStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelloMessage {\n");
    
    sb.append("    headerStr: ").append(toIndentedString(headerStr)).append("\n");
    sb.append("    contentStr: ").append(toIndentedString(contentStr)).append("\n");
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
