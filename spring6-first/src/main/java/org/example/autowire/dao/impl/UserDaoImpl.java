package org.example.autowire.dao.impl;

import org.example.autowire.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}