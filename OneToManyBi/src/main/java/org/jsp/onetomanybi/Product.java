package org.jsp.onetomanybi;

import javax.persistence.*;

@Entity
public class Product {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String brand;
	
	private String catogary;
	
	@JoinColumn
	@ManyToOne
	private Merchent merchent;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCatogary() {
		return catogary;
	}

	public void setCatogary(String catogary) {
		this.catogary = catogary;
	}

	public Merchent getMerchent() {
		return merchent;
	}

	public void setMerchent(Merchent merchent) {
		this.merchent = merchent;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", catogary=" + catogary + "]";
	}
	
	
}
