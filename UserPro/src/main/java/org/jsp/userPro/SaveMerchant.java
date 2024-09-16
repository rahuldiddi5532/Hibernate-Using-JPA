package org.jsp.userPro;

import javax.persistence.*;
import javax.persistence.Persistence;

public class SaveMerchant 
{
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager man=fac.createEntityManager();
//		System.out.println(fac);
//	    EntityTransaction tran=man.getTransaction();
//		tran.begin();
//		Merchant m=new Merchant();
//		m.setName("Rahul");
//		m.setEmail("rahul@gmail.com");
//		m.setPhone(1234567890l);
//		m.setGst_number("ABC123");
//		m.setPassword("rahul123");
//		man.persist(m);
//		tran.commit();
		
	}

}
