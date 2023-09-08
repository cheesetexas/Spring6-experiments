package org.example.aop;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest {
    private final Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void testAdd() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("log.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int add = calculator.add(1, 1);
        logger.info("执行成功:"+add);
    }
}
