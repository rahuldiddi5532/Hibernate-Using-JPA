package com.jsp.manytooneuni;

import java.util.Scanner;

import javax.persistence.*;

public class FindAnswerDataBYAnswerID {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Answer id to fetch answer data");
		int aid =sc.nextInt();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		AnswerData ad=em.find(AnswerData.class, aid);
		if(ad!=null) {
			System.out.println(ad);
		}
		else
		{
			System.out.println("No Answer data found since invalid answer id...!");
		}
	
		 sc.close();
	}
	
	
}
