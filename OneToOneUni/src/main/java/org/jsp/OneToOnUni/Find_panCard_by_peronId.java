package org.jsp.OneToOnUni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_panCard_by_peronId 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater Person id");
		int pid=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p.card from Person p where p.id=?1");
		q.setParameter(1, pid);
		PanCard pc=(PanCard) q.getSingleResult();
         if(pc!=null)		
		{
			System.out.println("Pancard details "+pc);
		}
         else
		{
			System.err.println("No Pancard deatils found since incalid Pancard");
		}
		sc.close();
	}

}
