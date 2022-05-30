package exercise13;

import java.util.Random;

public class ChristmasPresent {

    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public ChristmasPresent() {
        Random random = new Random();
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();;
        this.doesRattle = random.nextBoolean();;
    }

    public boolean couldBeLego(){
        return isSoft && isRectangular && doesRattle;
    }

    public static void main(String[] args) {
        ChristmasPresent present = new ChristmasPresent();
        System.out.println(present.couldBeLego());
    }
}
