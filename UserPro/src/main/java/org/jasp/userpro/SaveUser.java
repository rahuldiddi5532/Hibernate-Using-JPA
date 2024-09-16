package org.jasp.userpro;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class SaveUser 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name");
		String name=sc.next();
		
		System.out.println("Enter Phone number");
		long phone=sc.nextLong();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Password");
		String pass=sc.next();

		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
        Session ses=sef.openSession();
		Transaction tran=ses.beginTransaction();
		User u=new User();
		u.setName(name);
		u.setPhone(phone);
		u.setEmail(email);
		u.setPassword(pass);
		ses.save(u);
		tran.commit();
		sc.close();
	}

}
