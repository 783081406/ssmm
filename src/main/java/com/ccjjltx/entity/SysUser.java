package com.ccjjltx.entity;

import java.io.Serializable;
import java.util.Objects;

public class SysUser implements Serializable {
    private String id;
    private String name;
    private int age;

    public SysUser() {
    }

    public SysUser(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return age == sysUser.age &&
                Objects.equals(id, sysUser.id) &&
                Objects.equals(name, sysUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
