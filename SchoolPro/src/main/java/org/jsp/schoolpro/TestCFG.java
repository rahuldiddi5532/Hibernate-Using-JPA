package org.jsp.schoolpro;

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
		Student s1=new Student();
		s1.setName("basu");
		s1.setEmail("basu@gmail.com");
		s1.setPhone(93793181552L);
		s1.setPassword("basu123");
		ses.save(s1);
		tran.commit();
	}

}
