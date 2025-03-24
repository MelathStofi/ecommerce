package com.unitedconsult.ecommerce.repository;


import com.unitedconsult.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class ProductRepository<T extends Product> implements CrudRepository<T> {

    private ArrayList<T> products;

    @Override
    public void save(T entity) {
        products.add(entity);
    }

    @Override
    public T findOne(long ID) {
        return products.stream()
                .filter((Product prod)-> prod.getId() == ID)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Iterable<T> findAll() {
        return products.stream().toList();
    }

    @Override
    public long count() {
        return products.size();
    }

    @Override
    public void delete(T entity) {
        products.remove(entity);
    }

    @Override
    public boolean exists(long primaryKey) {
        return products.stream().anyMatch((Product prod)-> prod.getId() == primaryKey);
    }
}
