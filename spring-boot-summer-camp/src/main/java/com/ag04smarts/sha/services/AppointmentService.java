package com.ag04smarts.sha.services;

import com.ag04smarts.sha.domain.Appointment;
import com.ag04smarts.sha.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Optional<Appointment> findByDoctorIdAndPatientIdAndAppointmentDate(final Long doctorId, final Long patientId, final Date appointmentDate) {
        return appointmentRepository.findByDoctorIdAndPatientIdAndAppointmentDate(doctorId, patientId ,appointmentDate);
    }
}