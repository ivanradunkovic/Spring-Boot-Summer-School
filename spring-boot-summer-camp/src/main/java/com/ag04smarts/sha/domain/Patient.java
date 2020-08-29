package com.ag04smarts.sha.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Patient extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date enlistmentDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    @EqualsAndHashCode.Exclude
    private Set<PatientTreatmentHistory> patientTreatmentHistories = new HashSet<>();;

    @OneToOne(cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private PatientMedicalRecord patientMedicalRecord;

    private Date createDate;
    private Date modifyDate;

    @PrePersist
    private void prePersistCreateDate(){
        this.createDate = new Date();
    }

    @PreUpdate
    private void preUpdateModifyDate(){
        this.modifyDate = new Date();
    }
}
