package com.fiap.Odontoprev.model.ValueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AppointmentLocation{
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String state;
}