package com.chushuai.service;

import com.chushuai.po.User;
/**
 *author:chushuai
 *date:2021.2.13
 */
public interface UserService {

    User checkUser(String username, String password);
}
