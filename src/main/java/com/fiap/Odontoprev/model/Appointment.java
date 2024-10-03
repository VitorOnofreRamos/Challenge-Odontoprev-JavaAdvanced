package com.fiap.Odontoprev.model;

import com.fiap.Odontoprev.model.ValueObjects.AppointmentDate;
import com.fiap.Odontoprev.model.ValueObjects.AppointmentLocation;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "appointments")
public class Appointment extends _BaseEntity{
    @Column(length = 255)
    private String appointmentReason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private AppointmentLocation location;

    @Embedded
    private AppointmentDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Treatment> treatments = new ArrayList<>();
}
