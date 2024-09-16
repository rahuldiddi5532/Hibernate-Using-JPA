package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindBatchByStudentPhoneAndName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Phone");
		long sphone=sc.nextLong();
		
		System.out.println("Enter the Student name");
		String sname=sc.next();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s.batches from Student s where s.phone=?1 and s.name=?2");
		q.setParameter(1, sphone);
		q.setParameter(2, sname);
		List<Batch> lb=q.getResultList();
		if(lb.size()>0)
		{
			for (Batch b : lb) {
				System.out.println(b);
			}
		}
		
		else
		{
			System.err.println("Invalid Student phone or name...!");
		}
		sc.close();
	}
}
