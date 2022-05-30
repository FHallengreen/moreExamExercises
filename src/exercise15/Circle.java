package exercise15;

import java.util.Random;

public class Circle implements Shape{
    private double radius;
    private double circle;

    public Circle() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
        this.radius = random.nextDouble(0,20);
            System.out.println("Circle is : " + getArea());
        }
    }

    @Override
    public int getArea() {
        return (int) (circle = Math.PI*radius*radius);
    }
}
