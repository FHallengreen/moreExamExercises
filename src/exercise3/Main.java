package exercise3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ShuffleCup cup = new ShuffleCup(new int[3]);

        cup.shake();

        System.out.println(Arrays.toString(cup.showDices()));

      

    }
}
