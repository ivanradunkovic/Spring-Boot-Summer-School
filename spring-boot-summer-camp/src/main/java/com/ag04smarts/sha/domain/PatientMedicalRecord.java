package com.ag04smarts.sha.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Data
@Entity
public class PatientMedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JsonIgnore
    private Patient patient;
    private String diagnosis;
    private String treatment;

    @ManyToMany
    @JoinTable(name="record_symptoms",
            joinColumns = @JoinColumn(name = "patient_record_id"), inverseJoinColumns = @JoinColumn(name = "symptom_id"))
    private Set<Symptom> symptoms;
}
