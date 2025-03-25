package com.unitedconsult.ecommerce.service;

import com.unitedconsult.ecommerce.entity.PhysicalProduct;
import com.unitedconsult.ecommerce.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhysicalProductService extends ProductService<PhysicalProduct> {

    @Autowired
    public PhysicalProductService(CrudRepository<PhysicalProduct> productRepository) {
        super(productRepository);
    }
}
