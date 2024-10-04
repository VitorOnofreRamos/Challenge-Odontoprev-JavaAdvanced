package com.fiap.Odontoprev.repository;

import com.fiap.Odontoprev.model.Enums.Gender;
import com.fiap.Odontoprev.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    Optional<Patient> findByCpf(String cpf);
    List<Patient> findByGender(Gender gender);
}
