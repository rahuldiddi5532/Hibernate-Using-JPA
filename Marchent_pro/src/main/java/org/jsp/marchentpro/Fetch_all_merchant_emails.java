package org.jsp.marchentpro;

import java.util.List;

import javax.persistence.*;


public class Fetch_all_merchant_emails 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m.email from Marchent m");
		List<String> le=q.getResultList();
		if(le.size()>0)
		{
			for (String email : le) {
				System.out.println(email);
			}
		}
		else
		{
			System.err.println("No email found...");
		}
		
	}

}
