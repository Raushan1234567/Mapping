package com.masai.day15q_2;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class ChickenBiryani extends Biryani{

	
	@Column(unique = false)
	private int Chickenbiryaniid; 
	
	private double price;
	private String Description;
	public ChickenBiryani() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChickenBiryani(double rating, int chickenbiryaniid, double price, String description) {
		super(rating);
		Chickenbiryaniid = chickenbiryaniid;
		this.price = price;
		Description = description;
	}
	@Override
	public String toString() {
		return "ChickenBiryani [Chickenbiryaniid=" + Chickenbiryaniid + ", price=" + price + ", Description="
				+ Description + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Chickenbiryaniid, Description, price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChickenBiryani other = (ChickenBiryani) obj;
		return Chickenbiryaniid == other.Chickenbiryaniid && Objects.equals(Description, other.Description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	

	
}
