package org.jsp.onetoonebi;

import javax.persistence.*;

public class FindAadharByAadharId {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		AadharCard ac=em.find(AadharCard.class, 5);
		if(ac!=null)
		{
			System.out.println(ac);
		}
		else
		{
			System.err.println("No record found since invalid Aadhar id...!");
		}
	}

}
