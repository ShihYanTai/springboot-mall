package com.shihalex.springbootmall.dao;

import com.shihalex.springbootmall.dto.UserRegisterRequest;
import com.shihalex.springbootmall.model.User;

import javax.naming.InsufficientResourcesException;

public interface UserDao {
    User getUserById(Integer userId);
    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
