package com.example.day1springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {


    @GetMapping("/hey")
    public String message1(){
        return"hello from springboot";
    }
    @GetMapping("/name")
    public String name(){
        return " Hassan";
    }
    @GetMapping("/age")
  public String age(){
        return "my age is 23";
  }
  @GetMapping("/check/status")
  public String check(){
        return "everything is ok";
  }
  @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
  }
  @GetMapping("/names")
  public List<String> names(){
        return Arrays.asList("Haassan","Ali","Mohammed","Khaled");
  }



}
