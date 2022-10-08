package com.dh.Almoxarifado.entity._user._maneger;

import com.dh.Almoxarifado.entity._address.Address;
import com.dh.Almoxarifado.entity._user._employee.Employee;
import com.dh.Almoxarifado.entity._user._role.Role;
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
public class Maneger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String lastname;
    private String login;
    private String email;
    private String password;
    private String registration;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;
    @OneToMany
    @JoinColumn(name = "id_maneger")
    private List<Employee> employees;

}
