package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindEmployeesByDepartmentIdAndName {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Department id");
	int id=sc.nextInt();
	
	System.out.println("Enter the Department name");
	String dname=sc.next();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select d.emps from Department d where d.id=?1 and d.name=?2");
	q.setParameter(1, id);
	q.setParameter(2, dname);
	List<Employee> le=q.getResultList();
	if(le.size()>0)
	{
		for (Employee e : le) {
			System.out.println(e);
		}
	}
	else
	{
		System.err.println("No Employee details found since invalid Department id or Department name...!");
	}
	
}
}
