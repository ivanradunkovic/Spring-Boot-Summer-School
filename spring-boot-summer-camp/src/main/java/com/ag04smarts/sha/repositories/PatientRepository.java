package com.ag04smarts.sha.repositories;

import com.ag04smarts.sha.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    List<Patient> findAllByAgeBeforeAndEnlistmentDateAfter(int age, Date enlistmentsDate);
    List<Patient> findDistinctByPatientMedicalRecordSymptomsDescriptionIn(List<String> symptoms);
}
