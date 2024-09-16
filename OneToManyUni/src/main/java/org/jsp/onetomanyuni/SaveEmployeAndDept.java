package org.jsp.onetomanyuni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

public class SaveEmployeAndDept {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tran=em.getTransaction();
        tran.begin();
        
        Department d1=new Department();
        d1.setName("Development");
        d1.setLoc("Bengluru");
        
        Employee e1=new Employee();
        e1.setName("Rahul");
        e1.setDeg("Seniour-dev");
        e1.setSal(50000);
        
        Employee e2=new Employee();
        e2.setName("Rangappa");
        e2.setDeg("Team-lead");
        e2.setSal(55000);
        
        
        Employee e3=new Employee();
        e3.setName("Vinay");
        e3.setDeg("Jonier-dev");
        e3.setSal(40000);
        
        Employee e4=new Employee();
        e4.setName("Suraj");
        e4.setDeg("Hr");
        e4.setSal(30000);
        
        List<Employee> le=new ArrayList<Employee>();
        le.add(e1);
        le.add(e2);
        le.add(e3);
        le.add(e4);
        
        d1.setEmps(le);
        
        em.persist(d1);
        
        tran.commit();
        
	}
}
