package com.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindQuestionDataByQuestionAttribute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Wuestion to fetch question data");
		String question=sc.nextLine();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select q from QuestionData q where q.question=?1");
		q.setParameter(1, question);
		try
		{
			QuestionData qd=(QuestionData) q.getSingleResult();
			System.out.println(qd);
		}
		catch(NoResultException e)
		{
			System.out.println("No question data found sisnce invalid question");
		}
		sc.close();
	}
}
