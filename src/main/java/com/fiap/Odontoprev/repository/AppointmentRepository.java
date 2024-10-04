package com.fiap.Odontoprev.repository;

import com.fiap.Odontoprev.model.Appointment;
import com.fiap.Odontoprev.model.Doctor;
import com.fiap.Odontoprev.model.Patient;
import com.fiap.Odontoprev.model.ValueObjects.AppointmentDate;
import com.fiap.Odontoprev.model.ValueObjects.AppointmentLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByPatient(Patient patient);
    List<Appointment> findByDoctor(Doctor doctor);
    List<Appointment> findByAppointmentDate(LocalDateTime date);
}
