package org.swiggypro;

import java.time.LocalDateTime;

import javax.persistence.*;

public class OrderFood {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		FoodOrder fo=new FoodOrder();
		fo.setFoodItem("Biriyani");
		fo.setCost(150);
		LocalDateTime now=LocalDateTime.now();//it will store the current time and date
		LocalDateTime delivaryTime=now.plusMinutes(20);
		fo.setDelivaryTime(delivaryTime);
		em.persist(fo);
		tran.commit();
	}

}
