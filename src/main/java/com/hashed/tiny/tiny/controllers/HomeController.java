package com.hashed.tiny.tiny.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


   @PostMapping("/get_url")
   public String convert(@RequestParam("url") String originalUrl) {

      // logic of conversion goes here
      return "";
   }
}
