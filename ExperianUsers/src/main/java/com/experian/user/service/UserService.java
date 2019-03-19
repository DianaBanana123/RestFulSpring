package com.experian.user.service;

import java.util.List;

import com.experian.user.model.User;

/**
 * Interface de logica de servicios para gestion de usuarios.
 * 
 * @author Diana Rojas
 *
 */
public interface UserService {


	/**
	 * Metodo encargado de implementar la logica para obtener request,
	 * transar datos retornar resultado de lista de usuarios a controller.
	 * 
	 * @return
	 * 	Lista de usuarios
	 */
	public List<User> listAllUser();

	/**
	 * Metodo encargado de implementar la logica para obtener request,
	 * transar el registro de usuarios y responder a controller.
	 * 
	 * 	@param user
	 */
	public void addUser(User user);

	/**
	 * Metodo encargado de implementar la logica para obtener request,
	 * transar la actualizacion de usuarios y responder a controller.
	 * 
	 * 	@param user
	 */
	public void updateUser(User user);

	/**
	 * Metodo encargado de implementar la logica para obtener request,
	 * transar la eliminacion de usuarios y responder a controller.
	 * 
	 * 	@param user
	 */
	public void deleteUser(User user);

	/**
	 * Metodo encargado de implementar la logica para obtener request,
	 * retornar resultado de usuario encontrado a controller.
	 * 
	 * @param user
	 * 
	 * @return
	 * 	Usuario de consulta
	 */
	public User findUserById (User user);

}
