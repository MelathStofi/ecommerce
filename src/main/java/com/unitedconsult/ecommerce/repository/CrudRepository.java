package com.unitedconsult.ecommerce.repository;

import com.unitedconsult.ecommerce.exception.EntityNotFoundException;

public interface CrudRepository<T> {

    T save(T entity);

    T findOne(Long ID);

    Iterable<T> findAll();

    T update(T entity) throws EntityNotFoundException;

    long count();

    void delete(Long ID) throws EntityNotFoundException;

    boolean exists(Long ID);
}
