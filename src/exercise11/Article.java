package exercise11;

import java.util.ArrayList;

public class Article {

    private String heading;
    private String body;
    private String author;
    private String longestWord = "";

    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord() {

        String[] split = body.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > longestWord.length()) {
                longestWord = split[i];
            }
        }
        return longestWord;
    }

    public ArrayList<String> getWords() {
        String[] split = body.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!arrayList.contains(split[i])) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }
}
