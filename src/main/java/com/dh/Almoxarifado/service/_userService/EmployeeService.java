package com.dh.Almoxarifado.service._userService;

import com.dh.Almoxarifado.entity._user._employee.Employee;
import com.dh.Almoxarifado.entity.dto.userDTO.EmployeeDTO;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.respository._userRespository.EmployeeRespository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRespository respository;

    public Employee save(Employee employee){
        return respository.save(employee);
    }

    public List<EmployeeDTO> findAll(){
        List<Employee> employees = respository.findAll();
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        for(Employee e : employees){
            employeeDTOS.add(objectMapper.convertValue(e,EmployeeDTO.class));
        }
        return employeeDTOS;
    }

    public Employee change(Employee employee){
        return respository.save(employee);
    }

    public void delete(Long id) throws ResouceNotFoundException {
        respository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Erro ao excluir fuincionario pelo id"));
        respository.deleteById(id);
    }
}
