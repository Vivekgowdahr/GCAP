package com.te.maping.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_Id;
	private String patient_First_Name;
	private String patient_Middle_Name;
	private String patient_Last_Name;
	private Long patient_Mobile_Number;
	private String patient_Mail;
	private String patient_Date_Of_Birth;
	private int patient_Age;
	private String patient_Gender;
	private String patient_Adress;
	private String password;

	public int getPatient_Id() {
		return patient_Id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getPatient_First_Name() {
		return patient_First_Name;
	}

	public void setPatient_First_Name(String patient_First_Name) {
		this.patient_First_Name = patient_First_Name;
	}

	public String getPatient_Middle_Name() {
		return patient_Middle_Name;
	}

	public void setPatient_Middle_Name(String patient_Middle_Name) {
		this.patient_Middle_Name = patient_Middle_Name;
	}

	public String getPatient_Last_Name() {
		return patient_Last_Name;
	}

	public void setPatient_Last_Name(String patient_Last_Name) {
		this.patient_Last_Name = patient_Last_Name;
	}

	public Long getPatient_Mobile_Number() {
		return patient_Mobile_Number;
	}

	public void setPatient_Mobile_Number(Long patient_Mobile_Number) {
		this.patient_Mobile_Number = patient_Mobile_Number;
	}

	public String getPatient_Mail() {
		return patient_Mail;
	}

	public void setPatient_Mail(String patient_Mail) {
		this.patient_Mail = patient_Mail;
	}

	public String getPatient_Date_Of_Birth() {
		return patient_Date_Of_Birth;
	}

	public void setPatient_Date_Of_Birth(String patient_Date_Of_Birth) {
		this.patient_Date_Of_Birth = patient_Date_Of_Birth;
	}

	public int getPatient_Age() {
		return patient_Age;
	}

	public void setPatient_Age(int patient_Age) {
		this.patient_Age = patient_Age;
	}

	public String getPatient_Gender() {
		return patient_Gender;
	}

	public void setPatient_Gender(String patient_Gender) {
		this.patient_Gender = patient_Gender;
	}

	public String getPatient_Adress() {
		return patient_Adress;
	}

	public void setPatient_Adress(String patient_Adress) {
		this.patient_Adress = patient_Adress;
	}

	@Override
	public String toString() {
		return "Patient_Details [patient_Id=" + patient_Id + ", patient_First_Name=" + patient_First_Name
				+ ", patient_Middle_Name=" + patient_Middle_Name + ", patient_Last_Name=" + patient_Last_Name
				+ ", patient_Mobile_Number=" + patient_Mobile_Number + ", patient_Mail=" + patient_Mail
				+ ", patient_Date_Of_Birth=" + patient_Date_Of_Birth + ", patient_Age=" + patient_Age
				+ ", patient_Gender=" + patient_Gender + ", patient_Adress=" + patient_Adress + ", password=" + password
				+ "]";
	}

}