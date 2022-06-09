package textExam3;

import java.util.ArrayList;

public class Users {
    private int id = 1;
    private ArrayList<User> userList = new ArrayList<>();

    public void createUser(String userName, Role role){
        User user = new User(userName,role);
        userList.add(user);
        user.setUserID(id);
        id++;
    }

    public void findUserBasedOnRole(Role role){
        ArrayList<User> roleList = new ArrayList<>();
        for (User user : userList) {
            if (role == user.getRole()) {
                roleList.add(user);
            }
        }
        System.out.println(userList);
    }
}
