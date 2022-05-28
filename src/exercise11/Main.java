package exercise11;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Langeland er det bedste", "Vi er er gået mange mange mange kilometer i dag, Hvorfor det?", "Who knows");
        System.out.println(article.getLongestWord());
        System.out.println(article.getWords());
    }
}
