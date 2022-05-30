package exercise10;

public class BMI {
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

}
