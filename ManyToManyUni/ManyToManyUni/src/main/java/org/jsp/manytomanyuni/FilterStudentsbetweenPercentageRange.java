package org.jsp.manytomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FilterStudentsbetweenPercentageRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting percentage ");
		double start=sc.nextDouble();
		
		System.out.println("Enter end percentage");
		double end=sc.nextDouble();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s where s.prc between ?1 and ?2");
		q.setParameter(1, start);
		q.setParameter(2, end);
		List<Student> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (Student std : ls) {
				System.out.println(std);
				
			}
		}
		else
		{
			System.err.println("No Student record found since invalid percentage range...!");
		}
		sc.close();
		
	}
}
