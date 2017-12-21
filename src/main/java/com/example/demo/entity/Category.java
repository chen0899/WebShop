package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToMany(mappedBy="category")
	private List<Goods> goods = new ArrayList<Goods>();
	
	@OneToMany(mappedBy="category")
	private List<SubCategory> subCategories = new ArrayList<>();

	private  String nameCategory;
	
	public Category () {}


	public Category(List<Goods> goods, List<SubCategory> subCategories, String nameCategory) {
		this.goods = goods;
		this.subCategories = subCategories;
		this.nameCategory = nameCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", nameCategory=" + nameCategory + "]";
	}
	
	

	
}
