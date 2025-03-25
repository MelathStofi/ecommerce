package com.unitedconsult.ecommerce.service;

import com.unitedconsult.ecommerce.entity.SubscriptionProduct;
import com.unitedconsult.ecommerce.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionProductService extends ProductService<SubscriptionProduct> {

    @Autowired
    public SubscriptionProductService(CrudRepository<SubscriptionProduct> productRepository) {
        super(productRepository);
    }
}
