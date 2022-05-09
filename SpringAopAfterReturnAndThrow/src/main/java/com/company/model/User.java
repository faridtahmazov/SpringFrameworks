package com.company.model;

public class User {
    private String name;
    private String username;
    private Integer age;

    public User() {
    }

    public User(String name, String username, Integer age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

