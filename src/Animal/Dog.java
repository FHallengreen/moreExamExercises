package Animal;

public abstract class Dog {

    public String bark (){
        return "wuf";
    }

    public static void main(String[] args) {
        Labrador dog1 = new Labrador("Erik");
        System.out.println(dog1.poop());
        System.out.println(dog1.bark());
    }
}
