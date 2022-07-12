package com.chainsys.application.doctor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepositories extends CrudRepository<Doctors, Integer> {
	Doctors findById(int id);
	Doctors save(Doctors dr);
	// used for adding a new customer and modifying the existing customer
	void deleteById(int id);
	List<Doctors> findAll();
	
}
