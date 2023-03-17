package com.example.actividad2_recyclerview;

public class User {
    private String username;
    private int img;

    public User(String username, int img) {
        this.username = username;
        this.img = img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
