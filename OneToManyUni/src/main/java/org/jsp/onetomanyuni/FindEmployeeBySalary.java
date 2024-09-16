package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindEmployeeBySalary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter salary to fetch Employee details");
	double sal=sc.nextDouble();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select e from Employee e where e.sal=?1");
	q.setParameter(1, sal);
	List<Employee> le=q.getResultList();
	if(le.size()>0)
	{
		for (Employee e : le) {
			System.out.println(e);
		}
	}
	else
	{
		System.out.println("No Employee record found since invalid salary");
	}
	sc.close();
}
}
