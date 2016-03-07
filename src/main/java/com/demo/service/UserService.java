package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	public int insertUser(User user);
	public int deleteUser(int id);
	public User getUserByID(int id);
	public List<User> getAllUser();
	public int updateUser(User user);

}
