package com.example.kayodereactivespring.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Kayode.Ogunrinde on 3/10/2023.
 */

public class Product {

    @Id
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
