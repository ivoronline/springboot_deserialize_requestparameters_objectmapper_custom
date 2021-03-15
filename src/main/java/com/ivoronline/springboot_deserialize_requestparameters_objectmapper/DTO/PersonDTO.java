package com.ivoronline.springboot_deserialize_requestparameters_objectmapper.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)  //To avoid Error if Request contains additional Parameters
public class PersonDTO {

  //PROPERTIES
  public String name;
  public Float  height;

  //CONVERSION SETTER
  @JsonProperty("height")                       //Map Request Parameter to Setter
  public void setHeight(String heightString) {
    heightString = heightString.replace(',', '.');
    this.height = Float.parseFloat(heightString);
  }

}
