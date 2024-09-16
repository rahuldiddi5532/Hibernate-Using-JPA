package org.jsp.marchentpro;


import javax.persistence.*;
import javax.persistence.Persistence;

public class Fetch_update_Marchent 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		Marchent m=em.find(Marchent.class,1);
		if(m!=null)
		{
			m.setName("RahulD");
			m.setEmail("rahuldiddi5532@gmail.com");
			tran.commit();
		}
		else
		{
			System.err.println("Marchent Not found since invalid id...!");
		}
		
	}

}
