package com.dh.Almoxarifado.entity.dto.userDTO;

import com.dh.Almoxarifado.entity._user._role.Role;
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
public class EmployeeDTO {
    private String name;
    private String lastname;
    private String registration;
//    private Role role;
}
