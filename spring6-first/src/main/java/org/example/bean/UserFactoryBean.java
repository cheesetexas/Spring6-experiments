package org.example.bean;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() {
        return new User();
    }
    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
