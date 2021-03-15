package com.ivoronline.springboot_deserialize_requestparameters_objectmapper.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivoronline.springboot_deserialize_requestparameters_objectmapper.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/AddPerson")
  public String addPerson(@RequestParam Map<String, Object> requestParameters) {
    PersonDTO personDTO = new ObjectMapper().convertValue(requestParameters, PersonDTO.class);
    return personDTO.name + " is " + personDTO.height + " meters high";
  }

}
