package com.ag04smarts.sha.controllers;

import com.ag04smarts.sha.converter.EnlistmentToPatientConverter;
import com.ag04smarts.sha.form.EnlistmentForm;
import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.services.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/enlistment")
public class EnlistmentController {

    private final EnlistmentToPatientConverter enlistmentToPatientConverter;
    private final PatientService patientService;
    public EnlistmentController(EnlistmentToPatientConverter enlistmentToPatientConverter, PatientService patientService) {
        this.enlistmentToPatientConverter = enlistmentToPatientConverter;
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<Patient> enlistPatient(@RequestBody EnlistmentForm enlistmentForm) {
        patientService.save(Objects.requireNonNull(enlistmentToPatientConverter.convert(enlistmentForm)));
        return ResponseEntity.ok().build();
    }
}
