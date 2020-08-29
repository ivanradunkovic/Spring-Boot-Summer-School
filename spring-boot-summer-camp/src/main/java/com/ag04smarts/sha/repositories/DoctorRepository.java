package com.ag04smarts.sha.repositories;

import com.ag04smarts.sha.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
