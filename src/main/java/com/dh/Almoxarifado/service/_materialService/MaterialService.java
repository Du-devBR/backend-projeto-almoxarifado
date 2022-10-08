package com.dh.Almoxarifado.service._materialService;

import com.dh.Almoxarifado.entity.dto.MaterialDTO.MaterialDTO;
import com.dh.Almoxarifado.entity._material.Material;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.respository._materialRepository.MaterialRespository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {
    @Autowired
    MaterialRespository respository;

    public Material save(Material material){
        return respository.save(material);
    }

    public List<MaterialDTO> findAll(){
        List<Material> materials =respository.findAll();
        List<MaterialDTO>materialsDTO = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        for (Material m : materials){
            materialsDTO.add(objectMapper.convertValue(m, MaterialDTO.class));
        }
        return materialsDTO;
    }

    public Material change(Material material){
        return respository.save(material);
    }

    public void delete(Long id) throws ResouceNotFoundException {
        respository.findById(id).orElseThrow(() -> new ResouceNotFoundException("Erro ao exluir material, passe um id existente!"));
        respository.deleteById(id);
    }

    public MaterialDTO findById(Long id) throws ResouceNotFoundException {
        ObjectMapper objectMapper = new ObjectMapper();
        Optional<Material> optionalMaterial = respository.findById(id);

        //Usando jackson para converter material em materialDTO
        MaterialDTO materialDTO = null;

        try{
            Material material = optionalMaterial.get();
            materialDTO = objectMapper.convertValue(material, MaterialDTO.class);

        }catch (Exception e){
            throw  new ResouceNotFoundException("Erro ao buscar o material, id não encontrado!");

        }

        return materialDTO;

    }

    public List<Material> findByNameMaterial(String nameMaterial){
        return respository.findByNameMaterial(nameMaterial);
    }
}

