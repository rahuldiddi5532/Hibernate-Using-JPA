package com.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindAnswerByquestionAttribute {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Question to fetch the Answer data");
		String que=sc.nextLine();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select a from AnswerData a where a.question.question=?1");
		q.setParameter(1, que);
		List<AnswerData> la=q.getResultList();
		if(la.size()>0)
		{
			for (AnswerData ad : la) {
				System.out.println(ad);
			}
		}
		else
		{
			System.err.println("No Answer data found since invalid question...!");
		}
		sc.close();
	}
}
