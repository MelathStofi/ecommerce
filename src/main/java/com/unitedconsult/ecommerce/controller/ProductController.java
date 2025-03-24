package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.entity.PhysicalProduct;
import com.unitedconsult.ecommerce.repository.DigitalProductRepository;
import com.unitedconsult.ecommerce.repository.PhysicalProductRepository;
import com.unitedconsult.ecommerce.repository.SubscriptionProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    PhysicalProductRepository physicalProductRepository;
    DigitalProductRepository digitalProductRepository;
    SubscriptionProductRepository subscriptionProductRepository;

    @Autowired
    public ProductController(PhysicalProductRepository physicalProductRepository, DigitalProductRepository digitalProductRepository, SubscriptionProductRepository subscriptionProductRepository) {
        this.physicalProductRepository = physicalProductRepository;
        this.digitalProductRepository = digitalProductRepository;
        this.subscriptionProductRepository = subscriptionProductRepository;
    }

}
