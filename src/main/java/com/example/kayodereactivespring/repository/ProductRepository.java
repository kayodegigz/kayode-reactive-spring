package com.example.kayodereactivespring.repository;

import com.example.kayodereactivespring.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by Kayode.Ogunrinde on 3/10/2023.
 */

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {

}
