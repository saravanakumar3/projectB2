package com.chainsys.application.doctor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Table;
@Entity
@Table(name="Doctors") //mapping, this work belongs to ORM(object relational mapping)
public class Doctors{
	@Id
	private int doc_id;
	private String doc_name;
	private Date dob;
	private String speciality;
	private String doc_city;
	private long phone;
	@Column(name="standard_fees")
	private float standard_fees;
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getdoc_city() {
		return doc_city;
	}
	public void setCity(String doc_city) {
		this.doc_city = doc_city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public float getstandard_fees() {
		return standard_fees;
	}
	public void setstandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %d", "doc_id,doc_name,dob,doc_city,phone");
	}
}
