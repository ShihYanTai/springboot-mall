package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.dto.UserLoginRequest;
import com.shihalex.springbootmall.dto.UserRegisterRequest;
import com.shihalex.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);
}
