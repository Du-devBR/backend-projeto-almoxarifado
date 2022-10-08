package com.dh.Almoxarifado.respository._materialRepository;

import com.dh.Almoxarifado.entity._material.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRespository extends JpaRepository<Material, Long> {
    List<Material> findByNameMaterial(String nameMaterial);
}
