package org.jsp.onetoonebi;

import javax.persistence.*;

public class FindAadharByUserId {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	String qry="select u.card from User u where u.id=?1";
	Query q=em.createQuery(qry);
	q.setParameter(1, 1);
	try {
	AadharCard a=(AadharCard) q.getSingleResult();
	System.out.println(a);
	}
	catch(NoResultException e)
	{
		System.err.println("No AadharCard record found since to invalid user id...!");
	}
	
	
}
}
