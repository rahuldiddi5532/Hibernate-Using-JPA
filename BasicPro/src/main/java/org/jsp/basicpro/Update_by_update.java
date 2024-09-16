package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Update_by_update 
{
	public static void main(String[] args) {
		
	Configuration conf= new Configuration();
	conf.configure();
	SessionFactory sef=conf.buildSessionFactory();
	Session ses=sef.openSession();
	Transaction tran=ses.getTransaction();
	tran.begin();
	Employee e1=new Employee();
	e1.setId(3);
	e1.setName("Ranga");
	e1.setEmail("rangappa@gmail.com");
	e1.setPassword("ranga@123");
	ses.update(e1);
	tran.commit();
	System.out.println(e1);
	}


}
