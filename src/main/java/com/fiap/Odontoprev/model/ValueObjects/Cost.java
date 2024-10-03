package com.fiap.Odontoprev.model.ValueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;

@Embeddable
public class Cost {
    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;
}
