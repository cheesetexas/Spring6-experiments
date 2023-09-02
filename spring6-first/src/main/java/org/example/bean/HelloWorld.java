package org.example.bean;

public class HelloWorld {

    /**
     * Spring创建对象时通过反射机制调用无参数构造方法。
     * bean对象最终存储在spring容器中，在spring源码底层就是一个map集合，存储bean的map在DefaultListableBeanFactory类中：
     * private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);
     * Spring容器加载到Bean类时,会把这个类的描述信息,
     * 以包名加类名的方式存到beanDefinitionMap中,Map<String,BeanDefinition>,
     * 其中 String是Key,默认是类名首字母小写,
     * BeanDefinition ,存的是类的定义(描述信息),
     * 我们通常叫BeanDefinition接口为 : bean的定义对象。
     */
    public HelloWorld() {
        System.out.println("无参数构造方法执行");
    }
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
