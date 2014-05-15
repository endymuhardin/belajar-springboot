package com.muhardin.endy.belajar.service;

import com.muhardin.endy.belajar.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
