package com.experian.user.model;

/**
 * Clase encargada de contener la informacion de
 * los usuarios a gestionar.
 * 
 * @author Diana Rojas
 *
 */
public class User {

	/**
	 * Identificador de base de datos autonumerio,
	 * autoincremental.
	 */
	private Integer id;
	
	/**
	 * Nombre del usuario 
	 */
	private String firtname;
	
	/**
	 * Apellido de usuario 
	 */
	private String lastname;
	
	/**
	 * Direccion de residencia de usuario 
	 */
	private String address;
	
	/**
	 * Constructor default
	 */
	public User() {
		super();
	}
	
	public User(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirtname() {
		return firtname;
	}
	public void setFirtname(String firtname) {
		this.firtname = firtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
