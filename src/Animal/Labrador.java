package Animal;

public class Labrador extends Dog {

    private String name;

    public Labrador(String name) {
        this.name = name;
    }

    public String poop (){
        return "pooping";
    }

    public String bark (){
        return "WUUUF";
    }
}
