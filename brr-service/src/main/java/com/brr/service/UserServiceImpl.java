package com.brr.service;

import com.brr.mapper.UserMapper;
import com.brr.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: hxp
 * @date: 2019/5/8 14:23
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(){
        return userMapper.selectUser();
    }
}
