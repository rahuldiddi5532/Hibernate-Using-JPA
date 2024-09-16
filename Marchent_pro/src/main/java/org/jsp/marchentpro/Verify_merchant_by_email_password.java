package org.jsp.marchentpro;

import java.util.Scanner;

import javax.persistence.*;

public class Verify_merchant_by_email_password 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Merchant email");
		String email=sc.next();
		
		System.out.println("Enter Merchant password");
		String pass=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q= em.createQuery("select m from Marchent m where m.email=?1 and m.password=:pw");
		q.setParameter(1, email);
//		q.setParameter(2, pass);
		q.setParameter(""
				+ "pw",pass);
		try {
			Marchent m=(Marchent) q.getSingleResult();
			System.out.println("Merchant is verified...");
			System.out.println(m);
		}
		catch(NoResultException e)
		{
			System.err.println("Merchant not found since invalid email or password...");
		}
		sc.close();
	}

}
