package org.example.bean;

import lombok.Data;

@Data
public class Teacher {
    private Integer teacherId;
    private String teacherName;
    public Teacher() {}
    public Teacher(Integer teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }
}
