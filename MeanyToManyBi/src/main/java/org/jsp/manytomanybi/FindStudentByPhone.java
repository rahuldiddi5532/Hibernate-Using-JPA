package org.jsp.manytomanybi;

import java.util.Scanner;

import javax.persistence.*;

public class FindStudentByPhone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student phone number");
		long sphone=sc.nextLong();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s where s.phone=?1");
		q.setParameter(1, sphone);
		try
		{
			Student s=(Student) q.getSingleResult();
			System.out.println(s);
		}
		catch (NoResultException e) {
         System.err.println("No Student record found...!");
		}
		sc.close();
	}

}
