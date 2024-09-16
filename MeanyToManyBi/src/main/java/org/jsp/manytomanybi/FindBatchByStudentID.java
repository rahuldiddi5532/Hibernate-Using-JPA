package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindBatchByStudentID {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id to fetch Batch Details");
		int sid=sc.nextInt();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s.batches from Student s where s.id=?1");
		q.setParameter(1, sid);
		List<Batch> lb=q.getResultList();
		if(lb.size()>0)
		{
			for (Batch b : lb) {
				System.out.println(b);
			}
		}
		else
		{
			System.err.println("No Batch recored found");
		}
		sc.close();
	}
}
