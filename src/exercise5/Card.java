package exercise5;

import java.util.HashMap;

public class Card {
    private int value;
    private HashMap <String, Integer> suit;

    Card(HashMap<String, Integer> suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public void beats (int card, int suits){

        suit.put("spades",0);
        suit.put("clubs",1);
        suit.put("diamonds",2);
        suit.put("hearts",3);

       /* for (int i = 0; i < suit.size(); i++) {
            if (suit.get(i) > suit.get(i))
        }*/

        if (value > card){
            System.out.println("dit kort " + value + " er større end " + card);
        }
    }
}
