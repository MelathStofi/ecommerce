package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.entity.DigitalProduct;
import com.unitedconsult.ecommerce.service.DigitalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/digital")
public class DigitalProductController extends ProductController<DigitalProduct, DigitalProductService> {

    @Autowired
    public DigitalProductController(DigitalProductService digitalProductService) {
        super(digitalProductService);
    }

}
