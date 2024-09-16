package org.jsp.marchentpro;

import javax.persistence.*;

@NamedQueries(value= {
		@NamedQuery(name="verifyMerchatByEmail",query="select m from Marchent m where m.email=?1"),
		@NamedQuery(name="findNames", query="select m.name from Marchent m")
})


@Entity
@Table(name="marchent")
public class Marchent {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long phone;
	private String email;
	private String gst_number;
	private String password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGst_number() {
		return gst_number;
	}
	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Marchent [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", gst_number="
				+ gst_number + ", password=" + password + "]";
	}
	

}
