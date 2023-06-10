package com.masai.day15q_2;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@NamedQuery(name="findByid",query = "select e from VegBiryani e where vegbiryaniid= :id2")
public class VegBiryani extends Biryani{
	

	@Column(unique = false)
	private int vegbiryaniid; 
	
	private double price;
	private String Description;
	public VegBiryani() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VegBiryani(double rating, int vegbiryaniid, double price, String description) {
		super(rating);
		this.vegbiryaniid = vegbiryaniid;
		this.price = price;
		Description = description;
	}
	public int getVegbiryaniid() {
		return vegbiryaniid;
	}
	public void setVegbiryaniid(int vegbiryaniid) {
		this.vegbiryaniid = vegbiryaniid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "VegBiryani [vegbiryaniid=" + vegbiryaniid + ", price=" + price + ", Description=" + Description + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Description, price, vegbiryaniid);
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
		VegBiryani other = (VegBiryani) obj;
		return Objects.equals(Description, other.Description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& vegbiryaniid == other.vegbiryaniid;
	}
	
	
	
	

}
