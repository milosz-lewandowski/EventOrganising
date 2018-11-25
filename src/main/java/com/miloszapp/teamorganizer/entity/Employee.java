package com.miloszapp.teamorganizer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Emplyees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NotNull
    private int key;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    private int age;

    private String sex;

    @NotNull
    private int experiencelevel;

    @NotNull
    private BigDecimal costOfEmployment;

    @NotNull
    private BigDecimal salary;

    @NotNull
    private BigDecimal ZUScost;

    private boolean isStudent;

    private String location;

    private List<Costume> costumeElements;

    private Map<Hotel, Integer> bestLocations;



}
