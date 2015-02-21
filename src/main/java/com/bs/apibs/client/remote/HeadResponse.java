package com.bs.apibs.client.remote;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HeadResponse {
	/* 
	 * Para serializar Spring ignora las anotaciones y se aplica 
	 * mediante interceptor. Para deserializar sí que hace falta
	 * anotación.
	 */
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="CEST")
	private Date fechaOperacion;
	private String descripcionError;
	private String informacionAdicional;
	private String codigoServicio;
	private String errorCode;
	private String warnCode;

	public HeadResponse(){
		super();
	}
	
	public Date getFechaOperacion() {
		return fechaOperacion==null?null:(Date)fechaOperacion.clone();
	}

	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion==null?null:(Date)fechaOperacion;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

	public String getInformacionAdicional() {
		return informacionAdicional;
	}

	public void setInformacionAdicional(String informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
	}

	public String getCodigoServicio() {
		return codigoServicio;
	}

	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getWarnCode() {
		return warnCode;
	}

	public void setWarnCode(String warnCode) {
		this.warnCode = warnCode;
	}
}
