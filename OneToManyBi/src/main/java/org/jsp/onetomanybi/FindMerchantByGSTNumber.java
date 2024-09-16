package org.jsp.onetomanybi;

import java.util.Scanner;

import javax.persistence.*;

public class FindMerchantByGSTNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Merchant GST_numbr to fetch the detaild");
		String gstno=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m from Merchent m where m.gstno=?1");
		q.setParameter(1, gstno);
		try {
		Merchent m=(Merchent) q.getSingleResult();
		System.out.println(m);
		}
		catch(NoResultException e)
		{
			System.out.println("No ");
		}
		sc.close();
	}
}
