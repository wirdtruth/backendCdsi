package com.cdsi.backend.inve.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARINDA1_VIEW")
public class StockLibroDTO {
	
	@Column(name = "NO_CIA")
	private String cia;
	@Id
	private String no_arti;
	@Column
	private String descripcion;
	@Column
	private String medida;
	@Column
	private String marca;
	@Column
	private Double precio;
	@Column
	private Integer stock;
	@Column
	private Integer compromiso;
	@Column
	private String Vigente;
	/*
	@Column
	private LocalDateTime fecha;
	*/
	@Column(name = "DES_CATALO")
	private String tipo_arti;
	@Column(name = "DES_CLASE")
	private String clase;
	@Column(name = "DES_CATE")
	private String categoria;
	@Column(name = "DES_FAM")
	private String familia;
	@Column(name = "tipo_arti")
	private String catalogo;
	@Column(name = "clase")
	private String linea;
	@Column(name = "categoria")
	private String subLinea;
	@Column(name = "familia")
	private String fam;
	@Column
	private String almacen;
	@Column
	private String tipo;
		
	public StockLibroDTO() {
	}
	
	public StockLibroDTO(String cia, String no_arti, String descripcion, String medida, String marca, Double precio,
			Integer stock, Integer compromiso, String vigente, String tipo_arti, String clase, String categoria,
			String familia, String catalogo, String linea, String subLinea, String fam, String almacen, String tipo) {
		this.cia = cia;
		this.no_arti = no_arti;
		this.descripcion = descripcion;
		this.medida = medida;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.compromiso = compromiso;
		Vigente = vigente;
		this.tipo_arti = tipo_arti;
		this.clase = clase;
		this.categoria = categoria;
		this.familia = familia;
		this.catalogo = catalogo;
		this.linea = linea;
		this.subLinea = subLinea;
		this.fam = fam;
		this.almacen = almacen;
		this.tipo = tipo;
	}
	public String getCia() {
		return cia;
	}
	public void setCia(String cia) {
		this.cia = cia;
	}
	public String getNo_arti() {
		return no_arti;
	}
	public void setNo_arti(String no_arti) {
		this.no_arti = no_arti;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getCompromiso() {
		return compromiso;
	}
	public void setCompromiso(Integer compromiso) {
		this.compromiso = compromiso;
	}
	public String getVigente() {
		return Vigente;
	}
	public void setVigente(String vigente) {
		Vigente = vigente;
	}
	public String getTipo_arti() {
		return tipo_arti;
	}
	public void setTipo_arti(String tipo_arti) {
		this.tipo_arti = tipo_arti;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getCatalogo() {
		return catalogo;
	}
	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public String getSubLinea() {
		return subLinea;
	}
	public void setSubLinea(String subLinea) {
		this.subLinea = subLinea;
	}
	public String getFam() {
		return fam;
	}
	public void setFam(String fam) {
		this.fam = fam;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
