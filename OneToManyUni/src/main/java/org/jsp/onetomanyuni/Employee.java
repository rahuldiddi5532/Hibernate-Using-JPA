package org.jsp.onetomanyuni;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String deg;
	private double sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deg=" + deg + ", sal=" + sal + "]";
	}
	
}
