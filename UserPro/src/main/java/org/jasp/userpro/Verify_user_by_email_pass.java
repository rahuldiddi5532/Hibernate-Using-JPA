package org.jasp.userpro;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Verify_user_by_email_pass 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Email");
		String email=sc.next();
		
		System.out.println("Enter Passowrd");
		String pass=sc.next();
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Query<User> q=ses.createQuery("select u from User u where u.email=?1 and u.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, pass);
	    try
	    {
	    	User u=q.getSingleResult();
	    	System.out.println("User verified");
	    	System.out.println(u);
	    }
	    catch(NoResultException e)
	    {
	    	System.err.println("Invalid Email or Password...! ");
	    }
	    
		sc.close();
		
	}

}
