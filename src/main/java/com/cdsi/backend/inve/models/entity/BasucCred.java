package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BASUC_CRED_COBRAN")
public class BasucCred implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BasucCredPK basucCredPk;
	@Column(name = "CENTRO")
	private String centro;
	@Column(name = "TRANS_CXC")
	private String trans_cxc;
	
	public BasucCred() {
		
	}
	

	public BasucCred(BasucCredPK basucCredPk, String centro, String trans_cxc) {
		super();
		this.basucCredPk = basucCredPk;
		this.centro = centro;
		this.trans_cxc = trans_cxc;
	}


	public BasucCredPK getBasucCredPk() {
		return basucCredPk;
	}


	public void setBasucCredPk(BasucCredPK basucCredPk) {
		this.basucCredPk = basucCredPk;
	}


	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getTrans_cxc() {
		return trans_cxc;
	}
	public void setTrans_cxc(String trans_cxc) {
		this.trans_cxc = trans_cxc;
	}


	@Override
	public String toString() {
		return "BasucCred [basucCredPk=" + basucCredPk + "]";
	}

}
