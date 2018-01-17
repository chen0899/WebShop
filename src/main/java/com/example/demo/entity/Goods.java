package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	private String size;

	private String aboutGoods;

	private String photo;

	@JsonIgnore
	@ManyToOne
	private Country country;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name="diller_goods",joinColumns = @JoinColumn(name="id_goods"),inverseJoinColumns=@JoinColumn(name="id_diller"))
	private List<Diller> diller = new ArrayList<Diller>();

	@JsonIgnore
	@ManyToOne
	private Category category;

	@JsonIgnore
	@ManyToOne
	private SubCategory subCategory;

	@JsonIgnore
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

	public Goods(String name, int price, String photo, Country country, List<Diller> diller, Category category, Orders orders, String size, String aboutGoods, SubCategory subCategory) {
		this.name = name;

		this.price = price;
		this.photo = photo;
		this.country = country;
		this.diller = diller;
		this.category = category;
		this.orders = orders;
		this.size = size;
		this.aboutGoods = aboutGoods;
		this.subCategory = subCategory;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAboutGoods() {
		return aboutGoods;
	}

	public void setAboutGoods(String aboutGoods) {
		this.aboutGoods = aboutGoods;
	}


	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", country=" + country + ", diller=" + diller
				+ ", category=" + category + "]";
	}
	

	
	
	
}
