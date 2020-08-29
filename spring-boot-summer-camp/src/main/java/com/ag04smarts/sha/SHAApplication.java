package com.ag04smarts.sha;

import com.ag04smarts.sha.domain.Doctor;
import com.ag04smarts.sha.domain.DoctorExpertise;
import com.ag04smarts.sha.domain.Gender;
import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.domain.PatientMedicalRecord;
import com.ag04smarts.sha.domain.PatientTreatmentHistory;
import com.ag04smarts.sha.domain.Status;
import com.ag04smarts.sha.domain.Symptom;
import com.ag04smarts.sha.repositories.DoctorRepository;
import com.ag04smarts.sha.repositories.PatientRepository;
import com.ag04smarts.sha.repositories.SymptomRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableJpaRepositories
public class SHAApplication {

	private final SymptomRepository symptomRepository;
	private final PatientRepository patientRepository;
	private final DoctorRepository doctorRepository;

	public SHAApplication(SymptomRepository symptomRepository, PatientRepository patientRepository,
						  DoctorRepository doctorRepository) {
		this.symptomRepository = symptomRepository;
		this.patientRepository = patientRepository;
		this.doctorRepository = doctorRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SHAApplication.class, args);
	}

	@PostConstruct
	public void initApplication() {

		// Symptoms
		Symptom coughingSymptom = new Symptom();
		coughingSymptom.setDescription("Coughing");
		symptomRepository.save(coughingSymptom);

		Symptom fever = new Symptom();
		fever.setDescription("Fever");
		symptomRepository.save(fever);

		Set<Symptom> symptomSet = new HashSet<>();
		symptomSet.add(coughingSymptom);
		symptomSet.add(fever);

		//Doctors
		Doctor doctor = new Doctor();
		doctor.setFirstName("Doctor First");
		doctor.setLastName("Doctor Last");
		doctor.setDoctorExpertise(DoctorExpertise.GENERAL_DOCTOR);
		doctorRepository.save(doctor);

		//Patients
		Patient ivanPatient = new Patient();
		ivanPatient.setFirstName("Ivan");
		ivanPatient.setLastName("Radunković");
		ivanPatient.setAge(32);
		ivanPatient.setEmail("ivan@mail.com");
		ivanPatient.setGender(Gender.MALE);
		ivanPatient.setEnlistmentDate(new Date());
		ivanPatient.setStatus(Status.DIAGNOSED);

		Patient mateaPatient = new Patient();
		mateaPatient.setFirstName("Matea");
		mateaPatient.setLastName("Hrvat Radunković");
		mateaPatient.setAge(27);
		mateaPatient.setEmail("matea@mail.com");
		mateaPatient.setGender(Gender.FEMALE);
		mateaPatient.setEnlistmentDate(new Date());
		mateaPatient.setStatus(Status.CURED);

		//Patient treatment history
		PatientTreatmentHistory patientTreatmentHistory = new PatientTreatmentHistory();
		patientTreatmentHistory.setPatient(ivanPatient);
		patientTreatmentHistory.setOldStatus(Status.UNDER_DIAGNOSIS);
		patientTreatmentHistory.setNewStatus(Status.DIAGNOSED);
		patientTreatmentHistory.setDoctor(doctor);

		PatientTreatmentHistory patientTreatmentHistory2 = new PatientTreatmentHistory();
		patientTreatmentHistory2.setPatient(mateaPatient);
		patientTreatmentHistory2.setOldStatus(Status.DIAGNOSED);
		patientTreatmentHistory2.setNewStatus(Status.UNDER_TREATMENT);
		patientTreatmentHistory2.setDoctor(doctor);

		Set<PatientTreatmentHistory> patientTreatmentHistories = new HashSet<>();
		patientTreatmentHistories.add(patientTreatmentHistory);
		patientTreatmentHistories.add(patientTreatmentHistory2);
		ivanPatient.setPatientTreatmentHistories(patientTreatmentHistories);

		PatientMedicalRecord patientMedicalRecord = new PatientMedicalRecord();
		patientMedicalRecord.setDiagnosis("Diagnose");
		patientMedicalRecord.setTreatment("Treatment");
		patientMedicalRecord.setSymptoms(symptomSet);
		patientMedicalRecord.setPatient(ivanPatient);

		/*ivanPatient.setPatientMedicalRecord(patientMedicalRecord);
		patientRepository.save(ivanPatient);
		patientRepository.save(ivanPatient);*/
	}
}
