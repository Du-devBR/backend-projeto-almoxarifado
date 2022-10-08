package com.dh.Almoxarifado.entity.dto._solicitation;

import com.dh.Almoxarifado.entity._user._employee.Employee;
import com.dh.Almoxarifado.entity.dto.MaterialDTO.MaterialDTO;
import com.dh.Almoxarifado.entity.dto.userDTO.EmployeeDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SolicitationDTO {
    private int orderNumber;
    private int amountReq;
//    private LocalDate createdAt;
    private EmployeeDTO employee;
    private List<MaterialDTO> materials;
}
