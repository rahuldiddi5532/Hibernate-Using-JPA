package org.jsp.marchentpro;

import java.util.List;

import javax.persistence.*;

public class Fetch_all_names 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNamedQuery("findNames");
		List<String> ln=q.getResultList();
		if(ln.size()>0)
		{
		   for (String name : ln) {
			System.out.println(name);
		   }	
		}
		else
		{
			System.out.println("Name not found");
		}
	}

}
