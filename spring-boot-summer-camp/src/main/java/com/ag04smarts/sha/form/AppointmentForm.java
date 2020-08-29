package com.ag04smarts.sha.form;

import com.ag04smarts.sha.domain.Gender;
import lombok.*;

@Data
public class AppointmentForm {

    private Long patientId;
    private Long doctorId;
    private String firstName;
    private String lastName;
    private String appointmentDate;
    private Gender gender;
    private String email;
    private Integer age;
}


