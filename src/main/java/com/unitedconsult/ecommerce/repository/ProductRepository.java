package com.unitedconsult.ecommerce.repository;


import com.unitedconsult.ecommerce.exception.EntityNotFoundException;
import com.unitedconsult.ecommerce.model.Product;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

@Repository
public class ProductRepository<T extends Product> implements CrudRepository<T> {

    private static long prevId = 0;

    private final ArrayList<T> products = new ArrayList<>();
    private final Environment environment;

    public ProductRepository(Environment environment) {
        this.environment = environment;
    }

    @Override
    public T save(T entity) {
        prevId++;
        entity.setId(prevId);
        products.add(entity);
        return entity;
    }

    @Override
    public T findOne(Long ID) {
        return products.stream()
                .filter((Product prod)-> Objects.equals(prod.getId(), ID))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Iterable<T> findAll() {
        return products.stream().toList();
    }

    @Override
    public T update(T entity) throws NoSuchElementException {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == entity.getId()) {
                products.set(i, entity);
                return entity;
            }
        }
        throw new EntityNotFoundException("ID not found: " + entity.getId());
    }

    @Override
    public long count() {
        return products.size();
    }

    @Override
    public void delete(Long ID) throws EntityNotFoundException {
        if (!products.removeIf((T prod) -> Objects.equals(prod.getId(), ID))) {
            throw new EntityNotFoundException("ID not found: " + ID);
        }
    }

    @Override
    public boolean exists(Long primaryKey) {
        return products.stream().anyMatch((Product prod)-> Objects.equals(prod.getId(), primaryKey));
    }

}
