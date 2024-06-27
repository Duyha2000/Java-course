package session13.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
// C1: Array       Student[] students = {
//                new Student("1", "Duy", 23, 24.0),
//                new Student("2", "Duy", 23, 24.3),
//                new Student("4", "Duy", 23, 24.5),
//                new Student("7", "Duy", 23, 24.3),
//        };
//        Arrays.sort(students);

//  C2: Collection(Arraylist)
        List<Student> students = new ArrayList<>();
        students.add(new Student("9", "Duy", 23, 24.0));
        students.add(new Student("5", "Duy", 23, 24.3));
        students.add(new Student("4", "Duy", 23, 24.5));
        students.add(new Student("7", "Duy", 23, 24.3));

        // desc
        students.sort(Collections.reverseOrder(Comparator.comparing(Student::getId)));
        
        // Asc
        students.sort(Comparator.comparing(Student::getId));

        for (Student student : students) System.out.println(student);
    }
}
