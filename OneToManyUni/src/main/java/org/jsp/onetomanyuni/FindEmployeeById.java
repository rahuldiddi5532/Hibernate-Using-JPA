package org.jsp.onetomanyuni;

import javax.persistence.*;

public class FindEmployeeById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class,2);
		if(e!=null)
		{
			System.out.println(e);
		}
		else
		{
			System.err.println("No Employee details found since invalid Employee id...!");
		}
	}
}
