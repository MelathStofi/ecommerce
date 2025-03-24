package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.service.DigitalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/digital")
public class DigitalProductController {

    private DigitalProductService digitalProductService;

    @Autowired
    public DigitalProductController(DigitalProductService digitalProductService) {
        this.digitalProductService = digitalProductService;
    }


}
