package textExam3;

public class User {
    private String userName;
    private int userID;
    private Role role;

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Role getRole() {
        return role;
    }

    public String toString (){
        return userName + ", " + userID + ", " + role;
    }
    public User(String userName, Role role) {
        this.userName = userName;
        this.role = role;
    }

    public static void main(String[] args) {
        Users users = new Users();
        users.createUser("Bobby",Role.ADMIN);
        users.createUser("Erik",Role.ADMIN);
        users.createUser("Lars",Role.ADMIN);
        users.findUserBasedOnRole(Role.ADMIN);
    }


}
