package com.chushuai.dao;

import com.chushuai.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *author:chushuai
 *date:2021.2.13
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
