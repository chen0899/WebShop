package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int id_user;
	private int id_goods;
	
	@OneToMany(mappedBy="orders")
	private List<User> user;
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", id_user=" + id_user + ", id_goods=" + id_goods + ", user=" + user + ", goods="
				+ goods + "]";
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_goods() {
		return id_goods;
	}

	public void setId_goods(int id_goods) {
		this.id_goods = id_goods;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	@OneToMany(mappedBy="orders")
	private List<Goods> goods;

	public Orders() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
