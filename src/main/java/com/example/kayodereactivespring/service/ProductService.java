package com.example.kayodereactivespring.service;

import com.example.kayodereactivespring.model.Product;
import com.example.kayodereactivespring.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Created by Kayode.Ogunrinde on 3/10/2023.
 */

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<Product> getProducts() {
        return productRepository.
                findAll().
                delayElements(Duration.ofSeconds(5));
    }
}
