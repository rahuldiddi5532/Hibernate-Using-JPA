package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Fetch_by_load
{
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		try {
		Employee e=ses.load(Employee.class, 3);
		System.out.println(e.getId());
		System.out.println(e.getName());
		}
		catch(ObjectNotFoundException e)
		{
			System.err.println("Invalid id");
		}
		
				
	}
}
