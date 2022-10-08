package com.dh.Almoxarifado.respository._solicitationRepository;

import com.dh.Almoxarifado.entity._solicitation.Solicitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitationRepository extends JpaRepository<Solicitation,Long> {
}
