package com.unitedconsult.ecommerce.repository;


import com.unitedconsult.ecommerce.exception.EntityNotFoundException;
import com.unitedconsult.ecommerce.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Objects;

@Repository
public class ProductRepository<T extends Product> implements CrudRepository<T> {

    private static long prevId = 0;

    private final ArrayList<T> products = new ArrayList<>();


    @Override
    public T save(T entity) {
        prevId++;
        entity.setId(prevId);
        products.add(entity);
        return entity;
    }

    @Override
    public T findOne(Long ID) throws EntityNotFoundException {
        return products.stream()
                .filter((Product prod)-> Objects.equals(prod.getId(), ID))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException(ID));
    }

    @Override
    public Iterable<T> findAll() {
        return products.stream().toList();
    }

    @Override
    public T update(T entity) throws EntityNotFoundException {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == entity.getId()) {
                products.set(i, entity);
                return entity;
            }
        }
        throw new EntityNotFoundException(entity.getId());
    }

    @Override
    public long count() {
        return products.size();
    }

    @Override
    public void delete(Long ID) throws EntityNotFoundException {
        if (!products.removeIf((T prod) -> Objects.equals(prod.getId(), ID))) {
            throw new EntityNotFoundException(ID);
        }
    }

    @Override
    public boolean exists(Long primaryKey) {
        return products.stream().anyMatch((Product prod)-> Objects.equals(prod.getId(), primaryKey));
    }

}
