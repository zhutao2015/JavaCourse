package com.zhutao;
public class Circle{
    public double calculateArea(int radius){
        return 3.14 * radius * radius;
    }

    public static void main(String argv[]){
        Circle c = new Circle();

        int radius = 5;
        System.out.printf("Area of circle(%d) is %.3f", radius, c.calculateArea(radius));
    }
}
