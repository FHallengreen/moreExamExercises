package exercise10;

public class Main {
    public static void main(String[] args) {
        BMI bmi = new BMI(50,1.92);
        System.out.println(bmi.isNormalWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isUnderWeight());
    }

}
