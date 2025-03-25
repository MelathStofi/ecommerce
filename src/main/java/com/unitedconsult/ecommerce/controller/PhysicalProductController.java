package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.entity.PhysicalProduct;
import com.unitedconsult.ecommerce.service.PhysicalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products/physical")
public class PhysicalProductController extends ProductController<PhysicalProduct, PhysicalProductService> {

    @Autowired
    public PhysicalProductController(PhysicalProductService physicalProductService) {
        super(physicalProductService);
    }

}
