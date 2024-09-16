package org.jsp.manytomanyuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindStudentById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id to fetch student details");
		int sid=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Student s=em.find(Student.class, sid);
		if(s!=null)
		{
			System.out.println(s);
		}
		else
		{
			System.err.println("No student record found since invalid Student id...!");
		}
		sc.close();
	}
}
