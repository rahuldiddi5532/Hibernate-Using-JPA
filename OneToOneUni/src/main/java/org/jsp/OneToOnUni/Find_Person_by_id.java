package org.jsp.OneToOnUni;

import javax.persistence.*;

public class Find_Person_by_id 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
	    Person p=em.find(Person.class, 1);
	    if(p!=null)
	    {
	    	System.out.println(p);
//	    	System.out.println(p.getCard());
	    }
	    else
	    {
	    	System.err.print("No person found due to invalid id");
	    }
	}

}
