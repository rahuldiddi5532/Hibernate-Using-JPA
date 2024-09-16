package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindDepartmentByLoc {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Location to find the Department details");
	 String dloc=sc.next();
	 
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select d from Department d where d.loc=?1");
	q.setParameter(1, dloc);
	List<Department> ld=q.getResultList();
	if(ld.size()>0)
	{
		for (Department d : ld) {
			System.out.println(d);
		}
	}
	else
	{
		System.err.println("No Department details found since invalid Location...!");
	}
	sc.close();
}
}
