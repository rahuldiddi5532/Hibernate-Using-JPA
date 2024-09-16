package org.jasp.userpro;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Save_or_Update_user 
{
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		User u= new User();
		u.setId(6);
		u.setName("basu");
		u.setEmail("basu@gmail.com");
		ses.saveOrUpdate(u);
		tran.commit();
		
	}

}
