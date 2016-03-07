package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDAO;
import com.demo.model.User;
import com.demo.service.UserService;
 
 
 
@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;
     
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }

	@Override
	public int deleteUser(int id) {
		return userDAO.deleteUser(id);
	}

	@Override
	public User getUserByID(int id) {
		return userDAO.getUserByID(id);
	}

	@Override
	public List<User> getAllUser() {
		return userDAO.getAllUser();
	}

	@Override
	public int updateUser(User user) {
		return userDAO.updateUser(user);
	}
 
}