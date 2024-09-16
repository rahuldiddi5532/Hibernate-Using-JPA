package org.swiggypro;

import java.time.LocalDateTime;
import java.util.Scanner;

import javax.persistence.*;
public class UpdateOredr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order id number to edit order");
		int oid=sc.nextInt();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		FoodOrder fo=em.find(FoodOrder.class, oid);
		if(fo!=null)
		{
			fo.setFoodItem("Dosa");
			fo.setCost(30);
			fo.setDelivaryTime(LocalDateTime.now().plusMinutes(20));
			em.merge(fo);
			tran.commit();
		}
		else
		{
			System.err.println("Order not updat since invalid order id number...!");
		}
		sc.close();
		
	}

}
