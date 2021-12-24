package com.kh.practice.point.model.vo;
public class Rectangle extends Point{
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
    }
}
