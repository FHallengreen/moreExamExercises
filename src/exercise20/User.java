package exercise20;

import java.awt.datatransfer.ClipboardOwner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class User implements DataObject{

    private int id;
    private String name;
    private String username;

    public User(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    @Override
    public int getID() {
        id++;
        return id;
    }

    @Override
    public ArrayList<String> getData() {
        ArrayList<String> list = new ArrayList<>();
        list.add(id + " name: " + name + ", username: " + username);
        return list;
    }


    public String toString (){
        return name + " :" + id + " :" + username;
    }

    public static void main(String[] args) {
        User user = new User(1,"Fred","frha0610");

        System.out.println(user.getData());

        ArrayList<DataObject> list = new ArrayList<>();

        list.add(user);
        list.add(new User(2,"Bob","bo0447"));
        list.add(new Student(3,"Bob","bo0447@email.dk"));
        list.add(new User(4,"Pia","pi1144"));
        System.out.println(list);
    }
}
