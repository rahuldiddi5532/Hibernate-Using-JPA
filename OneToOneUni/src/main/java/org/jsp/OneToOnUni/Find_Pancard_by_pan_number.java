package org.jsp.OneToOnUni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Pancard_by_pan_number 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pancard number");
		String panNum=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select pc from PanCard pc where pc.number=?1");
		q.setParameter(1, panNum);
		try {
	        PanCard pc=(PanCard)q.getSingleResult();
	        System.out.println(pc);
		}
		catch(NoResultException e)
		{
			System.err.println("No pancard details found since invalid pancard number...!");
		}
		sc.close();
	}
	

}
