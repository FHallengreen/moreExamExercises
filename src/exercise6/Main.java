package exercise6;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(2000,new Trailer(2500));
        Car car2 = new Car(1000);
        Car car3 = new Car(1000, new Trailer(1500));
    }


}
