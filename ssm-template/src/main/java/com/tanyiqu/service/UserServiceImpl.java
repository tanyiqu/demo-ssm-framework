package com.tanyiqu.service;

import com.tanyiqu.mapper.UserMapper;
import com.tanyiqu.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
