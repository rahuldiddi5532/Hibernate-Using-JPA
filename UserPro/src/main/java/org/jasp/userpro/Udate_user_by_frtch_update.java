package org.jasp.userpro;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Udate_user_by_frtch_update 
{
	public static void main(String[] args) {
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef= conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran =ses.beginTransaction();
		User u=ses.get(User.class,2);
		if(u!=null)
		{
			u.setName("vinyak");
			u.setEmail("vinyak@gmail.com");
			u.setPassword("vinyak123");
			ses.update(u);
//			System.out.println(u);
			System.out.println("User information update Successfully");
			tran.commit();
		}
		else
		{
			System.err.println("Invalid user id...!");
		}
		
	}

}
