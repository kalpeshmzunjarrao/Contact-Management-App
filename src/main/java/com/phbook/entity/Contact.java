package com.phbook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="phbook")
public class Contact {
	 @Id
	  @GeneratedValue(generator = "contact_seq99" , strategy = GenerationType.SEQUENCE )
	  @SequenceGenerator(name="contact_seq99",initialValue = 1,allocationSize = 1)
	private int id;
	private String fname;
	private String mname;
	private String lame;
	private String email;
	private String contact;
	private String  dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLame() {
		return lame;
	}
	public void setLame(String lame) {
		this.lame = lame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
