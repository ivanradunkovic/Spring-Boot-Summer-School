package com.ag04smarts.sha.services;

import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.domain.Status;
import com.ag04smarts.sha.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> findAllPatientsUnderAgeEnlistedAfterDate(int age, Date date) {
        return patientRepository.findAllByAgeBeforeAndEnlistmentDateAfter(age, date);
    }

    public List<Patient> findAllByPatientMedicalRecordSymptomsDescription(List<String> symptoms) {
        return patientRepository.findDistinctByPatientMedicalRecordSymptomsDescriptionIn(symptoms);
    }

    public Patient save(Patient patient) {
        if (patient.getStatus() == null) {
            patient.setStatus(Status.ENLISTED);
        }
        return patientRepository.save(patient);
    }
}
