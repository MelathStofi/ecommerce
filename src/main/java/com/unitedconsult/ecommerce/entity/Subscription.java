package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class Subscription extends Product {

    private int billingCycle;

    private int autoRenewal;

    public Subscription(String name) {
        super(name);
    }
}
