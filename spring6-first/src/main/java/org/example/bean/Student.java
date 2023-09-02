package org.example.bean;

import lombok.Data;

import java.util.Map;

@Data
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    public Student() {}
    public Student(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private Clazz clazz;

    private String[] hobbies;

    private Map<String, Teacher> teacherMap;
}
