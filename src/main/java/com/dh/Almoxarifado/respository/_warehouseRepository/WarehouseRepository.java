package com.dh.Almoxarifado.respository._warehouseRepository;

import com.dh.Almoxarifado.entity._material.TypeMaterial;
import com.dh.Almoxarifado.entity._warehouse.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {

//    List<Warehouse> findByNameMaterial(String nameMaterial);
}
