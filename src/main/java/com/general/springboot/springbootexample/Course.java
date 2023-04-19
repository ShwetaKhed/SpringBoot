package com.general.springboot.springbootexample;

public class Course {
    private long id;
    private String courseName;
    private String desc;

    public Course(int id, String courseName, String desc) {
        this.id = id;
        this.courseName = courseName;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
