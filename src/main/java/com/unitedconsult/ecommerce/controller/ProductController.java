package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.exception.EntityNotFoundException;
import com.unitedconsult.ecommerce.model.Product;
import com.unitedconsult.ecommerce.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public abstract class ProductController<T extends Product, S extends ProductService<T>> {

    protected S productService;

    public ProductController(S productService) {
        this.productService = productService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<T> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping(value = {"","/"})
    public ResponseEntity<?> addProduct(@Validated @RequestBody T product) {
        try {
            return ResponseEntity.ok().body(productService.save(product));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public T getProduct(@PathVariable Long id) {
        return productService.findOne(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@Validated @PathVariable Long id, @RequestBody T product) {
        try {
            product.setId(id);
            return ResponseEntity.ok().body(productService.update(product));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        try {
            productService.delete(id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }


}
