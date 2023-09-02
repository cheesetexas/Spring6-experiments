package org.example.test;

import org.example.config.Config;
import org.example.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    private final Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testXmlAnnotation() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("component-scan.xml");
        UserController userController = ac.getBean("userController", UserController.class);
        userController.print();
        logger.info("执行成功");
    }

    @Test
    public void testConfigAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.print();
        logger.info("执行成功");
    }
}
