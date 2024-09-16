package org.jsp.onetoonebi;


import javax.persistence.*;

public class FindUserbyId 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		User u=em.find(User.class,5);
		if(u!=null)
		{
		System.out.println(u);
		}
		else
		{
			System.err.println("No user found since invalid id...!");
		}
	}

}
