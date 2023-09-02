package org.example.test;

import org.example.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserFactoryBeanTest {

    @Test
    public void testUserFactoryBean() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-factorybean.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}
