package com.shihalex.springbootmall.service.impl;

import com.shihalex.springbootmall.dao.UserDao;
import com.shihalex.springbootmall.dto.UserRegisterRequest;
import com.shihalex.springbootmall.model.User;
import com.shihalex.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
