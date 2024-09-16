package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindStudentByBatchCodeAndSubject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Batch-Code");
		String bcode=sc.next();
		
		System.out.println("Enter Subject");
		String sub=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select b.students from Batch b where b.batchCode=?1 and b.subject=?2");
		q.setParameter(1, bcode);
		q.setParameter(2, sub);
		List<Student> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (Student std : ls) {
				System.out.println(std);
			}
		}
		else
		{
			System.err.println("No Student details found...!");
		}
		sc.close();
	}
}
