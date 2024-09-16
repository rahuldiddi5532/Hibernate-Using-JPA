package org.jsp.manytomanyuni;

import java.util.List;

import javax.persistence.*;

public class FindStudentWhoPercentageIsGraterThan60 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s where s.prc>=60");
		List<Student> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (Student  std: ls) {
				System.out.println(std);
				
			}
		}
		else
		{
			System.err.println("No Student record found...!");
		}
	}
}
