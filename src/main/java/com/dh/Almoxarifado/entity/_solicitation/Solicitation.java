package com.dh.Almoxarifado.entity._solicitation;

import com.dh.Almoxarifado.entity._material.Material;
import com.dh.Almoxarifado.entity._user._employee.Employee;
import com.dh.Almoxarifado.entity._warehouse.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Solicitation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private int orderNumber;
    private int amountReq;
//    private LocalDate createdAt;
    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private Warehouse warehouse;
    @OneToOne
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee employee;

    @OneToMany
    @JoinColumn(name = "id_material")
    private List<Material> materials;

}
