package com.fiap.Odontoprev.repository;

import com.fiap.Odontoprev.model.Doctor;
import com.fiap.Odontoprev.model.Enums.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Optional<Doctor> findByCrm(String crm);
    List<Doctor> findBySpecialities(Speciality speciality);
}
