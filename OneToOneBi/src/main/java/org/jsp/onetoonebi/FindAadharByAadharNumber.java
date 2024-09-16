package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.*;

public class FindAadharByAadharNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Aadharcard number to fetch the record");
		long anumber=sc.nextLong();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		String qry="select a from AadharCard a where a.number=?1";
		Query q=em.createQuery(qry);
		q.setParameter(1, anumber);
		try {
		AadharCard a=(AadharCard)q.getSingleResult();
		System.out.println(a);
		}
		catch(NoResultException e)
		{
			System.err.println("No record found since invlid Aadharcard number...!");
		}
		sc.close();
	}

}
