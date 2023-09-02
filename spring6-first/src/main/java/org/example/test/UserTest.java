package org.example.test;

import org.example.autowire.controller.UserController;
import org.example.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void testBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1 == user2);
    }

    @Test
    public void testLife(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User bean = ac.getBean(User.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        System.out.println(bean);
        ac.close();
    }

    @Test
    public void testAutowireByXML() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("autowire.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }
}
