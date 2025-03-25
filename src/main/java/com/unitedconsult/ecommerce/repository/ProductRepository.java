package com.unitedconsult.ecommerce.repository;


import com.unitedconsult.ecommerce.model.Product;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
        if (entity.getId().equals(0L)) {
            prevId++;
            entity.setId(prevId);
            products.add(entity);
        } else {
            // TODO: klónozás megoldása
        }
        return entity;
    }

    @Override
    public T findOne(Long ID) {
        return products.stream()
                .filter((Product prod)-> Objects.equals(prod.getId(), ID))
                .findFirst()
                .orElse(null);
        // TODO: klónozás megoldása
    }

    @Override
    public Iterable<T> findAll() {
        return products.stream().toList();
        // TODO: klónozás megoldása
    }

    @Override
    public long count() {
        return products.size();
    }

    @Override
    public void delete(Long ID) {
        products.removeIf((T prod)-> Objects.equals(prod.getId(), ID));
    }

    @Override
    public boolean exists(Long primaryKey) {
        return products.stream().anyMatch((Product prod)-> Objects.equals(prod.getId(), primaryKey));
    }

}
