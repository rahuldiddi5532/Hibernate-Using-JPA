package org.jsp.marchentpro;

import javax.persistence.*;

public class Marge 
{
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager man=emf.createEntityManager();
		EntityTransaction tran=man.getTransaction();
		tran.begin();
		Marchent m1=new Marchent();
		m1.setId(15);
		m1.setName("ramgoopal");
		m1.setEmail("ramgoopal@gmail.com");
		m1.setPhone(14524792363L);
		m1.setGst_number("ABC456");
		m1.setPassword("ramgoopal123");
		man.merge(m1);
		tran.commit();
	}

}
