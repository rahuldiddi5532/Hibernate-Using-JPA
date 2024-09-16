package org.jsp.manytomanybi;

import java.util.Arrays;

import javax.persistence.*;
public class SaveBatchAndStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		Batch b1=new Batch();
		b1.setBatchCode("A2");
		b1.setTrainer("Guru");
		b1.setSubject("Hibernate");
		
	    Batch b2=new Batch();
		b2.setBatchCode("M2");
		b2.setTrainer("Abhi");
		b2.setSubject("Java");
		
		
		Student s1=new Student();
		s1.setName("Rahul");
		s1.setPhone(12345678920L);
		s1.setPerc(82.7);
		
		
		Student s2=new Student();
		s2.setName("Vinay");
		s2.setPhone(12345678981L);
		s2.setPerc(70.2);
		
		
		Student s3=new Student();
		s3.setName("Rangappa");
		s3.setPhone(654345678981L);
		s3.setPerc(70.5);
		
		s1.setBatches(Arrays.asList(b1,b2));
		s2.setBatches(Arrays.asList(b1,b2));
		s3.setBatches(Arrays.asList(b1));
		
		b1.setStudents(Arrays.asList(s1,s2,s3));
		b2.setStudents(Arrays.asList(s2,s3));
		
		em.persist(b1);
		em.persist(b2);
		tran.commit();
	
	}
}
