package org.jsp.OneToOnUni;
import java.util.Scanner;
import javax.persistence.*;

public class Find_Person_by_Phone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Person Phone number");
		long phone = sc.nextLong();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Person p where p.phone=?1");
		q.setParameter(1, phone);
		try {
			Person p = (Person) q.getSingleResult();
			System.out.println(p);
		} catch (NoResultException e) {
			System.err.println("No Peron found since invalid phone number...!");
		}
		sc.close();
	}

}
