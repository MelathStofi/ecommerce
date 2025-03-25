package com.unitedconsult.ecommerce.service;

import com.unitedconsult.ecommerce.entity.DigitalProduct;
import com.unitedconsult.ecommerce.entity.PhysicalProduct;
import com.unitedconsult.ecommerce.entity.SubscriptionProduct;
import com.unitedconsult.ecommerce.repository.PriceRepository;

public class PriceService {

    private final PriceRepository priceRepo;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepo = priceRepository;
    }

    public void setPhysicalProductPrice(PhysicalProduct product) {
        product.setPrice(priceRepo.getBasePrice() + product.getWeight() * 0.3);
    }

    public void setDigitalProductPrice(DigitalProduct product) {
        product.setPrice(priceRepo.getBasePrice() * 0.9);
    }

    public void setSubscriptionProductPrice(SubscriptionProduct product) {
        double basePrice = priceRepo.getBasePrice();
        product.setPrice(product.isAutoRenewal() ? basePrice * 0.9 : basePrice);
    }
}
