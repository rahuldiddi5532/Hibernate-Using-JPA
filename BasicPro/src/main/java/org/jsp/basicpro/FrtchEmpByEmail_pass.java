package org.jsp.basicpro;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FrtchEmpByEmail_pass 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter employee email");
		String em=sc.next();
		
		System.out.println("Eneter employee password ");
		String pw=sc.next();
		
		Configuration conf= new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e where e.email=?1 and e.password=?2");
		q.setParameter(1, em);
		q.setParameter(2, pw);
		try
		{
			Employee e=q.getSingleResult();
			System.out.println(e);
			System.out.println("Employee verified");
		}
		catch(NoResultException e)
		{
			System.err.println("Invalid email and password...!");
		}
		
	}

}
