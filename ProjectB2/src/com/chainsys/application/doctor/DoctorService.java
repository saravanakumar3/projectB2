package com.chainsys.application.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.context.annotation.Bean;

@RestController
public class DoctorService {
	@Autowired
	private DoctorRepositories repo;
//	@Bean
//	private void createRepo(DoctorRepositories repo) {
//		this.repo=repo;
//	}
	@GetMapping("/getDoctor")
	public Doctors getDoctor(int id) {
		return repo.findById(id);
	}
	@PostMapping(value="/addDoctors", consumes="application/json")
	// we need to give where to readdata from the http request and also the content type (application/json)
	public String AddNewDoctor(@RequestBody Doctors dr) {
//		System.out.println("Doctor: "+dr.getDoc_id()+" "+dr.getDoc_name());
		repo.save(dr);
		return "redirect:/AddNewDoctors";
	}
	@PostMapping(value="/modifyDoctors", consumes="application/json")
	public String modifyDoctor(@RequestBody Doctors dr) {
//		System.out.println("Doctor: "+dr.getDoc_id()+" "+dr.getDoc_name());
		repo.save(dr);
		return "redirect:/ModifyDoctors";
	}
	@GetMapping("GetAllDoctors")
	public List<Doctors> GetAllDoctors(){
		return repo.findAll();
	}
	@DeleteMapping("/deleteDoctors")
	public String DeleteDoctor(int id) {
		repo.deleteById(id);
		return "redirect:/DeleteDoctors";
	}
}
