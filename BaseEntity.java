package com.app.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity 
{
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "BaseEntity [Id=" + Id + "]";
	}

	
	
	
	
}
