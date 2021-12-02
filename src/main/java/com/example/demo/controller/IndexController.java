package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
  
  @GetMapping("/Index")
  public String getIndex() {
    return "Index";
  }
  
}