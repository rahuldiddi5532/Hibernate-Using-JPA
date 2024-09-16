package org.jsp.onetomanybi;

import java.util.Scanner;

import javax.persistence.*;

public class VerifyMerchantByPhoneAndPassword {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Merchant Phone number");
	Long phone=sc.nextLong();
	
	System.out.println("Enter the Merchant Password");
	String pass=sc.next();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select m from Merchent m where m.phone=?1 and m.password=?2");
	q.setParameter(1, phone);
	q.setParameter(2,pass);
	try {
	Merchent m=(Merchent) q.getSingleResult();
	System.out.println("Merchant verified...");
	System.out.println(m);
	}
	catch(NoResultException e)
	{
		System.out.println("No ");
	}
	sc.close();
	}
}
