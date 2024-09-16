package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Fetch_data 
{
	public static void main(String[] args) 
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
		Session ses=sef.openSession();
		Employee emp=ses.get(Employee.class,1);
		System.out.println(emp);
	}

}
