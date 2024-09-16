package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Fetch_and_update 
{
	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e=ses.get(Employee.class, 5);
		if(e!=null)
		{
			e.setName("Rahul");
			e.setEmail("rahul@gmail.com");
			e.setPassword("rahul123");
			tran.commit();
		}
		else
		{
			System.err.println("Invalid ID");
		}
		
	}

}
