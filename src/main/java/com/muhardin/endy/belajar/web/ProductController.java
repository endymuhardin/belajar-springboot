package com.muhardin.endy.belajar.web;

import com.muhardin.endy.belajar.domain.Product;
import com.muhardin.endy.belajar.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    @Autowired private ProductRepository productRepository;
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    
    @RequestMapping("/product/list")
    public Iterable<Product> all(){
        return productRepository.findAll();
    }
}
