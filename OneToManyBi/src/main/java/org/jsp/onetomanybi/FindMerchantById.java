package org.jsp.onetomanybi;

import javax.persistence.*;

public class FindMerchantById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Merchent m=em.find(Merchent.class, 1);
		if(m!=null)
		{
			System.out.println(m);
		}
		else
		{
			System.err.println("No merchant record found since invalid Merchant id...!");
		}
	}
}
