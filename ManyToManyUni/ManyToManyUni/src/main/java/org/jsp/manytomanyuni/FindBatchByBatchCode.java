package org.jsp.manytomanyuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindBatchByBatchCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter batch-code to fetch the batch details");
		String bcode=sc.next();
		 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select b from Batch b where b.batchCode=?1");
		q.setParameter(1, bcode);
		try
		{
			Batch b=(Batch) q.getSingleResult();
			System.out.println(b);
		}
		catch(NoResultException e)
		{System.err.println("No Batch data found since invalid Batch-code");
		}
		sc.close();
		}
	}

