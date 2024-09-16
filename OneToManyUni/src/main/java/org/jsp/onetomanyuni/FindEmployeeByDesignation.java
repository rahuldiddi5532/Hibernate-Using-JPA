package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindEmployeeByDesignation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Desiganation to find Employee details");
	String deg=sc.next();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select e from Employee e where e.deg=?1");
	q.setParameter(1,deg);
	List<Employee> le=q.getResultList();
	if(le.size()>0)
	{
		for (Employee e : le) {
			System.out.println(e);
		}
	}
	else
	{
		System.err.println("No employee record find since invalid degination...!");
	}
	sc.close();
	
}
}
