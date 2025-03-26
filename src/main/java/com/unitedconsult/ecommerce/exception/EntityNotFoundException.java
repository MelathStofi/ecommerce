package com.unitedconsult.ecommerce.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Object message) {
        super("Entity not found for ID: " + message);
    }
}
