package org.jsp.onetomanyuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindDepartmentById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department id to fetch the record");
		int did=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Department d=em.find(Department.class, did);
		if(d!=null)
		{
			System.out.println(d);
		}
		else
		{
			System.err.println("No department details found since invalid id...!");
		}
		sc.close();
	}

}
