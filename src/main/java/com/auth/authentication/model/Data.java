package com.auth.authentication.model;

public class Data {
    private String id;
    private String name;
    private int rollno;

    public Data(String id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "data{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
