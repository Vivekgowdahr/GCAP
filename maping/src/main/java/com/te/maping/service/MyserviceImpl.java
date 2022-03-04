package com.te.maping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.maping.dao.MyDao;
import com.te.maping.dto.Patient_Details;

@Service
public class MyserviceImpl implements MyService {

	@Autowired
	MyDao dao;

	@Override
	public boolean addPat(Patient_Details details) {
		if (details == null) {

			return false;
		} else {
			dao.insert_P(details);
			return true;
		}
	}

	@Override
	public boolean remove_Patient(int patient_Id) {
		if (patient_Id == 0) {
			return false;
		}
		dao.delete(patient_Id);
		return true;
	}

	@Override
	public boolean update_number(int patient_Id, long patient_Mobile_Number) {

		if (patient_Id == 0) {
			return false;
		} else {
			dao.update_mobile_number(patient_Id, patient_Mobile_Number);
			return true;
		}

	}

	@Override
	public boolean update_Adress(int patient_Id, String patient_Adress) {
		if (patient_Id == 0) {
			return false;
		} else {
			dao.update(patient_Id, patient_Adress);
			return true;
		}
	}

	@Override
	public Patient_Details get_pdetails(int patient_Id) {
		if (patient_Id == 0) {
			return null;
		} else {
			return dao.get_some(patient_Id);
		}
	}

	@Override
	public Patient_Details enter(int patient_Id, String password) {
		Patient_Details login = dao.login(patient_Id, password);
		if (login != null && password.equals(login.getPassword())) {
			return login;
		}return null;
	}

}