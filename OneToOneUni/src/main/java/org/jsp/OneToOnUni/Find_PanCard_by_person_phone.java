package org.jsp.OneToOnUni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_PanCard_by_person_phone 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person phone number");
		long pPhone=sc.nextLong();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
	    Query q=em.createQuery("select p.card from Person p where p.phone=?1");
	    q.setParameter(1, pPhone);
	    try
	    {
	    	PanCard pc=(PanCard) q.getSingleResult();
	    	System.out.println("Pancard details "+pc);
	    }
	    catch(NoResultException e)
	    {
	    	System.err.println("No Pan-Card deatils found since invalid phone number...!");
	    }
	    sc.close();
	}

}
