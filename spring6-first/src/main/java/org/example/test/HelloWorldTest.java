package org.example.test;

import org.example.bean.HelloWorld;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

    private final Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    // 方式一：根据id获取
    @Test
    public void testHelloWorld1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = (HelloWorld) ac.getBean("helloWorld");
        bean.sayHello();
        logger.info("方式一：根据id获取 执行成功");
    }

    // 方式二：根据类型获取
    @Test
    public void testHelloWorld2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = ac.getBean(HelloWorld.class);
        bean.sayHello();
        logger.info("方式二：根据类型获取 执行成功");
    }

    // 方式三：根据id和类型获取
    @Test
    public void testHelloWorld3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = ac.getBean("helloWorld", HelloWorld.class);
        bean.sayHello();
        logger.info("方式三：根据id和类型获取 执行成功");
    }
}
