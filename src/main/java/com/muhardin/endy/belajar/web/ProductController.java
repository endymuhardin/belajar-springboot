package com.muhardin.endy.belajar.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
