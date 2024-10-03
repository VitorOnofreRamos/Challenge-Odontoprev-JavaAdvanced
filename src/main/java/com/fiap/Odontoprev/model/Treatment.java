package com.fiap.Odontoprev.model;

import com.fiap.Odontoprev.model.Enums.ProcedureType;
import com.fiap.Odontoprev.model.ValueObjects.Cost;
import jakarta.persistence.*;

@Entity
@Table(name = "treatments")
public class Treatment extends _BaseEntity{
    @Enumerated(EnumType.STRING)
    private ProcedureType procedureType;

    @Column(length = 255)
    private String procedureDescription;

    @Embedded
    private Cost cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
}