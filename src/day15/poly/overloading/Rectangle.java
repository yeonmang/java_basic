package day15.poly.overloading;

public class Rectangle {

    // 정사각형의 넓이를 구하는 기능
    // calcArea(int)
    public int calcArea1(int length){
        return length*length;
    }

    public void calcArea(int a){

    }

    // 직사각형의 넓이를 구하는 기능
    public int calcArea2(int width, int height){
        return width * height;
    }

}