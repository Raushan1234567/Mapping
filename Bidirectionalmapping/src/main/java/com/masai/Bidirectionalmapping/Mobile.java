package com.masai.Bidirectionalmapping;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Mobileno;
	private double price;
	
	@ManyToOne	
	@JoinColumn(name="company_id")
	private Company company;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String mobileno, double price, Company company) {
		super();
		Mobileno = mobileno;
		this.price = price;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileno() {
		return Mobileno;
	}

	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
	
	
	
}
