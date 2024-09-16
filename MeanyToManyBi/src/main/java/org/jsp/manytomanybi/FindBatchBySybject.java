package org.jsp.manytomanybi;

import java.util.Scanner;

import javax.persistence.*;
public class FindBatchBySybject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subject  to fetch Batch Details");
		String sub =sc.next();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select b from Batch b where b.subject=?1");
		q.setParameter(1, sub);
		try {
		Batch b=(Batch) q.getSingleResult();
		System.out.println(b);
		}
		catch(NoResultException e)
		{
			System.err.println("Invalid Subject");
		}
		sc.close();
	}
}
