package com.bankdetails;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class OneToManygetval {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
	try {
		emf = Persistence.createEntityManagerFactory("corebanking");
		entityManager = emf.createEntityManager();

		transaction = entityManager.getTransaction();

		// start transaction
		transaction.begin();
	// start transaction
	
	Employee ep=new Employee();
	ep.setEname("CTS");
	
	Bank b=new Bank();
	b.setBname("HDFC");
	b.setEmployee(ep);
	
	Bank b1=new Bank();
	b1.setBname("ICIC");
	b1.setEmployee(ep);
	
	Bank b2=new Bank();
	b2.setBname("AXIS");
	b2.setEmployee(ep);
	
	List<Bank> BaList = new ArrayList();
	BaList.add(b);
	BaList.add(b1);
	BaList.add(b2);
	
	ep.setListbank(BaList);

	entityManager.persist(ep);
	System.out.println("Bank details successfull....");
	
} catch (Exception e) {
		System.out.println(e);
		transaction.rollback();
	} finally {
		if (transaction.isActive()) {
			transaction.commit();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (emf != null) {
			emf.close();
		}
	}
}
	}

