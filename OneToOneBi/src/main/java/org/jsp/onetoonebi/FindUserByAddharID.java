package org.jsp.onetoonebi;

import javax.persistence.*;

public class FindUserByAddharID {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
//	String qry="select u from User u where u.card.id=?1";
//	Query q=em.createQuery(qry);
//	q.setParameter(1, 5);
//	try {
//		User u=(User)q.getSingleResult();
//		System.out.println(u);
//		
//	}
//	catch(NoResultException e)
//	{
//		System.err.println("No user found sinsce invalid Aadharcard id...!");
//	}
	
//	
//	AadharCard ac=em.find(AadharCard.class,1);
//	if(ac!=null)
//	{
//		System.out.println(ac.getUser());
//	}
//	else
//	{
//		System.err.println("No user found sinsce invalid Aadharcard id...!");
//	}
	
	String qry="select a.user from AadharCard a where a.id=?1";
	Query q=em.createQuery(qry);
	q.setParameter(1, 1);
	try {
		User u=(User)q.getSingleResult();
		System.out.println(u);
		
	}
	catch(NoResultException e)
	{
		System.err.println("No user found sinsce invalid Aadharcard id...!");
	}
}
}
