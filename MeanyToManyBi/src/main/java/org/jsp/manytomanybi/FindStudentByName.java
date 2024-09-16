package org.jsp.manytomanybi;

import java.util.Scanner;

import javax.persistence.*;

public class FindStudentByName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name to fetch  Details");
		String name=sc.next();
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s where s.name=?1");
		q.setParameter(1, name);
		try
		{
			Student s=(Student) q.getSingleResult();
			System.out.println(s);
		}
		catch (NoResultException e) {
            System.err.println("Invalid Student name");
		}
		sc.close();
	}
	
}
