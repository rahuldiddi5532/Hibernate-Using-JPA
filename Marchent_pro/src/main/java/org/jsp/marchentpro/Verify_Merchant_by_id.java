package org.jsp.marchentpro;

import java.util.Scanner;

import javax.persistence.*;

public class Verify_Merchant_by_id 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Merchant id");
		int id=sc.nextInt();
		
		System.out.println("Enter the merchant password");
		String pass=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m from Marchent m where m.id=?1 and m.password=?2");
		q.setParameter(1, id);
		q.setParameter(2,pass);
		try
		{
			Marchent m=(Marchent)q.getSingleResult();
			System.out.println("Merchant is verified...");
			System.out.println(m);
		}
	     catch(NoResultException r)
		{
			System.err.println("Merchant is not found since Invalid is or passowed");
		}
		sc.close();
	}

}
