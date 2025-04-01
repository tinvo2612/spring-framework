package com.codegym.beans.xml;

public class Developer {
    private int id;
    private String name;
    private String major;

    public Developer() {
    }

    public Developer(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
