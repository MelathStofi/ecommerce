package com.unitedconsult.ecommerce.service;

import com.unitedconsult.ecommerce.entity.DigitalProduct;
import com.unitedconsult.ecommerce.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DigitalProductService extends ProductService<DigitalProduct> {

    @Autowired
    public DigitalProductService(CrudRepository<DigitalProduct> productRepository) {
        super(productRepository);
    }
}
