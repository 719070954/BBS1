package com.hms.entity;

import java.io.Serializable;

public class Login implements Serializable {
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public Login(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Login() {
        super();
    }

    public Login(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
