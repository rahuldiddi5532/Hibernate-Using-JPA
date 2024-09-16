package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindEmployeesByDeptIdAndLocation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter Department Id");
	int id=sc.nextInt();
	
	System.out.println("Eneter Department Location");
	String loc=sc.next();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select d.emps from Department d where d.id=?1 and d.loc=?2");
	q.setParameter(1, id);
	q.setParameter(2, loc);
	List<Employee> le=q.getResultList();
	if(le.size()>0)
	{
		for (Employee e : le) {
			System.out.println(e);
		}
	}
	else
	{
		System.err.println("No Employee details found since invalid Department id and location...!");
	}
	
}
}
