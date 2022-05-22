package exercise1;

import java.util.ArrayList;

public class Text {

    private ArrayList <String> list = new ArrayList<>();

    public void addText (String text){
        list.add(text);
    }

    public ArrayList<String> returnUnique (){
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(uniqueWords.contains(list.get(i)))){
                uniqueWords.add(list.get(i));
            }
        }
        return uniqueWords;
    }
}
