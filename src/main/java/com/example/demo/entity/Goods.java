package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Goods {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int  price;

	private String photo;
	
	@ManyToOne
	private Country country;

	@ManyToMany
	@JoinTable(name="diller_goods",joinColumns = @JoinColumn(name="id_goods"),inverseJoinColumns=@JoinColumn(name="id_diller"))
	private List<Diller> diller = new ArrayList<Diller>();
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private Orders orders;

	public Goods() {
		super();
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Goods(String name, int price, String photo, Country country, List<Diller> diller, Category category, Orders orders) {
		this.name = name;

		this.price = price;
		this.photo = photo;
		this.country = country;
		this.diller = diller;
		this.category = category;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Diller> getDiller() {
		return diller;
	}

	public void setDiller(List<Diller> diller) {
		this.diller = diller;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", country=" + country + ", diller=" + diller
				+ ", category=" + category + "]";
	}
	

	
	
	
}
