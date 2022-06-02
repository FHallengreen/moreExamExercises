package exercise16;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class examQuestion {

    private int number;
    private HashMap<Integer, Character> grade = new HashMap();
    private ArrayList<Character> grades = new ArrayList<>();
    
    public void setGrade (){
        Random random = new Random();
        grade.put(1,'A');
        grade.put(2,'B');
        grade.put(3,'C');
        grade.put(4,'D');
        grade.put(5,'E');
        grade.put(6,'F');
        for (int i = 0; i < 14; i++) {
        number = random.nextInt(1,7);
        char getGrade = grade.get(number);
        grades.add(getGrade);
        }
    }

    @Override
    public String toString() {
        return "examQuestion{" +
                "grades=" + grades +
                '}';
    }

    public static void main(String[] args) throws FileNotFoundException {
        examQuestion exam = new examQuestion();
        exam.setGrade();
        System.out.println(exam.grades);

        PrintStream prt = new PrintStream("Grades.txt");
        prt.println(exam.grades);

    }
}
