package com.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindAnsewrdataByQPostedByAttribute {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Question posted by name to fetch the Answer data");
	String pbname=sc.next();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select a from AnswerData a where a.question.postedBy=?1");
	q.setParameter(1, pbname);
	List<AnswerData> la=q.getResultList();
	if(la.size()>0)
	{
		for (AnswerData ad : la) {
			System.out.println(ad);
		}
	}
	else
	{
		System.err.println("No Answer data found sisnce invalid name...!");
	}
	sc.close();
}
}
