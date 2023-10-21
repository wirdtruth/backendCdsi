package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class IdArccmc implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="NO_CIA" , unique = true)
	@Size(min=1, max=2)
	private String cia;
	
	@Column(name ="NO_CLIENTE" , unique = true)
	@Size(min=1, max=12)
	private String id;
	
	/*
	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	*/
}
