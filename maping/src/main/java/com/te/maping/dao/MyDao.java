package com.te.maping.dao;

import com.te.maping.dto.Patient_Details;

public interface MyDao {

	public boolean insert_P(Patient_Details details);

	public boolean delete(int patient_Id);

	public boolean update_mobile_number(int patient_Id, long patient_Mobile_Number);

	public boolean update(int patient_Id, String patient_Adress);

	public Patient_Details get_some(int patient_Id);
	
	public Patient_Details login(int patient_Id,String password);

}