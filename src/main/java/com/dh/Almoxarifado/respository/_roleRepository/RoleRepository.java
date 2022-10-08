package com.dh.Almoxarifado.respository._roleRepository;

import com.dh.Almoxarifado.entity._user._role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
