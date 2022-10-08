package com.dh.Almoxarifado.entity._warehouse;

import com.dh.Almoxarifado.entity._address.Address;
import com.dh.Almoxarifado.entity._material.Material;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany
    @JoinTable(name = "warehouse_material",
                joinColumns = @JoinColumn(name = "id"),
                inverseJoinColumns = @JoinColumn(name = "id_material"))
    private List<Material> materials;

}
