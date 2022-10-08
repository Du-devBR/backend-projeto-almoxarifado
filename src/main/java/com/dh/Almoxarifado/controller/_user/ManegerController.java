package com.dh.Almoxarifado.controller._user;

import com.dh.Almoxarifado.entity._user._maneger.Maneger;
import com.dh.Almoxarifado.entity.dto.userDTO.ManegerDTO;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.service._userService.ManegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supervisao")
public class ManegerController {

    @Autowired
    ManegerService service;

    @PostMapping
    public Maneger saveManeger(@RequestBody Maneger maneger){
        return service.save(maneger);

    }

    @GetMapping
    public List<ManegerDTO> findAllManeger(){
        return service.findAll();
    }

    @PatchMapping
    public Maneger changeManger(@RequestBody Maneger maneger){
        return service.change(maneger);
    }

    @DeleteMapping
    public void deleteManeger(@RequestParam("id") Long id) throws ResouceNotFoundException {
        service.delete(id);
    }
}
