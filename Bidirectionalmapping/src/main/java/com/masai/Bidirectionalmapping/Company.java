package com.masai.Bidirectionalmapping;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Companyname;
	private LocalDate EstbYear;
	
	@OneToMany(mappedBy = "company",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<Mobile> mobiles;

	public Company() {
		super();
		
	}

	public Company(String companyname, LocalDate estbYear, List<Mobile> mobiles) {
		super();
		Companyname = companyname;
		EstbYear = estbYear;
		this.mobiles = mobiles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public LocalDate getEstbYear() {
		return EstbYear;
	}

	public void setEstbYear(LocalDate estbYear) {
		EstbYear = estbYear;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", Companyname=" + Companyname + ", EstbYear=" + EstbYear + ", mobiles=" + mobiles
				+ "]";
	}

}
