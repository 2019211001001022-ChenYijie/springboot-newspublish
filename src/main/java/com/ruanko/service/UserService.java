package com.ruanko.service;

import com.ruanko.entity.User;

import java.util.List;


/**
 * 
* Title: UserService
* Description: 
* 用户接口 
* Version:1.0.0  

 */
public interface UserService {

	/**
	 * 登录功能
	 */
	Boolean findByUsernameAndPassword(String username, String password);
}
