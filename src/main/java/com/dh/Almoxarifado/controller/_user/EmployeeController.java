package com.dh.Almoxarifado.controller._user;

import com.dh.Almoxarifado.entity._user._employee.Employee;
import com.dh.Almoxarifado.entity.dto.userDTO.EmployeeDTO;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.service._userService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee saveEmploye(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping
    public List<EmployeeDTO> employeeDTOList(){
        return service.findAll();
    }

    @PatchMapping
    public Employee changeEmployee(@RequestBody Employee employee) {
        return service.change(employee);
    }

    @DeleteMapping
    public void deleteEmploye(@RequestParam("id") Long id) throws ResouceNotFoundException{
        service.delete(id);
    }


}
