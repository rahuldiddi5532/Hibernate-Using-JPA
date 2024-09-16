package org.jsp.manytomanybi;

import java.util.List;

import javax.persistence.*;

public class FindStudentWhosePercentageIsGraterThan35 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q= em.createQuery("select s from Student s where s.perc>35");
		List<Student> ls=q.getResultList();
		if(ls.size()>0)
		{
			for (Student s : ls) {
				System.out.println(s);
			}
		}
		else
		{
			System.err.println("No student Recoder Found...!");
		}
	}
}
