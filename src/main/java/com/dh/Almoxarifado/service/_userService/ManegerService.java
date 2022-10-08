package com.dh.Almoxarifado.service._userService;

import com.dh.Almoxarifado.entity._user._maneger.Maneger;
import com.dh.Almoxarifado.entity.dto.userDTO.ManegerDTO;
import com.dh.Almoxarifado.exception.ResouceNotFoundException;
import com.dh.Almoxarifado.respository._userRespository.MangegerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManegerService {
    @Autowired
    MangegerRepository repository;

    public Maneger save(Maneger maneger){
        return repository.save(maneger);
    }

    public List<ManegerDTO> findAll(){
        List<Maneger> manegers = repository.findAll();
        List<ManegerDTO> manegerDTOList = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();

        for(Maneger m : manegers){
            manegerDTOList.add(objectMapper.convertValue(m, ManegerDTO.class));
        }
        return manegerDTOList;
    }

    public Maneger change(Maneger maneger){
        return repository.save(maneger);
    }

    public void delete(Long id) throws ResouceNotFoundException {
        repository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Erro ao excluir gerente!"));
        repository.deleteById(id);
    }


}
