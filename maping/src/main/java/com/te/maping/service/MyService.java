package com.te.maping.service;

import com.te.maping.dto.Patient_Details;

public interface MyService {

	public boolean addPat(Patient_Details details);

	public boolean remove_Patient(int patient_Id);

	public boolean update_number(int patient_Id, long patient_Mobile_Number);

	public boolean update_Adress(int patient_Id, String patient_Adress);

	public Patient_Details get_pdetails(int patient_Id);
	
	public Patient_Details enter(int patient_Id,String password);

}