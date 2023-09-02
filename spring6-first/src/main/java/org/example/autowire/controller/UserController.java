package org.example.autowire.controller;

import org.example.autowire.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
