package org.jasp.userpro;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User 
{
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
    
    @Column(name="uname", nullable=false)
    private String name;
    
    @Column(name="phone", nullable=false, unique=true)
    private long phone;
    
    @Column(name="email", nullable=false , unique=true)
    private String email;
    
    @Column(name="password", nullable=false)
    private String password;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ "]";
	}
    
    
    
    

}
