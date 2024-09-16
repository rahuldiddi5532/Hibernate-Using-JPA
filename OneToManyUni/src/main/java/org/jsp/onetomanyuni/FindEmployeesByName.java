package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindEmployeesByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to get Employee details");
		String name=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select e from Employee e where e.name=?1");
		q.setParameter(1, name);
		List<Employee> le=q.getResultList();
		if(le.size()>0)
		{
			for (Employee e : le) {
				System.out.println(e);
			}
		}
		else
		{
			System.err.println("No Employee record found since invalid name...!");
		}
		sc.close();
	}
}
