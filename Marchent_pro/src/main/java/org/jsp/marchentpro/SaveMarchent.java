package org.jsp.marchentpro;

import java.util.Scanner;

import javax.persistence.*;
import javax.persistence.Persistence;

public class SaveMarchent 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marchent name");
		String name=sc.next();
		
		System.out.println("Enter emali");
		String email=sc.next();
		
		System.out.println("Enter phone number");
		long phone=sc.nextLong();
		
        System.out.println("Enter GST number");
        String gst_number=sc.next();
        
        System.out.println("Enter password");
        String password=sc.next();
        
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
//		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		Marchent m1=new Marchent();
		m1.setName(name);
		m1.setPhone(phone);
		m1.setEmail(email);
		m1.setGst_number(gst_number);
		m1.setPassword(password);
		em.persist(m1);
		tran.commit();
		
		sc.close();
	}

}
