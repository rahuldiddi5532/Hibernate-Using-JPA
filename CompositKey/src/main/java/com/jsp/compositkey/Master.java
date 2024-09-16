package com.jsp.compositkey;

import javax.persistence.*;

@Entity
public class Master {

	@EmbeddedId
	private Master_id mansterid;
	
	private String sname;
	
	private String cname;

	public Master_id getMansterid() {
		return mansterid;
	}

	public void setMansterid(Master_id mansterid) {
		this.mansterid = mansterid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Master [mansterid=" + mansterid + ", sname=" + sname + ", cname=" + cname + "]";
	}
	
	
	
}
