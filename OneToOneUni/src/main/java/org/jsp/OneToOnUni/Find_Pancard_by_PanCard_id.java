package org.jsp.OneToOnUni;

import java.util.Scanner;

import javax.persistence.*;

public class Find_Pancard_by_PanCard_id {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pan-Card id");
		int panId = sc.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
//	    PanCard pc=em.find(PanCard.class, panId);
		PanCard pc = em.find(PanCard.class, panId);
		if (pc != null) {
			System.out.println(pc);
		} else {
			System.err.println("No Pancard details found since invalid Pancard id...!");
		}
		sc.close();
	}

}
