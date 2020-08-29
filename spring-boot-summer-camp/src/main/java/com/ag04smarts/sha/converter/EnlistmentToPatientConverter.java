package com.ag04smarts.sha.converter;

import com.ag04smarts.sha.form.EnlistmentForm;
import com.ag04smarts.sha.domain.Patient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EnlistmentToPatientConverter implements Converter<EnlistmentForm, Patient> {

    @Override
    public Patient convert(final EnlistmentForm source) {
        Patient patient = new Patient();
        patient.setFirstName(source.getFistName());
        patient.setLastName(source.getLastName());
        patient.setEnlistmentDate(new Date());
        patient.setGender(source.getGender());
        patient.setEmail(source.getEmail());
        patient.setAge(source.getAge());
        return patient;
    }
}
