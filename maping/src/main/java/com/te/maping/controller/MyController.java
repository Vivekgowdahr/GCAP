package com.te.maping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.maping.dto.Patient_Details;
import com.te.maping.service.MyService;

@Controller
public class MyController {

	@Autowired
	MyService service;

	@GetMapping("/login")
	public String login() {
		return "Loginpage";
	}
	
	@PostMapping("/login")
	public String loginId(int patient_Id,String password) {
		Patient_Details enter = service.enter(patient_Id, password);
		if (enter != null) {
			return "All";
		}return null;
		
	}
	@GetMapping("/logout")
	public String logout() {
		return "Loginpage";
	}
	
	@GetMapping("/insert_patient_Details")
	public String add() {
		return "insert_pDetails";
	}

	@PostMapping("/insert_patient_Details")
	public String add_Details(Patient_Details details) {
		if (service.addPat(details)) {
			return "success";
		}
		return "failure";
	}

	@GetMapping("/remove_patient_Details")
	public String remove() {
		return "remove_patient";
	}

	@PostMapping("/remove_patient_Details")
	public String remove_Details(@RequestParam int patient_Id) {
		if (service.remove_Patient(patient_Id)) {
			return "success";
		}
		return "failure";
	}

	@GetMapping("/Update_MobileNumber_patient_Details")
	public String update() {
		return "Update_number";
	}

	@PostMapping("/Update_MobileNumber_patient_Details")
	public String update_MobileNumber(int patient_Id, long patient_Mobile_Number) {
		if (service.update_number(patient_Id, patient_Mobile_Number)) {
			return "success";
		}
		return "failure";
	}

	@GetMapping("/Update_Adress_patient_Details")
	public String updateAdr() {
		return "Update_Adress";
	}

	@PostMapping("/Update_Adress_patient_Details")
	public String update_Adress(int patient_Id, String patient_Adress) {
		if (service.update_Adress(patient_Id, patient_Adress)) {
			return "success";
		}
		return "failure";
	}

	@GetMapping("/get_Single_patient_Details")
	public String get_single() {
		return "Single_patient_Details";
	}

	@PostMapping("/get_Single_patient_Details")
	public String get_one(ModelMap map, int patient_Id) {
		map.addAttribute("Single_data", service.get_pdetails(patient_Id));
		return "Single_result";
	}
}