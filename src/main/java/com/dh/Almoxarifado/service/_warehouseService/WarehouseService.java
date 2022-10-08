package com.dh.Almoxarifado.service._warehouseService;

import com.dh.Almoxarifado.entity._warehouse.Warehouse;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.respository._warehouseRepository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    WarehouseRepository repository;

    public Warehouse save(Warehouse warehouse){
        return repository.save(warehouse);
    }

    public Warehouse change(Warehouse warehouse){
        return repository.save(warehouse);
    }

    public void delete(Long id) throws ResouceNotFoundException{
        repository.findById(id).orElseThrow(() -> new ResouceNotFoundException("Erro ao exlcuir o almoxarifado da base de dados"));
        repository.deleteById(id);
    }

    public List<Warehouse> findAllWareHouse(){
        return repository.findAll();
    }

}
