package org.jsp.userPro;

import javax.persistence.*;

@Entity
@Table(name="merchant")
public class Merchant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long phone;
	private String gst_number;
	private String email;
	private String password;
	
	
	public void setPassword(String password) {
		this.password = password;
	}
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGst_number() {
		return gst_number;
	}
	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
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
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", phone=" + phone + ", gst_number=" + gst_number + ", email="
				+ email + ", password=" + password + "]";
	}

}
