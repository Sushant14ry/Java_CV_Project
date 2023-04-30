package com.hiber.Project_WEB_Maven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Student_Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Adress_Id")
	private int address_id;
	
	@Column(length = 50,name = "Street")
	private String street;
	
	@Column(length = 100,name = "City")
	private String city;
	
	@Column(name = "Is_Open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name = "Add_Date")
	@Temporal(TemporalType.DATE)
	private Date add_date;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int address_id, String street, String city, boolean isOpen, double x, Date add_date, byte[] image) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.add_date = add_date;
		this.image = image;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAdd_date() {
		return add_date;
	}

	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
