package org.example.test;

import org.example.bean.Student;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    private final Logger logger = LoggerFactory.getLogger(StudentTest.class);

    // 配置bean时使用property标签为属性赋值
    @Test
    public void testDIBySet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentOne", Student.class);
        System.out.println(studentOne);
        logger.info("property标签为属性赋值 执行成功");
    }

    // 配置bean时使用constructor-arg标签为属性赋值
    @Test
    public void testDIByConstructor(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentTwo", Student.class);
        System.out.println(studentOne);
        logger.info("constructor-arg标签为属性赋值 执行成功");
    }
}
