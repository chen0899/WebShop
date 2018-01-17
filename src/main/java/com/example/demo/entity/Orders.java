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

	private int id_goods;

	private int count;

	private String size;

	private String number;
	
	@OneToMany(mappedBy="orders")
	private List<User> user;


	public Orders() {
	}

	public Orders(int id_goods, int count, String size, String number) {
		this.id_goods = id_goods;
		this.count = count;
		this.size = size;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_goods() {
		return id_goods;
	}

	public void setId_goods(int id_goods) {
		this.id_goods = id_goods;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Orders{" +
				"id=" + id +
				", id_goods=" + id_goods +
				", count=" + count +
				", size='" + size + '\'' +
				", number='" + number + '\'' +
				", user=" + user +
				'}';
	}
}
