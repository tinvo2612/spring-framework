package com.codegym.injection.setter;

public class Tran {
    private int id;

    private String fullName;

    private Classs classs;

    public Tran(int id, String fullName, Classs classs) {
        this.id = id;
        this.fullName = fullName;
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Classs getClazz() {
        return classs;
    }

    public void setClazz(Classs clazz) {
        this.classs = clazz;
    }

    @Override
    public String toString() {
        return "Tran{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", clazz='" + classs + '\'' +
                '}';
    }
}
