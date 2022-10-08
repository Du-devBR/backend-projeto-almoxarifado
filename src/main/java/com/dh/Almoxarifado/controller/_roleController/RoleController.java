package com.dh.Almoxarifado.controller._roleController;

import com.dh.Almoxarifado.entity._user._role.Role;
import com.dh.Almoxarifado.service._roleService.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService service;

    @PostMapping
    public Role saveRole(@RequestBody Role role){
        return service.save(role);
    }
}
