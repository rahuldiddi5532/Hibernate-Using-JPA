package org.jasp.userpro;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Find_User_by_id 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User id");
		int id=sc.nextInt();
	  Configuration conf=new Configuration();
	  conf.configure();
	  SessionFactory sef=conf.buildSessionFactory();
	  Session ses=sef.openSession();
	  User u=ses.load(User.class, id);
	  try
	  {
		  System.out.println("User Name "+u.getName());
		  System.out.println("User Email "+u.getEmail());
		  System.out.println("User Phone-number "+u.getPhone());
	  }
	  catch(ObjectNotFoundException e)
	  {
		  System.err.println("Invalid User Id...!");
	  }
	  
	  sc.close();
	  
	}

}
