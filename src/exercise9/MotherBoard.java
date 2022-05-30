package exercise9;

import java.util.Arrays;

public class MotherBoard {

    private SataDrive [] sataDrive = new SataDrive[4];

    public void printDrivesAdded(){
        System.out.println(Arrays.toString(sataDrive));
    }

    public void addDrive(){
        for (int i = 0; i < sataDrive.length; i++) {
            if (sataDrive[i] == null){
            }
            else System.out.println("Motherboard is full");
        }
        
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "sataDrive=" + Arrays.toString(sataDrive) +
                '}';
    }
}
