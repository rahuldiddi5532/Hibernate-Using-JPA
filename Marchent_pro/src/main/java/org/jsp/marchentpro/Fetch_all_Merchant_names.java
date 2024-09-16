package org.jsp.marchentpro;

import java.util.List;

import javax.persistence.*;

public class Fetch_all_Merchant_names 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m.name from Marchent m");
		List<String> ln=q.getResultList();
		if(ln.size()>0)
		{
			for(String name : ln) {
				System.out.println(name);
			}
		}
		else
		{
			System.err.println("Names not found...");
		}
	}

}
