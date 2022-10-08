package com.dh.Almoxarifado.respository._addressRepository;

import com.dh.Almoxarifado.entity._address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
