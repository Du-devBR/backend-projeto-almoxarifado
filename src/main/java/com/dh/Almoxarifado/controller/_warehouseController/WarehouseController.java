package com.dh.Almoxarifado.controller._warehouseController;

import com.dh.Almoxarifado.entity._warehouse.Warehouse;
import com.dh.Almoxarifado.service._warehouseService.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/almoxarifado")
public class WarehouseController {

    @Autowired
    WarehouseService service;

    @PostMapping
    public Warehouse saveWarehouse(@RequestBody Warehouse warehouse){
        return service.save(warehouse);
    }

    @GetMapping
    public List<Warehouse> findAllWarehouse(){
        return service.findAllWareHouse();
    }
}
