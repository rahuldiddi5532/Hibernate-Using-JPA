package org.jsp.manytomanyuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindBatchByTrainerName {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Trainer name to fetch the Batch record");
		String tname=sc.next();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select b from Batch b where b.trainer=?1");
		q.setParameter(1, tname);
		try
		{
			Batch b =(Batch) q.getSingleResult();
			System.out.println(b);
		}
		catch (NoResultException e) {
         System.err.println("No batch record found sisnce invalid Trainer name");
		}
		sc.close();
	}

}
