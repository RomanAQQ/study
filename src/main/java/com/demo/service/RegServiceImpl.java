package com.demo.service;

import com.demo.dao.RegDao;
import com.demo.dao.UserRepository;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegServiceImpl implements RegService {
    @Autowired
    private RegDao regDao;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void insert(User user) {
        regDao.insert(user);
    }

    @Override
    public User select(Integer id) {
        return regDao.select(id);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }
}
