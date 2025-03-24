package com.unitedconsult.ecommerce.repository;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface CrudRepository<T> {

    void save(T entity);

    T findOne(long ID);

    Iterable<T> findAll();

    long count();

    void delete(T entity);

    boolean exists(long primaryKey);
}
