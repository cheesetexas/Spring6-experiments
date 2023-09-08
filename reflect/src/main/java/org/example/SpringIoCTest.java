package org.example;

import org.junit.jupiter.api.Test;

public class SpringIoCTest {
    @Test
    public void testIoc() {
        ApplicationContext applicationContext = new AnnotationApplicationContext("org.example");
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.print();
        System.out.println("run success");
    }
}
