package org.example.proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void testStaticProxy() {
        System.out.println("静态代理：");
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1, 2);
    }

    @Test
    public void testDynamicProxy() {
        System.out.println("动态代理：");
        ProxyFactory factory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.add(1, 2);
    }
}
