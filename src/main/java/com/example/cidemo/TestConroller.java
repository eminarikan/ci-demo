package com.example.cidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {
    @GetMapping("/")
    public String hello(){
        return "it works";
    }
}
