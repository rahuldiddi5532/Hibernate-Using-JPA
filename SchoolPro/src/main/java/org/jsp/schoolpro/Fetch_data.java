package org.jsp.schoolpro;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Fetch_data 
{
	public static void main(String[] args) {
      Configuration conf=new Configuration();
      conf.configure();
      SessionFactory sef=conf.buildSessionFactory();
      System.out.println(sef);
      Session ses=sef.openSession();
      Student s=ses.get(Student.class, 1);
      System.out.println(s);
      
	}

}
