package org.jasp.userpro;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class User_update 
{
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.beginTransaction();
		User u=ses.get(User.class, 5);
		if(u!=null) 
		{
		u.setId(5);
		u.setName("basavaraj");
		u.setEmail("basvaraj@gmail.com");
		u.setPhone(9338460560L);
		u.setPassword("basavaraj123");	
		ses.update(u);
		tran.commit();
		System.out.println("User updated Succcessfully");
		}
		else
		{
			System.err.println("Invalid User id");
		}
	}

}
