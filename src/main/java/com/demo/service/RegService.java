package com.demo.service;

import com.demo.entity.User;


public interface RegService {
    void insert(User user);

    User select(Integer id);

    User findByUserName(String userName);
}
