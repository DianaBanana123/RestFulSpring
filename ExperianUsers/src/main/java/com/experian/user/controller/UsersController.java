package com.experian.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.experian.user.model.User;
import com.experian.user.service.UserService;


/**
 * Clase principal, encargada de definir las firmas de servicios rest,
 * mapeo de request y response.
 * 
 * @author Diana Rojas
 *
 */
@RestController
public class UsersController {

	/**
	 * Inyeccion a clase implementadora de servicios
	 */
	@Autowired
	UserService userService;

	/**
	 * Metodo que permite consultar la totalidad de los usuarios.
	 * Request en GET
	 * 
	 * @return
	 * 	Lista de usuarios
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<User>> listAllUser(){
		List<User> list = userService.listAllUser();
		if(list.size() == 0) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	/**
	 * Metodo que permite registrar un usuario en base de datos.
	 * Request en POST
	 * 
	 * @return
	 * 	Response 201
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Void> add(@RequestBody User user){		
		userService.addUser(user);
		HttpHeaders header = new HttpHeaders();
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
	
	/**
	 * Metodo que permite actualizar los datos de un usuario en base de datos.
	 * Request en PUT
	 * 
	 * @return
	 * 	Response 200
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody User user){		
		user.setId(id);
		userService.updateUser(user);
		HttpHeaders header = new HttpHeaders();
		return new ResponseEntity<Void>(header, HttpStatus.OK);
	}
	
	/**
	 * Metodo que permite eliminar un usuario en base de datos.
	 * Request en DELETE
	 * 
	 * @return
	 * 	Response 204
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public ResponseEntity<Void> delete(@PathVariable("id") int id, @RequestBody User user){		
		user.setId(id);
		userService.deleteUser(user);
		HttpHeaders header = new HttpHeaders();
		return new ResponseEntity<Void>(header, HttpStatus.NO_CONTENT);
	}
	
}
