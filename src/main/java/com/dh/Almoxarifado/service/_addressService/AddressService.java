package com.dh.Almoxarifado.service._addressService;

import com.dh.Almoxarifado.entity._address.Address;
import com.dh.Almoxarifado.respository._addressRepository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository repository;

    public Address save(Address address){
        return repository.save(address);
    }

    public List<Address> findAll(){
        return repository.findAll();
    }
}
