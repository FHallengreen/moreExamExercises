package exercise15;

import java.util.Random;

public class Circle implements Shape{
    private double radius;
    private double circle;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (circle = Math.PI*radius*radius);
    }


}
