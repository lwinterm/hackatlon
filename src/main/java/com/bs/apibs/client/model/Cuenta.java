package com.bs.apibs.client.model;

import com.bs.ClaseBase;

public class Cuenta extends ClaseBase {

	private static final long serialVersionUID = -1773804369146173203L;
	private String propietario;
	private String disponibilidad;
	private String descripcion;
	private String usuario;
	private String iban;
	private String balance;
	private String producto;
	private String numeroProducto;
	private String numeroProductoCodificado;
	private String Currency;

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}


	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getNumeroProducto() {
		return numeroProducto;
	}

	public void setNumeroProducto(String numeroProducto) {
		this.numeroProducto = numeroProducto;
	}

	public String getNumeroProductoCodificado() {
		return numeroProductoCodificado;
	}

	public void setNumeroProductoCodificado(String numeroProductoCodificado) {
		this.numeroProductoCodificado = numeroProductoCodificado;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}
}
