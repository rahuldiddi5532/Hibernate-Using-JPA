package org.jsp.onetoonebi;

import java.util.Scanner;

import javax.persistence.*;

public class FindUserByAadharNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Aadharcard number to Frtch the user record");
		long anumber = sc.nextLong();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
//		String qry="select a.user from AadharCard a where a.number=?1";
		String qry = "select u from User u where u.card.number=?1";
		Query q = em.createQuery(qry);
		q.setParameter(1, anumber);
		try {
			User u = (User) q.getSingleResult();
			System.out.println(u);
		} catch (NoResultException e) {
			System.err.println("No User record found since invalid Aadhar number...!");
		}
		sc.close();

	}
}
