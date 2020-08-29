package com.ag04smarts.sha.domain;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    private String firstName;
    private String lastName;
}
