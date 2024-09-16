package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.*;

public class FindAadharcardByPhone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone number to get Aadharcard details");
		long phone=sc.nextLong();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		String qry="select u.card from User u where u.phone=?1";
		Query q=em.createQuery(qry);
		q.setParameter(1, phone);
		try
		{
			AadharCard a=(AadharCard)q.getSingleResult();
			System.out.println(a);
		}
		catch(NoResultException e)
		{
			System.err.println("No record found sisnce invalid phone number...!");
		}
		sc.close();
	}

}
