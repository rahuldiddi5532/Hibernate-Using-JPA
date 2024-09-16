package org.jsp.onetomanybi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class FindMerchantByName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Merchant name to fetch the details");
		String mname=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select m from Merchent m where m.name=?1");
		q.setParameter(1, mname);
		List<Merchent> lm=q.getResultList();
		if(lm.size()>0)
		{
			for (Merchent mer : lm) {
				System.out.println(mer);
			}
		}
		else
		{
			System.err.println("No Merchant found since invalid Merchent name..!");
		}
		sc.close();
	}
}
