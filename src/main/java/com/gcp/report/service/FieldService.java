package com.gcp.report.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcp.report.entity.Fields;
import com.gcp.report.repository.FieldRepository;

@Service
public class FieldService {
	@Autowired
	private FieldRepository repository;

	
	
	
	public Fields saveFields(Fields field) {
		return repository.save(field);
	}
	
	public List<Fields> getAllFields(){
		return repository.findAll();
	}
	
	public Fields getFieldsById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public String deleteField(int id) {
		repository.deleteById(id);
		return "Field deleted";
	}
	
	public Fields updateField(Fields field) {
		Fields existingField=repository.findById(field.getId()).get();
		existingField.setDescription(field.getDescription());
		existingField.setUrl(field.getUrl());
		
		return repository.save(existingField);
	}
	
	
}
