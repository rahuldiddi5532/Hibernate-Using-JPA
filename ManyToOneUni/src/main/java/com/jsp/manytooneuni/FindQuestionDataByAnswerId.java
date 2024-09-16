package com.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindQuestionDataByAnswerId {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Answer id to fetch qusetion data");
	 int aid=sc.nextInt();
	 
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select a.question from AnswerData a where a.id=?1");
	q.setParameter(1, aid);
	try
	{
		QuestionData qd=(QuestionData) q.getSingleResult();
		System.out.println(qd);
	}
	catch(NoResultException e)
	{
		System.err.println("No question data found sisnce invalid anserw id...!");
	}
	sc.close();
}
}
