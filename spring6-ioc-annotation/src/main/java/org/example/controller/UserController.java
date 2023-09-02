package org.example.controller;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void print() {
        userService.print();
        System.out.println("Controller层执行结束");
    }
}

