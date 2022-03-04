package com.te.maping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.maping.dto.Patient_Details;

@Repository
public class MyDaoImpl implements MyDao {

	@Override
	public boolean insert_P(Patient_Details details) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(details);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int patient_Id) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Patient_Details find = em.find(Patient_Details.class, patient_Id);
			em.remove(find);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update_mobile_number(int patient_Id, long patient_Mobile_Number) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Patient_Details find = em.find(Patient_Details.class, patient_Id);
			find.setPatient_Mobile_Number(patient_Mobile_Number);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(int patient_Id, String patient_Adress) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Patient_Details find = em.find(Patient_Details.class, patient_Id);
			find.setPatient_Adress(patient_Adress);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Patient_Details get_some(int patient_Id) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Patient_Details find = em.find(Patient_Details.class, patient_Id);
			transaction.commit();
			return find;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Patient_Details login(int patient_Id, String password) {
	
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Patient_Details find = em.find(Patient_Details.class, patient_Id);
			transaction.commit();
			return find;
			
	
	}

}