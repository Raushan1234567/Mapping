package com.masai.da15q2_p2;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Biryani {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double rating;
	public Biryani() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Biryani(double rating) {
		super();
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Biryani [id=" + id + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, rating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biryani other = (Biryani) obj;
		return id == other.id && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}
	
	
	
}
