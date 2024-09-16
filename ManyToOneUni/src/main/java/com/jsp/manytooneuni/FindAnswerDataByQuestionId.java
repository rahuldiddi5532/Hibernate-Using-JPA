package com.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindAnswerDataByQuestionId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Question id to fetch Answer data");
		int qid=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select a from AnswerData a where a.question.id=?1");
		q.setParameter(1, qid);
		List<AnswerData> la=q.getResultList();
		if(la.size()>0)
		{
			for (AnswerData ad : la) {
				System.out.println(ad);
			}
		}
		else
		{
			System.err.println("No answer record is found since invalid question id...!");
		}
		sc.close();
	}
}
