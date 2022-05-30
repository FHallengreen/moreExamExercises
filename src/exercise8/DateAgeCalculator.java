package exercise8;

public class DateAgeCalculator {

    int yourAge;
    int dateAge;
    int lowestAge;

    public DateAgeCalculator (int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
        calculateLowestAge();
    }
    public int calculateLowestAge (){

        lowestAge = yourAge / 2 + 7;
        return lowestAge;
    }

    public boolean isDateTooYoung(){
        if (dateAge < lowestAge){
            return true;
        }
        return false;
    }


}
