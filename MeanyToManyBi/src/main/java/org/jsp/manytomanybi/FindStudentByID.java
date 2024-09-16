package org.jsp.manytomanybi;

import java.util.Scanner;

import javax.persistence.*;

public class FindStudentByID {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id to fetch  Details");
		int sid=sc.nextInt();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Student s=em.find(Student.class, sid);
		if(s!=null)
		{
			System.out.println(s);
		}
		else
		{
			System.err.println("Invalid Student id");
		}
		sc.close();
	}
}
