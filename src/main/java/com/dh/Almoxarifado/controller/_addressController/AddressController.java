package com.dh.Almoxarifado.controller._addressController;

import com.dh.Almoxarifado.entity._address.Address;
import com.dh.Almoxarifado.service._addressService.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class AddressController {

    @Autowired
    AddressService service;

    @PostMapping
    public Address saveAddress(@RequestBody Address address){
        return service.save(address);
    }

    @GetMapping
    public List<Address> findAllendereco(){
        return service.findAll();
    }
}
