package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindStudentsByTrainerAndBatchCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter trainer name");
		String tname=sc.next();
		
		System.out.println("Enter Batch-Code");
		String bcode=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select b.students from Batch b where b.trainer=?1 and b.batchCode=?2");
		q.setParameter(1, tname);
		q.setParameter(2, bcode);
		List<Student> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (Student std : ls) {
				System.out.println(std);
			}
		}
		else
		{
			System.err.println("No Student record found...!");
		}
		
		sc.close();
	}
}
