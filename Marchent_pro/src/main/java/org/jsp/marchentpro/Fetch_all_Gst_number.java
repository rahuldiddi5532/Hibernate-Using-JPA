package org.jsp.marchentpro;

import java.util.List;

import javax.persistence.*;

public class Fetch_all_Gst_number 
{
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m.gst_number from Marchent m");
		List<String> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (String gst_number : ls) {
				System.out.println(gst_number);
			}
		}
		else
		{
			System.out.println("No gst_number found....");
		}
		
	}

}
