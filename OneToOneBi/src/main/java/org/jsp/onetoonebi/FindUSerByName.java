package org.jsp.onetoonebi;

import java.util.*;

import javax.persistence.*;

public class FindUSerByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the USer name to fetch the record");
		String name=sc.next();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		String qry="select u from User u where u.name=?1";
		Query q=em.createQuery(qry);
		q.setParameter(1, name);
		List<User> lu=q.getResultList();
		if(lu.size()>0)
		{
			for (User u : lu) {
				System.out.println(u);
			}
		}
		else
		{
			System.err.println("No record found since invalid name...!");
		}
		sc.close();
		
	}
}
