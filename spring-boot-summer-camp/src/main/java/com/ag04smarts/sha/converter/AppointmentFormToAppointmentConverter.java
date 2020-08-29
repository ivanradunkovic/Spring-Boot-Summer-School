package com.ag04smarts.sha.converter;

import com.ag04smarts.sha.form.AppointmentForm;
import com.ag04smarts.sha.domain.Appointment;
import com.ag04smarts.sha.repositories.DoctorRepository;
import com.ag04smarts.sha.repositories.PatientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class AppointmentFormToAppointmentConverter implements Converter<AppointmentForm, Appointment> {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    public AppointmentFormToAppointmentConverter(DoctorRepository doctorRepository, PatientRepository patientRepository) {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public Appointment convert(final AppointmentForm source) {
        Appointment appointment = new Appointment();

        try {
            DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            Date date = formatter.parse(source.getAppointmentDate());
            appointment.setAppointmentDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        appointment.setDoctor(doctorRepository.findById(source.getDoctorId()).get());
        appointment.setPatient(patientRepository.findById(source.getPatientId()).get());
        return appointment;
    }
}