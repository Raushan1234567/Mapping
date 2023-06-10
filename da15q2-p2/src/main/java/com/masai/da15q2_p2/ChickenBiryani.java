package com.masai.da15q2_p2;



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
	
	
	
	public int getChickenbiryaniid() {
		return Chickenbiryaniid;
	}
	public void setChickenbiryaniid(int chickenbiryaniid) {
		Chickenbiryaniid = chickenbiryaniid;
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
		return "ChickenBiryani [Chickenbiryaniid=" + Chickenbiryaniid + ", price=" + price + ", Description="
				+ Description + "]";
	}
	
	
	
	
	

	
}
