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
public class Diller {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String firmName;
	
	@ManyToOne
	private Country country;
	
	@ManyToMany
	@JoinTable(name="diller_goods",joinColumns = @JoinColumn(name="id_diller"),inverseJoinColumns=@JoinColumn(name="id_goods"))
	private List<Goods> goods = new ArrayList<Goods>();

	public Diller() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	@Override
	public String toString() {
		return "Diller [id=" + id + ", name=" + name + ", firmName=" + firmName + ", country=" + country + "]";
	}
	
	
	
	
}
