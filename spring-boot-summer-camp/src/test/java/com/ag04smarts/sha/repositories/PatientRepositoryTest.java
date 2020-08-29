package com.ag04smarts.sha.repositories;

import com.ag04smarts.sha.domain.Patient;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class PatientRepositoryTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testRepository() {

        Patient p = new Patient();
        p.setFirstName("Ivan");
        p.setLastName("Radunkovic");
        p.setAge(32);

        patientRepository.save(p);

        Assert.assertNotNull(p.getId());
    }
}