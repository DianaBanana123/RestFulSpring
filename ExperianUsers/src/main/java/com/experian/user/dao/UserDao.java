package com.experian.user.dao;

import java.util.List;

import com.experian.user.model.User;

/**
 * Clase que declara las firmas de los metodos a implementar
 * para gestionar la informacion de base de datos.
 * 
 * 
 * @author Diana Rojas
 *
 */
public interface UserDao {
	
	/**
	 * Permite encntrar todos los usuarios registrados en base de datos.
	 * 
	 * @return
	 * 	Lista de usuarios
	 */
	public List<User> listAllUser();
	
	/**
	 * Permite realizar el registro de un usuario.
	 * 
	 * @param user
	 * 		Informacion basica del usuario
	 */
	public void addUser(User user);
	
	/**
	 * Permite realizar la actualizacion de un usuario.
	 * 
	 * @param user
	 * 		Informacion basica del usuario
	 */
	public void updateUser(User user);
	
	/**
	 * Permite eliminar el registro de un usuario.
	 * 
	 * @param user
	 * 		Identificador del usuario
	 */
	public void deleteUser(User user);
	
	/**
	 * Permite consultar la informacion de usuario en especifico
	 * 
	 * @param user
	 * 		Identificador del usuario
	 * 
	 * @return
	 * 		Informacion del usuario
	 */
	public User findUserById (User user);

}
