package org.jsp.onetomanybi;

import java.util.List;

import javax.persistence.*;

@Entity
public class Merchent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String gstno;
	
	private long phone;
	
	private String email;
	
	private String password;
	
	@OneToMany(mappedBy = "merchent",cascade = CascadeType.ALL)
	private List<Product> product;

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

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Merchent [id=" + id + ", name=" + name + ", gstno=" + gstno + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
	
}
