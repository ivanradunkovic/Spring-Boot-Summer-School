package com.ag04smarts.sha.repositories;

import com.ag04smarts.sha.domain.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SymptomRepository extends JpaRepository<Symptom,Long> {
}
