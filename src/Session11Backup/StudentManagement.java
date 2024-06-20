package Session11Backup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    public static List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAll() {
        if (students.isEmpty()) System.err.println("K co hsinh nao");
        else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void removeStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                System.out.println("Xoa thanh cong!!!");
                return;
            }
        }
        System.err.println("Ko tim thay id");
    }


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
        if (isCheck) {
            System.out.println("Tim thay sinh vien");
            return studentFind;
        }
        return null;
    }

    public double getAverageScore() {
        double sumAvg = 0;
        for (Student student : students) sumAvg += student.getAverageScore();
        return sumAvg / students.size();
    }

    public void sortByScore() {
        students.sort(Comparator.comparing(Student::getAverageScore));
        showAll();
    }
}
