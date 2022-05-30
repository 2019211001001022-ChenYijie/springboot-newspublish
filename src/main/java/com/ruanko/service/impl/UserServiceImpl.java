package com.ruanko.service.impl;

import java.util.List;

import com.ruanko.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruanko.dao.UserDao;
import com.ruanko.service.UserService;

/**
 * 
* Title: UserServiceImpl
* Description: 
* 用户操作实现类 
* Version:1.0.0  

 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDao userDao;

	@Override
	public Boolean findByUsernameAndPassword(String username,String password) {

		try{
			System.out.println("findByUsernameAndPassword");
			User user=userDao.findByUsernameAndPassword(username,password);
			return user != null;
		}catch(Exception e){
			System.out.println("查询失败!");
			e.printStackTrace();
		}
		return false;
	}
}
