package com.bs.apibs.client.model;

import com.bs.ClaseBase;

public class DetalleCuenta extends ClaseBase {

	private static final long serialVersionUID = -1773804369146173203L;
	private String numOrden;
	private String fechaOperacion;
	private String fechaValor;
	private String importe;
	private String divisa;
	private String saldo;
	private String concepto;
	private String codigoConcepto;
	public String getNumOrden() {
		return numOrden;
	}
	public void setNumOrden(String numOrden) {
		this.numOrden = numOrden;
	}
	public String getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(String fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public String getFechaValor() {
		return fechaValor;
	}
	public void setFechaValor(String fechaValor) {
		this.fechaValor = fechaValor;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getDivisa() {
		return divisa;
	}
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getCodigoConcepto() {
		return codigoConcepto;
	}
	public void setCodigoConcepto(String codigoConcepto) {
		this.codigoConcepto = codigoConcepto;
	}
	

}
