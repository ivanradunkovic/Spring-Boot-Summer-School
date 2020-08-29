package com.ag04smarts.sha.form;

import com.ag04smarts.sha.domain.Gender;
import lombok.Data;

@Data
public class EnlistmentForm {

    private String fistName;
    private String lastName;
    private String email;
    private Integer age;
    private Gender gender;
}
