package com.dh.Almoxarifado.service._materialService;

import com.dh.Almoxarifado.entity._material.TypeMaterial;
import com.dh.Almoxarifado.respository._materialRepository.TypeMaterialRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeMaterialService {

    @Autowired
    TypeMaterialRespository repository;

    public TypeMaterial save(TypeMaterial typeMaterial){
        return repository.save(typeMaterial);
    }

    public List<TypeMaterial> findAllTypeMaterial(){
        return repository.findAll();
    }
}
