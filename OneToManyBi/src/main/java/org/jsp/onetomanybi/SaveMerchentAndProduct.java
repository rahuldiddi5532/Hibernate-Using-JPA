package org.jsp.onetomanybi;

import javax.persistence.*;

public class SaveMerchentAndProduct {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tran=em.getTransaction();
        tran.begin();
        
        Merchent m1=new Merchent();
        m1.setName("Rahul");
        m1.setGstno("ABC123");
        m1.setPhone(12345678900L);
        m1.setEmail("rahul@gmail.com");
        m1.setPassword("rahul123");
        
        Product p1=new Product();
        p1.setName("Laptop");
        p1.setBrand("HP");
        p1.setCatogary("Ele");
        p1.setMerchent(m1);
        
        Product p2=new Product();
        p2.setName("Mobile");
        p2.setBrand("Mi");
        p2.setCatogary("Ele");
        p2.setMerchent(m1);
        
        Product p3=new Product();
        p3.setName("TV");
        p3.setBrand("LG");
        p3.setCatogary("Ele");
        p3.setMerchent(m1);
        
       em.persist(m1);
       tran.commit();
       
       
        
	}

}
