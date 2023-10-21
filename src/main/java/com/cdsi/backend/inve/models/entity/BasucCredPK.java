package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BasucCredPK implements Serializable {
	
	@Column(name = "NO_CIA")
	private String noCia;
	@Column(name="COD_SUC")
	private String codSuc;
	
	public BasucCredPK() {
	}
	
	public BasucCredPK(String noCia, String codSuc) {
		this.noCia = noCia;
		this.codSuc = codSuc;
	}

	public String getNoCia() {
		return noCia;
	}

	public void setNoCia(String noCia) {
		this.noCia = noCia;
	}

	public String getCodSuc() {
		return codSuc;
	}

	public void setCodSuc(String codSuc) {
		this.codSuc = codSuc;
	}

	@Override
	public String toString() {
		return "BasucCredPK [noCia=" + noCia + ", codSuc=" + codSuc + "]";
	}
	
	

}
