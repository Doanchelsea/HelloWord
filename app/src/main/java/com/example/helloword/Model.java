package com.example.helloword;

public class Model {
    public int img;
    public int id;
    public String name;

    public Model(int img, int id, String name) {
        this.img = img;
        this.id = id;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
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
}
