package com.microservice.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
