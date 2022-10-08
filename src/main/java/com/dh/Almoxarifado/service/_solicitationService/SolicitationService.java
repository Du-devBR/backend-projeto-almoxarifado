package com.dh.Almoxarifado.service._solicitationService;

import com.dh.Almoxarifado.entity._solicitation.Solicitation;
import com.dh.Almoxarifado.entity.dto._solicitation.SolicitationDTO;
import com.dh.Almoxarifado.respository._solicitationRepository.SolicitationRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitationService {
    @Autowired
    SolicitationRepository repository;

    public Solicitation save(Solicitation solicitation){
        return repository.save(solicitation);
    }

    public List<SolicitationDTO> solicitationDTOList(){
        List<Solicitation> solicitations = repository.findAll();
        List<SolicitationDTO> solicitationDTOList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        for (Solicitation s : solicitations){
            solicitationDTOList.add(objectMapper.convertValue(s,SolicitationDTO.class));

        }
        return solicitationDTOList;
    }
}
