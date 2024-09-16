package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.*;

public class FindAadharcardByNameAndPhone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String name=sc.next();
		
		System.out.println("Ether mobile number");
		long phone=sc.nextLong();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select u.card from User u where u.name=?1 and u.phone=?2");
		q.setParameter(1, name);
		q.setParameter(2, phone);
		try
		{
			AadharCard a=(AadharCard)q.getSingleResult();
			System.out.println(a);
		}
		catch(NoResultException e)
		{
			System.err.println("No record found since invalid name or phone number...!");
		}
	}
}
