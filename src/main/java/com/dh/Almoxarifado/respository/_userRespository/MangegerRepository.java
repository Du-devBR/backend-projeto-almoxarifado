package com.dh.Almoxarifado.respository._userRespository;

import com.dh.Almoxarifado.entity._user._maneger.Maneger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangegerRepository extends JpaRepository<Maneger,Long> {
}
