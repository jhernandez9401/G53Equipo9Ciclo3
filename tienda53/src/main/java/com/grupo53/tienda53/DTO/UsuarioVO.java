package com.grupo53.tienda53.DTO;

import java.io.Serializable;

public class UsuarioVO implements Serializable {
	Integer cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String pasword;
	private String usuario;
	/**
	 * @return the cedula_usuario
	 */
	public Integer getCedula_usuario() {
		return cedula_usuario;
	}
	/**
	 * @param cedula_usuario the cedula_usuario to set
	 */
	public void setCedula_usuario(Integer cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	/**
	 * @return the email_usuario
	 */
	public String getEmail_usuario() {
		return email_usuario;
	}
	/**
	 * @param email_usuario the email_usuario to set
	 */
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	/**
	 * @return the nombre_usuario
	 */
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	/**
	 * @param nombre_usuario the nombre_usuario to set
	 */
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	/**
	 * @return the pasword
	 */
	public String getPassword() {
		return pasword;
	}
	/**
	 * @param pasword the pasword to set
	 */
	public void setPassword(String pasword) {
		this.pasword = pasword;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	

}
