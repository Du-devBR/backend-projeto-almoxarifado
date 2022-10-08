package com.dh.Almoxarifado.controller._materialController;

import com.dh.Almoxarifado.entity._material.TypeMaterial;
import com.dh.Almoxarifado.service._materialService.TypeMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoMaterial")
public class TypeMaterialController {

    @Autowired
    TypeMaterialService service;

    @PostMapping
    public TypeMaterial saveType(@RequestBody TypeMaterial typeMaterial){
        return service.save(typeMaterial);
    }

    @GetMapping
    public List<TypeMaterial> findAllTypeMaterials(){
        return service.findAllTypeMaterial();
    }
}
