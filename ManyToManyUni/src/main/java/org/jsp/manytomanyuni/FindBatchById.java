package org.jsp.manytomanyuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindBatchById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Batch Id to sinde batch details");
		int bid=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Batch b=em.find(Batch.class, bid);
		if(b!=null)
		{
			System.out.println(b);
		}
		else
		{
			System.err.println("No Batch result found");
		}
		sc.close();
	}

}
