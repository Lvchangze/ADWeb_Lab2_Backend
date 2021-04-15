package com.fudan.weblab2.repository;

import com.fudan.weblab2.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findUserById(String id);

    void addNewUser(String id, String password, int age, int gender);

    User[] listAll();
}