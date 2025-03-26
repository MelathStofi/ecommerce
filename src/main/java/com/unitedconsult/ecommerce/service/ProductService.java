package com.unitedconsult.ecommerce.service;

import com.unitedconsult.ecommerce.model.Product;
import com.unitedconsult.ecommerce.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class ProductService<T extends Product> {

    protected CrudRepository<T> repo;

    public ProductService(CrudRepository<T> productRepository) {
        this.repo = productRepository;
    }

    public T save(T entity) {
        return repo.save(entity);
    }

    public T findOne(Long ID) {
        return repo.findOne(ID);
    }

    public Iterable<T> findAll() {
        return repo.findAll();
    }

    public T update(T entity) { return repo.update(entity); }

    public long count() {
        return repo.count();
    }

    public void delete(Long ID) {
        repo.delete(ID);
    }

    public boolean exists(long ID) {
        return repo.exists(ID);
    }

}
