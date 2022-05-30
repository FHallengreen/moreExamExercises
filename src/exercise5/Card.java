package exercise5;

import java.util.HashMap;

public class Card {
    private int value;
    private String suit;
    private HashMap <String, Integer> suitMap = new HashMap<>();

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public void beats (int valueOP, String suitOP){

        suitMap.put("spades",0);
        suitMap.put("clubs",1);
        suitMap.put("diamonds",2);
        suitMap.put("hearts",3);


            if (suitMap.get(suit) > suitMap.get(suitOP)){
                System.out.println("dit kort " + suit + " er større end " + suitOP);
        }
        if (value > valueOP){
            System.out.println("dit kort " + value + " er større end " + valueOP);
        }
        else System.out.println("Dit kort slår ikke modstanderen.");
    }


}
