package exercise19;

import java.util.Comparator;

public class Compare implements Comparator<Dream> {
    @Override
    public int compare(Dream o1, Dream o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
