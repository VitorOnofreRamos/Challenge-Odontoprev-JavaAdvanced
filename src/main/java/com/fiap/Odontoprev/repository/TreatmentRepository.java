package com.fiap.Odontoprev.repository;

import com.fiap.Odontoprev.model.Appointment;
import com.fiap.Odontoprev.model.Enums.ProcedureType;
import com.fiap.Odontoprev.model.Treatment;

import java.util.List;

public interface TreatmentRepository {
    List<Treatment> findByProcedureType(ProcedureType procedureType);
    List<Treatment> findByAppointment(Appointment appointment);
}
