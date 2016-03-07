package com.demo.dao;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.demo.model.User;

@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false,isolation=Isolation.DEFAULT)
public interface UserDAO {
	
	public int insertUser(User user);
	public int deleteUser(int id);
	public User getUserByID(int id);
	public List<User> getAllUser();
	public int updateUser(User user);
	
}
