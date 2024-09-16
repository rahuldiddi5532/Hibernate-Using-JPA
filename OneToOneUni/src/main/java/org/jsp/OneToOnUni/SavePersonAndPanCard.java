package org.jsp.OneToOnUni;

import java.util.Scanner;

import javax.persistence.*;

public class SavePersonAndPanCard 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater Person deatils");
		System.out.println("Enter Person name");
		String name=sc.next();
		
		System.out.println("Enter Person Phone numbar ");
		long phone= sc.nextLong();
		
		System.out.println("Enter pancard details");
		System.out.println("Enter pancard number");
		String pCardNumber=sc.next();
		
		System.out.println("Enter pincode");
		int pincode=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		Person p=new Person();
		p.setName(name);
		p.setPhone(phone);
		
		PanCard card=new PanCard();
		card.setNumber(pCardNumber);
		card.setPincode(pincode);
		
		p.setCard(card);
		em.persist(p);
		em.persist(card);
		tran.commit();
		sc.close();
	}
	

}
