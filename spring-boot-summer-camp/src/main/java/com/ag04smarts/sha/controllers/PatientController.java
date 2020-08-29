package com.ag04smarts.sha.controllers;

import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.services.PatientService;;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/underage")
    public ResponseEntity<List<Patient>> findAllUnderagePatients() throws ParseException {
        List<Patient> patients = patientService.findAllPatientsUnderAgeEnlistedAfterDate(21, new SimpleDateFormat("dd.MM.yyyy").parse("01.01.2020"));
        return ResponseEntity.ok(patients);
    }

    @GetMapping("/symptoms")
    public ResponseEntity<List<Patient>> findAllPatientsWithSymptoms() throws ParseException {
        List<String> symptomList = List.of("Coughing", "Fever");
        List<Patient> patients = patientService.findAllByPatientMedicalRecordSymptomsDescription(symptomList);
        return ResponseEntity.ok(patients);
    }
}



