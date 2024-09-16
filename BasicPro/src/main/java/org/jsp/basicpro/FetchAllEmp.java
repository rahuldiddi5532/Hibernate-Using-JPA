package org.jsp.basicpro;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class FetchAllEmp 
{
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e");
		List<Employee> l1=q.getResultList();
//		System.out.println(l1);
		if(l1.size()>0)
		{
			for(Employee ele:l1)
			{
					System.out.println(ele);
			}
		}
		else
		{
			System.err.println("No employee information is found");
		}
		
	}

}
