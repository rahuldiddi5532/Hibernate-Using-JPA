package org.jsp.manytomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindStudentsBetweenAPercentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range of percentage");
		double start=sc.nextDouble();
		
		System.out.println("Enter the endig range of percentage");
		double end=sc.nextDouble();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
	    Query q=em.createQuery("select s from Student s where s.perc between ?1 and ?2");
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
	    	System.err.println("No Student record found...!");
	    }
	    sc.close();
	}
}
