package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindStudentByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name to fetch student details");
		String sname=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q =em.createQuery("select s from Student s where s.name=?1");
		q.setParameter(1, sname);
		List<Student> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (Student std : ls) {
				System.out.println(std);
			}
		}
	  else
		{
			System.err.println("No student record found since invalid Student id...!");
		}
		sc.close();
	}
}

