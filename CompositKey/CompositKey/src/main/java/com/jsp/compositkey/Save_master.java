package com.jsp.compositkey;

import javax.persistence.*;

public class Save_master {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		Master_id mid=new Master_id();
		mid.setSid(102);
		mid.setCid("c2");
		
		Master m=new Master();
		m.setSname("Vinay");
		m.setCname("J2ee");
		m.setMansterid(mid);
		
		em.persist(m);
		tran.commit();
		
		
	}
}
