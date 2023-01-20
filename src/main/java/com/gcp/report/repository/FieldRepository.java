package com.gcp.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gcp.report.entity.Fields;

public interface FieldRepository extends JpaRepository<Fields, Integer> {

	
}
