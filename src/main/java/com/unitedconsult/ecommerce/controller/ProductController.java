package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.model.Product;
import com.unitedconsult.ecommerce.service.ProductService;
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
    public T addProduct(@Validated @RequestBody T product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public T getProduct(@PathVariable Long id) {
        return productService.findOne(id);
    }

    @PutMapping("/{id}")
    public T updateProduct(@Validated @PathVariable Long id, @RequestBody T product) {
        product.setId(id);
        return productService.update(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }

}
