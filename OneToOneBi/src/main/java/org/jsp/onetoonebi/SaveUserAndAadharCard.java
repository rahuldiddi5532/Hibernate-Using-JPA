package org.jsp.onetoonebi;

import javax.persistence.*;

public class SaveUserAndAadharCard {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
//	System.out.println(emf);
	EntityTransaction tran=em.getTransaction();
	tran.begin();
	
	User u=new User();
	u.setName("Ram");
	u.setPhone(456289923L);
	
	AadharCard card=new AadharCard();
	card.setNumber(456789822350L);
	card.setAddress("Badami");
	card.setUser(u);
	
	u.setCard(card);
	
	em.persist(u);
	tran.commit();
}
}
