package com.jsp.compositkey;

import javax.persistence.*;

public class Fetch_student_details {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Master_id mid=new Master_id();
		mid.setSid(101);
		mid.setCid("c1");
		
		Master m=em.find(Master.class, mid);
		if(m!=null)
		{
		System.out.println(m);	
		}
		else
		{
			System.err.println("No student record found");
		}
		
	}
}
