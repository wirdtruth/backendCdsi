package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ARTSOPP")
public class Artsopp implements Serializable {

	@EmbeddedId
	private ArtsoppPK artsoppPk;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "USUARIO")
	private String usuario;
	@Column(name = "IND_UNICO")
	private String indUnico;
	@Column(name = "CTA_DEBE_MN")
	private String ctaDebeMn;
	@Column(name = "CTA_HABER_MN")
	private String ctaHaberMn;
	@Column(name = "CTA_DEBE_ME")
	private String ctaDebeMe;
	@Column(name = "CTA_HABER_ME")
	private String ctaHaberMe;
	@Column(name = "TIPO_CABA_MN")
	private String tipoCabaMn;
	@Column(name = "NO_CABA_MN")
	private String noCabaMn;
	@Column(name = "TIPO_CABA_ME")
	private String tipoCabaMe;
	@Column(name = "NO_CABA_ME")
	private String noCabaMe;
	@Column(name = "COD_SUNAT")
	private String codSunat;
	
	public Artsopp() {
	}
	
	public Artsopp(ArtsoppPK artsoppPk) {
		this.artsoppPk = artsoppPk;
	}

	public ArtsoppPK getartsoppPk() {
		return artsoppPk;
	}

	public void setartsoppPk(ArtsoppPK artsoppPk) {
		this.artsoppPk = artsoppPk;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getIndUnico() {
		return indUnico;
	}

	public void setIndUnico(String indUnico) {
		this.indUnico = indUnico;
	}

	public String getCtaDebeMn() {
		return ctaDebeMn;
	}

	public void setCtaDebeMn(String ctaDebeMn) {
		this.ctaDebeMn = ctaDebeMn;
	}

	public String getCtaHaberMn() {
		return ctaHaberMn;
	}

	public void setCtaHaberMn(String ctaHaberMn) {
		this.ctaHaberMn = ctaHaberMn;
	}

	public String getCtaDebeMe() {
		return ctaDebeMe;
	}

	public void setCtaDebeMe(String ctaDebeMe) {
		this.ctaDebeMe = ctaDebeMe;
	}

	public String getCtaHaberMe() {
		return ctaHaberMe;
	}

	public void setCtaHaberMe(String ctaHaberMe) {
		this.ctaHaberMe = ctaHaberMe;
	}

	public String getTipoCabaMn() {
		return tipoCabaMn;
	}

	public void setTipoCabaMn(String tipoCabaMn) {
		this.tipoCabaMn = tipoCabaMn;
	}

	public String getNoCabaMn() {
		return noCabaMn;
	}

	public void setNoCabaMn(String noCabaMn) {
		this.noCabaMn = noCabaMn;
	}

	public String getTipoCabaMe() {
		return tipoCabaMe;
	}

	public void setTipoCabaMe(String tipoCabaMe) {
		this.tipoCabaMe = tipoCabaMe;
	}

	public String getNoCabaMe() {
		return noCabaMe;
	}

	public void setNoCabaMe(String noCabaMe) {
		this.noCabaMe = noCabaMe;
	}

	public String getCodSunat() {
		return codSunat;
	}

	public void setCodSunat(String codSunat) {
		this.codSunat = codSunat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artsoppPk == null) ? 0 : artsoppPk.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artsopp other = (Artsopp) obj;
		if (artsoppPk == null) {
			if (other.artsoppPk != null)
				return false;
		} else if (!artsoppPk.equals(other.artsoppPk))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artsopp [artsoppPk=" + artsoppPk + "]";
	}

}
