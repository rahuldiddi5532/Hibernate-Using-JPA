package com.jsp.manytooneuni;

import javax.persistence.*;

public class SaveQuestionAndAnswer {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		QuestionData q=new QuestionData();
		q.setPostedBy("God");
		q.setQuestion("What is valuable thing in your life");
		
		AnswerData a1=new AnswerData();
		a1.setAnsBy("Rahul");
		a1.setAns("Family");
		a1.setQuestion(q);
		
		AnswerData a2=new AnswerData();
		a2.setAnsBy("Vinay");
		a2.setAns("Time");
		a2.setQuestion(q);
		
		
		AnswerData a3=new AnswerData();
		a3.setAnsBy("Rangappa");
		a3.setAns("Knowladge");
		a3.setQuestion(q);
		
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		
		tran.commit();
	}
}
