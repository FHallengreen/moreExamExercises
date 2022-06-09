package exercise10;

import java.util.ArrayList;
import java.util.Collections;

public class BMI implements Comparable<BMI>{
    private double weight;
    private double height;
    private double bmi;

    public BMI (double weight, double height){
        this.weight = weight;
        this.height = height;
        calculate();
    }

    public void calculate(){
        bmi = weight / (height * 2);
        System.out.println(bmi);
    }

    public boolean isUnderWeight(){
        if (bmi < 18.5){
            return true;
        }
        return false;
    }

    public boolean isNormalWeight(){
        return bmi >= 18.5 && bmi <= 25;
    }

    public boolean isOverWeight(){
        if (bmi >= 25){
            return true;
        }
        return false;
    }

    public String toString(){
        return String.valueOf(bmi);
    }

    public static void main(String[] args) {
        BMI bmi = new BMI(50,1.92);
        System.out.println(bmi.isNormalWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isUnderWeight());

        ArrayList<BMI> bmiList = new ArrayList<>();
        bmiList.add(bmi);
        bmiList.add(new BMI(80,1.80));
        bmiList.add(new BMI(50,1.80));
        bmiList.add(new BMI(60,1.80));
        bmiList.add(new BMI(70,1.80));

        System.out.println(bmiList);
        Collections.sort(bmiList);
        System.out.println(bmiList);


    }

    @Override
    public int compareTo(BMI o) {
        if (this.bmi == o.bmi){
            return 0;
        }
        else if (this.bmi > o.bmi){
            return 1;
        }
        else return -1;
    }
}
