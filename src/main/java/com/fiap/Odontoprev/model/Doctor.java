package com.fiap.Odontoprev.model;

import com.fiap.Odontoprev.model.Enums.Speciality;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "doctors")
public class Doctor extends _BaseEntity{
    @Column(nullable = false, length = 50)
    @Size(min = 3)
    private String name;

    @Column(nullable = false, unique = true, length = 12)
    @Pattern(regexp = "^\\d{6}-\\d{2}/[A-Z]{2}$")
    private String crm;

    @ManyToMany
    @JoinTable(
            name = "doctor_specialties",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id")
    )
    private Set<Speciality> specialities = new HashSet<>();

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments = new ArrayList<>();
}