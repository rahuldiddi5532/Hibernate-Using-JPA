package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Save_or_update 
{
	public static void main(String[] args) {
		
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e=new Employee();
		e.setId(5);
		e.setName("Rangappa");
		e.setEmail("ranga@gmail.com");
		e.setPassword("ranga123");
		e.setPhone(1234567895L);
		e.setSal(25000);
		ses.saveOrUpdate(e);
		tran.commit();

	}

}
