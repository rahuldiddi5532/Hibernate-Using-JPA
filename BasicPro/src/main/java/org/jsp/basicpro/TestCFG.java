package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestCFG 
{
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e1=new Employee();
		e1.setName("Vinyak");
		e1.setEmail("vinay@gmail.com");
		e1.setPhone(7026844560L);
		e1.setPassword("vinay123");
		e1.setSal(22000);
		ses.save(e1);
		tran.commit();
		
	}

}
