package com.ag04smarts.sha.repositories;

import com.ag04smarts.sha.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    Optional<Appointment> findByDoctorIdAndPatientIdAndAppointmentDate(Long doctorId, Long patientId, Date appointmentDate);
}
