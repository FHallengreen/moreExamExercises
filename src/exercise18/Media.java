package exercise18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public abstract class Media {

    private String name;
    private int duration;

    public Media(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Media> list = new ArrayList<>();
        list.add(new Audio("Højtaler", 10, "10dB"));
        list.add(new Audio("Headset", 15, "5dB"));
        list.add(new Video("Fjernsyn", 1000, "16:9"));

        PrintStream out = new PrintStream("Medie.txt");
        for (Media m : list) {
            if (m instanceof Audio) {
                out.println(m.name + ": " + m.duration + ": " + ((Audio) m).getLoudness());
            } else if (m instanceof Video) {
                out.println(m.name + ": " + m.duration + ": " + ((Video) m).getAspectRatio());
            }

        }

    }

}
