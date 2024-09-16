package org.jsp.chche_machanisum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindUser {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();

		em1.find(User.class, 1);
		em1.find(User.class, 1);

		EntityManager em2 = emf.createEntityManager();

		em2.find(User.class, 1);
		em2.find(User.class, 1);

	}
}
