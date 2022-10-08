package com.dh.Almoxarifado.controller._solicitationController;

import com.dh.Almoxarifado.entity._solicitation.Solicitation;
import com.dh.Almoxarifado.entity.dto._solicitation.SolicitationDTO;
import com.dh.Almoxarifado.service._solicitationService.SolicitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitationController {

    @Autowired
    SolicitationService service;

    @PostMapping
    public Solicitation saveSolicitation(@RequestBody Solicitation solicitation){
        return service.save(solicitation);
    }

    @GetMapping
    public List<SolicitationDTO> findAllSolicitation(){
        return service.solicitationDTOList();
    }
}
