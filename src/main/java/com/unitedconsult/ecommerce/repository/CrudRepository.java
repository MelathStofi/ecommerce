package com.unitedconsult.ecommerce.repository;

public interface CrudRepository<T> {

    T save(T entity);

    T findOne(Long ID);

    Iterable<T> findAll();

    long count();

    void delete(Long ID);

    boolean exists(Long ID);
}
