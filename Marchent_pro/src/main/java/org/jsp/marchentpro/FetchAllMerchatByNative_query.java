package org.jsp.marchentpro;

import java.util.List;

import javax.persistence.*;

public class FetchAllMerchatByNative_query 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select * from marchent",Marchent.class);
		List<Marchent> lm=q.getResultList();
		if(lm.size()>0)
		{
			for (Marchent ele : lm) {
				System.out.println(ele);
			}
		}
		else
		{
			System.out.println("No Merchant found");
		}
	}

}
