package exercise15;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapelist = new ArrayList<>();

        shapelist.add(new Circle(3));
        shapelist.add(new Circle(5));
        shapelist.add(new Circle(7));
        shapelist.add(new Circle(1));
        shapelist.add(new Square(4));
        shapelist.add(new Square(9));
        shapelist.add(new Square(3));
        shapelist.add(new Square(2));
        for (Shape s : shapelist
             ) {
            System.out.println(s.getArea());

        }
    }
}
