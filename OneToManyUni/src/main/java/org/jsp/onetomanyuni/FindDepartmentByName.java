package org.jsp.onetomanyuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindDepartmentByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department name to fetch the details");
		String dname=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select d from Department d where d.name=?1");
		q.setParameter(1, dname);
		try
		{
			Department d=(Department)q.getSingleResult();
			System.out.println(d);
		}
		catch(NoResultException e)
		{
			System.err.println("No Department details found since invalid Department name...!");
		}
		sc.close();
	}
}
