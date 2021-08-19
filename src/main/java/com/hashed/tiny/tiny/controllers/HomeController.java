package com.hashed.tiny.tiny.controllers;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Base64;

@RestController
public class HomeController {


   @GetMapping("/testing")
   public String testing() {
      return "working";
   }
}
