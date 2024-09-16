package com.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindQuetiondataByPostedByAttribute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the person name who posted the question to get question data");
		String pbname=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select q from QuestionData q where q.postedBy=?1");
		q.setParameter(1, pbname);
		try
		{
			QuestionData qd=(QuestionData) q.getSingleResult();
			System.out.println(qd);
		}
		catch(NoResultException e)
		{
			System.err.println("No Question data found sisnce invalid name...!");
		}
				
		sc.close();		
	}
}
