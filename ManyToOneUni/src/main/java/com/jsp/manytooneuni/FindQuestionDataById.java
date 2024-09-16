package com.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindQuestionDataById {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter question id to fetch Questiondata");
	int qid=sc.nextInt();
	
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	QuestionData qdata=em.find(QuestionData.class, qid);
	if(qdata!=null)
	{
		System.out.println(qdata);
	}
	else
	{
		System.err.println("No Questiondata is found since invalid id...!");
	}
	sc.close();
}
}
