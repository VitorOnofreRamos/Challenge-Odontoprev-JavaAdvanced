package com.fiap.Odontoprev.model.ValueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public class AppointmentDate {
    @Column(nullable = false)
    private LocalDateTime date;
}