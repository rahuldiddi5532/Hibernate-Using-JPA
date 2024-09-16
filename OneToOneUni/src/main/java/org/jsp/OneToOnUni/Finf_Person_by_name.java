package org.jsp.OneToOnUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.*;

public class Finf_Person_by_name 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to Find Person deatails");
		String name=sc.next();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p from Person p where p.name=?1");
		q.setParameter(1, name);
		List<Person> ln=q.getResultList();
		if(ln.size()>0)
		{
			for (Person person: ln) {
				System.out.println(person);
//				System.out.println(person.getCard());
			}
		}
		else
		{
			System.out.println("No Person found with name "+name);
		}
		sc.close();
	}

}
