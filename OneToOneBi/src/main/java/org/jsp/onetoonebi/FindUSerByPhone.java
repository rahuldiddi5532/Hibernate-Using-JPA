package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.*;

public class FindUSerByPhone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user phone number to fetch the record");
		long phone = sc.nextLong();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		String qry = "select u from User u where u.phone=?1";
		Query q = em.createQuery(qry);
		q.setParameter(1, phone);
		try {
			User u = (User) q.getSingleResult();
			System.out.println(u);
		} catch(NoResultException e) {
			System.err.println("No User record found since invalid phone number...!");
		}

		sc.close();
	}

}
