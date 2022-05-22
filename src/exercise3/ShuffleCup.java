package exercise3;

import java.util.Random;

public class ShuffleCup {

    private int [] amountOfDices;

    public ShuffleCup (int[] dices){
        this.amountOfDices = dices;
    }

    public int shake (){
        Random random = new Random();
        int result = 0;
        for (int i = 0; i < amountOfDices.length; i++) {
            amountOfDices[i] = random.nextInt(1,6);
            result += amountOfDices[i];
        }
        System.out.println(result);
        return result;
    }

    public int[] showDices(){
        return amountOfDices;
    }



}
