package com.example.proje;

public class kapsul {
    private int id;
    private int password;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public kapsul() {
    }

    public kapsul(int id, int password, String name) {
        this.id = id;
        this.password = password; 
        this.name = name;
    }

    public kapsul(int password, String name) {
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "kapsul{" +
                "id=" + id +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }

}
