package testExam1;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent {

    private String firstName;
    private String lastName;
    private WhichHouse house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName + " " + house;
    }


    public WhichHouse setHouse(WhichHouse house) {
        try {
            if (house == WhichHouse.GRYFFINDOR || house == WhichHouse.SLYTHERIN || house == WhichHouse.HUFFLEPUFF || house == WhichHouse.RAVENCLAW){
                this.house = house;
            } else throw new Exception("Ugyldigt valg");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return house;
    }


    public static void main(String[] args) {
        HogwartsStudent student = new HogwartsStudent("Frederik", "Hansen");
        HogwartsStudent student2 = new HogwartsStudent("Jesper", "Rusbjerg");
        HogwartsStudent student3 = new HogwartsStudent("Bob", "Larsen");

        ArrayList<HogwartsStudent> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);
        Collections.sort(studentList, new compareLastName());
        System.out.println(studentList);
        student.setHouse(WhichHouse.GRYFFINDOR);


    }

}
