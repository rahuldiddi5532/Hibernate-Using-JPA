package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindBatchByStudentPhone {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student phone number to fetch Batch Details");
		long sphone=sc.nextLong();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s.batches from Student s where s.phone=?1");
		q.setParameter(1, sphone);
		List<Batch> lb=q.getResultList();
		if(lb.size()>0)
		{
			for (Batch b: lb) {
				System.out.println(b);
			}
		}
		else
		{
			System.err.println("Invalid phone number...!");
		}
			sc.close();
	}
}
