package com.ag04smarts.sha.controllers;

import com.ag04smarts.sha.converter.AppointmentFormToAppointmentConverter;
import com.ag04smarts.sha.domain.Appointment;
import com.ag04smarts.sha.form.AppointmentForm;
import com.ag04smarts.sha.services.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;
    private AppointmentFormToAppointmentConverter appointmentFormToAppointmentConverter;

    public AppointmentController(AppointmentService appointmentService, AppointmentFormToAppointmentConverter appointmentFormToAppointmentConverter) {
        this.appointmentService = appointmentService;
        this.appointmentFormToAppointmentConverter = appointmentFormToAppointmentConverter;
    }

    @PostMapping
    public ResponseEntity<Appointment> scheduleAppointment(@RequestBody AppointmentForm appointmentForm) {
        Appointment appointment = appointmentFormToAppointmentConverter.convert(appointmentForm);
        Optional<Appointment> savedAppointmentOptional = appointmentService.findByDoctorIdAndPatientIdAndAppointmentDate(
                appointment.getDoctor().getId(),
                appointment.getPatient().getId(),
                appointment.getAppointmentDate());
        if (savedAppointmentOptional.isPresent()) {
            return ResponseEntity.badRequest().build();
        } else {
            appointmentService.save(appointment);
        }
        return ResponseEntity.ok().build();
    }
}
