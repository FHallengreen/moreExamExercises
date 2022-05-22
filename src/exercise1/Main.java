package exercise1;

import exercise1.Text;

public class Main {
    public static void main(String[] args) {

        Text text1 = new Text();
        text1.addText("Hej");
        text1.addText("Med");
        text1.addText("Dig");
        text1.addText("Hej");
        text1.addText("Ole");
        System.out.println(text1.returnUnique());

    }
}