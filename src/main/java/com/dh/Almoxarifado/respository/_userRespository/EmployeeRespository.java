package com.dh.Almoxarifado.respository._userRespository;

import com.dh.Almoxarifado.entity._user._employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Long> {
}
