package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {
    // Spring全注解开发就是不再使用Spring配置文件，而是用一个配置类代替配置文件。
}
