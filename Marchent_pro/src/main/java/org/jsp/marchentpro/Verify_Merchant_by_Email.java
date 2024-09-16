package org.jsp.marchentpro;

import java.util.Scanner;

import javax.persistence.*;


public class Verify_Merchant_by_Email 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.next();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNamedQuery("verifyMerchatByEmail"); 
		q.setParameter(1,email);
		try
		{
			Marchent m=(Marchent) q.getSingleResult();
			System.out.println("Merchant is verified");
		}
		catch(NoResultException e)
		{
			System.out.println("email nod found");
		}
	}

}
