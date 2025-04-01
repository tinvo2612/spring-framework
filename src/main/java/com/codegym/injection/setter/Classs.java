package com.codegym.injection.setter;

public class Classs {
    private int id;
    private String name;
    private Student tinvo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return tinvo;
    }

    public void setStudent(Student student) {
        this.tinvo = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + tinvo +
                '}';
    }

}
