package com.unitedconsult.ecommerce.service;

import com.unitedconsult.ecommerce.model.Product;
import com.unitedconsult.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class ProductService<T extends Product> {

    protected ProductRepository<T> repo;

    public void save(T entity) {
        repo.save(entity);
    }

    public T findOne(long ID) {
        return repo.findOne(ID);
    }

    public Iterable<T> findAll() {
        return repo.findAll();
    }

    public long count() {
        return repo.count();
    }

    public void delete(T entity) {
        repo.delete(entity);
    }

    public boolean exists(long ID) {
        return repo.exists(ID);
    }

}
