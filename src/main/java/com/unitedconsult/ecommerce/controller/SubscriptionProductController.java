package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.entity.SubscriptionProduct;
import com.unitedconsult.ecommerce.service.SubscriptionProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/subscription")
public class SubscriptionProductController extends ProductController<SubscriptionProduct, SubscriptionProductService> {

    @Autowired
    public SubscriptionProductController(SubscriptionProductService subscriptionProductService) {
        super(subscriptionProductService);
    }

}
