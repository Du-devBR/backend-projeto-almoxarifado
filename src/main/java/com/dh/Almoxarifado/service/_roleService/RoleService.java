package com.dh.Almoxarifado.service._roleService;

import com.dh.Almoxarifado.entity._user._role.Role;
import com.dh.Almoxarifado.respository._roleRepository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepository repository;

    public Role save(Role role){
        return repository.save(role);
    }
}
