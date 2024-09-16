package org.jsp.marchentpro;

import java.util.Scanner;

import javax.persistence.*;

public class Verify_Merchant_ny_phone 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Merchant phone number");
		long phone=sc.nextLong();
		
		System.out.println("Enter the Merchant password");
		String pass=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m from Marchent m where m.phone=?1 and m.password=?2");
	    q.setParameter(1, phone);
	    q.setParameter(2, pass);
	    
	    try {
	    Marchent m=(Marchent) q.getSingleResult();
	    System.out.println("Merchent is verified");
	    System.out.println(m);
	    }
	    catch(NoResultException e)
	    {
	    	System.err.println("Invalid Marchent phone number or password");
	    }
	    sc.close();
	}

}
