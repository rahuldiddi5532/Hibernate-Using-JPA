package org.jsp.basicpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Delete 
{
	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		Employee e=ses.load(Employee.class, 5);
		if(e!=null)
		{
			ses.delete(e);
			tran.commit();
		}
		else
		{
			System.err.println("Invalid Id");
		}

	}

}
