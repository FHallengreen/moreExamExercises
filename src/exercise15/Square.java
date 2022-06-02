package exercise15;

import java.util.Random;

public class Square implements Shape {

    private int width;
    private int square;

    public Square(int width) {
        this.width = width;
    }

    public Square() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
        this.width = random.nextInt(0,20);
            System.out.println("Size is " + getArea() + " m2");
        }
    }

    @Override
    public int getArea() {
        return square = width * width;
    }
}
