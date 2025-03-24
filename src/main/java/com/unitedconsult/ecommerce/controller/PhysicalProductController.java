package com.unitedconsult.ecommerce.controller;

import com.unitedconsult.ecommerce.entity.PhysicalProduct;
import com.unitedconsult.ecommerce.service.PhysicalProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products/physical")
public class PhysicalProductController {

    private PhysicalProductService physicalProductService;

    @Autowired
    public PhysicalProductController(PhysicalProductService physicalProductService) {
        this.physicalProductService = physicalProductService;
    }

    @GetMapping(value = {"","/"})
    @ResponseBody
    public Iterable<PhysicalProduct> getPhysicalProducts() {
        return physicalProductService.findAll();
    }

    @PostMapping("/add")
    @ResponseBody
    public PhysicalProduct addPhysicalProduct(PhysicalProduct physicalProduct) {
        physicalProductService.save(physicalProduct);
        return physicalProduct;
    }

}
