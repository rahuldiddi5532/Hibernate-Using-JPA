package org.jsp.onetomanyuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindEmployeeByDepartmentId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department id to fetch Employee details");
		int id=sc.nextInt();
	     
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select d.emps from Department d where d.id=?1");
        q.setParameter(1,id);
        List<Employee> le=q.getResultList();
        	if(le.size()>0)
        	{
        		for (Employee e : le) {
					System.out.println(e);
				}
        	}
        	else
        	{
        		System.err.println("No Employee details found since invalid Department id...!");
        	}
        
		
		sc.close();
	}
}
