package com.example.sms.entity;

import java.util.Date;

public class Login  {
    private int id;
    private String username;
    private String password;
    private byte role;
    private Date ctime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public byte getRole() {
        return role;
    }
    public void setRole(byte role) {
        this.role = role;
    }
    public Date getCtime() {
        return ctime;
    }
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Login [id=" + id + ", username=" + username + ", password=" + password + ", ctime=" + ctime + ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getCtime()=" + getCtime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
