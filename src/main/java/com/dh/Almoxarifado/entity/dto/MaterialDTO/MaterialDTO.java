package com.dh.Almoxarifado.entity.dto.MaterialDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialDTO {
    private String nameMaterial;
    private String description;
//    private TypeMaterial typeMaterial;
}
