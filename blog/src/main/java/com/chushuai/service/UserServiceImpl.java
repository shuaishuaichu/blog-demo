package com.chushuai.service;

import com.chushuai.dao.UserRepository;
import com.chushuai.po.User;
import com.chushuai.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *author:chushuai
 *date:2021.2.13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        System.out.println(username+password);
        User user = userRepository.findByUsernameAndPassword(username,password);
        System.out.println(user);
        return user;
    }
}
