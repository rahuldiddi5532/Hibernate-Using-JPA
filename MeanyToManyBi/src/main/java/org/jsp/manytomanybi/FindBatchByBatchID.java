package org.jsp.manytomanybi;

import java.util.Scanner;

import javax.persistence.*;

public class FindBatchByBatchID {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Batch id to fetch Batch Details");
		int bid=sc.nextInt();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Batch b=em.find(Batch.class, bid);
		if(b!=null)
		{
			System.out.println(b);
		}
		else
		{
			System.err.println("Invalid Batch id");
		}
		sc.close();
	}
}
