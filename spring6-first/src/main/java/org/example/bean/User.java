package org.example.bean;

import lombok.Data;

/**
 * bean具体的生命周期流程：
 *  1. bean对象创建（调用无参构造器）
    2. 给bean对象设置属性
    3. bean的后置处理器（初始化之前）
    4. bean对象初始化（需在配置bean时指定初始化方法）
    5. bean的后置处理器（初始化之后）
    6. bean对象就绪可以使用
    7. bean对象销毁（需在配置bean时指定销毁方法）
    8. IOC容器关闭
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    public User() {
        System.out.println("生命周期：1、创建对象");
    }

    public void setId(Integer id) {
        System.out.println("生命周期：2、依赖注入");
        this.id = id;
    }
    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public void initMethod() {
        System.out.println("生命周期：3、初始化");
    }

    public void destroyMethod() {
        System.out.println("生命周期：5、销毁");
    }
}
