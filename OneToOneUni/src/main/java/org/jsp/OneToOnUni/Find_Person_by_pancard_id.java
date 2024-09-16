package org.jsp.OneToOnUni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Person_by_pancard_id {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Pancard id");
	int pcId= sc.nextInt();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select p from Person p where p.card.id=?1");
	q.setParameter(1, pcId);
	try {
		Person p=(Person) q.getSingleResult();
		System.out.println(p);
	}
	catch(NoResultException e)
	{
		System.err.println("No Person found since invalid Pancard id...!");
	}
}
}
