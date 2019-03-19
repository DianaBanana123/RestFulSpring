package com.experian.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experian.user.dao.UserDao;
import com.experian.user.model.User;

/**
 * Clase implementadora de servicios. 
 * 
 * @author Diana Rojas
 *
 */
@Service
public class UserServiceImpl implements UserService{

	
	/**
	 * Entidad de usuaroos
	 */
	UserDao userDao;

	/**
	 * Inyeccion de userDao
	 * @param userDao
	 */
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> listAllUser() {
		return userDao.listAllUser();
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	public User findUserById(User user) {
		return userDao.findUserById(user);
	}

}
