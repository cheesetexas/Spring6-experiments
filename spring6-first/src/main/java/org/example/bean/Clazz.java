package org.example.bean;

import lombok.Data;

import java.util.List;

@Data
public class Clazz {
    private Integer clazzId;
    private String clazzName;
    public Clazz() {}
    public Clazz(Integer clazzId, String clazzName) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
    }

    private List<Student> students;
}
