package com.dh.Almoxarifado.TestService;

import com.dh.Almoxarifado.entity._material.Material;
import com.dh.Almoxarifado.entity.dto.MaterialDTO.MaterialDTO;
import com.dh.Almoxarifado.service._materialService.MaterialService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
public class MaterialServiceTest {

    @Autowired
    MaterialService service;

    public static Material material;

    @BeforeAll
    public static void doBefore(){
        material = new Material();
        material.setNameMaterial("Chave de fenda");
        material.setDescription("Apertar parafuso");
    }

    @Test
    public void saveMaterial(){
        Material material1 = new Material();
        material1 = service.save(material);
        Assertions.assertNotNull(material1.getId());
    }

    @Test
    public void findAllMaterials(){
        List<MaterialDTO> materials = service.findAll();
        Assertions.assertNotNull(materials);
    }
}
