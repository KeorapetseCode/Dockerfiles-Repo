package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
