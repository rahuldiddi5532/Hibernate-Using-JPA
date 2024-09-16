package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindStudentByBatchCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Batch-Code to get Student Details");
		String bcode=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select b.students from Batch b where b.batchCode=?1");
		q.setParameter(1, bcode);
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
