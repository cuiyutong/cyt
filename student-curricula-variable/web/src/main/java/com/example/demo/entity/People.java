package com.example.demo.entity;

/**
 * Created by cuiyutong on 2019-07-24.
 */
public class People  {
    private int id;
    private  String name;
    private int state;
    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public People(int id, String name, int state, String pwd) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.pwd = pwd;
    }

    public People(int id, String name, int state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }
    public People() {
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

