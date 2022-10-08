package com.dh.Almoxarifado.respository._materialRepository;

import com.dh.Almoxarifado.entity._material.TypeMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMaterialRespository extends JpaRepository<TypeMaterial, Long> {
}
