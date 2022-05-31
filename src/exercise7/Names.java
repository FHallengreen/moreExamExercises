package exercise7;

public class Names {

    private String firstName;
    private String middleName;
    private String lastName;

 /*   public Names(String fullname) {
        String[] splitnames = fullname.split(" ");

        if (splitnames.length == 2) {
            firstName = splitnames[0];
            lastName = splitnames[1];
        } else if (splitnames.length == 3) {
            firstName = splitnames[0];
            middleName = splitnames[1];
            lastName = splitnames[2];
        }
        else if (splitnames.length == 1){
            firstName = splitnames[0];
        }
    }*/

    public Names(String fullname) {
        this.firstName = fullname.substring(0,fullname.indexOf(" "));
        int firstIndex = fullname.indexOf(" ");
        this.middleName = fullname.substring(firstIndex,fullname.indexOf(" "));
    }

    @Override
    public String toString() {
        if (middleName == null && lastName == null){
            return firstName;
        }
        else if (middleName == null){
            return firstName + " " + lastName;
        }
        else return firstName + " " + middleName + " " + lastName;

    }

}
