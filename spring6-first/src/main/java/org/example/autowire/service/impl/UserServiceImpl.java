package org.example.autowire.service.impl;

import org.example.autowire.dao.UserDao;
import org.example.autowire.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
