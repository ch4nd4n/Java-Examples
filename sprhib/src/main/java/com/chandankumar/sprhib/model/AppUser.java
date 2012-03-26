package com.chandankumar.sprhib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="app_user")
public class AppUser {
	private Long id;
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String name;

	@Column public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
