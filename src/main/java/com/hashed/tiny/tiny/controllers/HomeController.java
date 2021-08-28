package com.hashed.tiny.tiny.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {


   @PostMapping("/get_url")
   public String convert(@RequestParam("url") String originalUrl) {

      String shortUrl = generateCode(originalUrl);

      // logic of conversion goes here
      return "";
   }

   private String generateCode(String originalUrl) {

      // code will be generated from here or may be from service class
      Map<String, String> map = new HashMap<>();
      String shortUrl = originalUrl.substring(originalUrl.length() / 2 + 1);
      map.put(shortUrl, originalUrl);
      return shortUrl;
   }
}
