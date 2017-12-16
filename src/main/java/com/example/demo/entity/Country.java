package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nameCountry;
	
	@OneToMany(mappedBy="country")
	private List<Goods> goods = new ArrayList<Goods>();	
	
	@OneToMany(mappedBy="country")
	private List<Diller> diller = new ArrayList<Diller>();	
	
	public List<Goods> getGoods() {
		return goods;
	}


	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}


	public List<Diller> getDiller() {
		return diller;
	}


	public void setDiller(List<Diller> diller) {
		this.diller = diller;
	}


	public Country() {}
	
	


	public Country(String nameCountry) {
		super();
		this.nameCountry = nameCountry;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameCountry() {
		return nameCountry;
	}


	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}


	@Override
	public String toString() {
		return "Country [id=" + id + ", nameCountry=" + nameCountry + "]";
	}
	
	
	

}
