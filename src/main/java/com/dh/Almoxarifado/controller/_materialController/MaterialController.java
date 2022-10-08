package com.dh.Almoxarifado.controller._materialController;

import com.dh.Almoxarifado.entity._material.Material;
import com.dh.Almoxarifado.entity.dto.MaterialDTO.MaterialDTO;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.service._materialService.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    MaterialService service;

    @PostMapping
    public Material saveMaterial(@RequestBody Material material){
        return service.save(material);
    }

    @GetMapping
    public List<MaterialDTO> findAllMaterials(){
        return service.findAll();
    }

    @GetMapping(path = "/nomeMaterial")
    public ResponseEntity findByNameMaterial(@RequestParam("nameMaterial") String nameMaterial){
        List<Material> listMaterial = service.findByNameMaterial(nameMaterial);
        if (listMaterial.isEmpty()){
            return new ResponseEntity<>("Não encontrado material", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(listMaterial, HttpStatus.OK);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public ResponseEntity findById(@RequestParam("id") Long id) throws ResouceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);

    }

    @PatchMapping
    public Material changeMaterial(@RequestBody Material material){
        return service.change(material);
    }


    @DeleteMapping
    public void deleteMaterial(@RequestParam("id") Long id) throws ResouceNotFoundException{
        service.delete(id);
    }
}
