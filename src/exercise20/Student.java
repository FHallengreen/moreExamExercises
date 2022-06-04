package exercise20;

import java.util.ArrayList;

public class Student implements DataObject {

    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getID() {
        return 0;
    }

    public String toString (){
        return name + " :" + id + " :" + email;
    }

    @Override
    public ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        list.add(id + " name: " + name + ", email: " + email);
        return list;
    }

}
