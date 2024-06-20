package session11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    public static List<Student> students = new ArrayList<>();

    // show All:
    public void showAllStudent() {
        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // add student:
    public void addStudent(Student student) {
        students.add(student);
    }

    // delete student:
    public void removeStudent(int studentId) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                index = i;
                break;
            }
        }
        if (index == -1) System.err.println("Ko tim thay id");
        else students.remove(index);
    }

    // Find student by Name (*)
    public void searchStudentByName(Scanner scanner) {
        System.out.println("Nhập tên học sinh cần tìm kiếm: ");
        String name = scanner.nextLine().toLowerCase().trim();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name)) System.out.println(student);
        }
    }

    // findStudentById
    public Student findStudentById(int studentId) {
        boolean isCheck = false;
        Student studentFind = null;
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                studentFind = student;
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.err.println("Không tìm thấy sinh viên");
            return null;
        }
        return studentFind;
    }

    // getAverageScore:
    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum;
    }


    //sort student by name
    public void sortByScore() {
        Comparator.comparing(Student::getAverageScore);
    }
    //

}
