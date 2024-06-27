package session11;

import java.util.Comparator;
import java.util.LinkedList;

public class StudentManagement {
    public static LinkedList<Student> students = new LinkedList<>();

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

    //    remove first student:
    public void removeLastStudent() {
        students.poll();
        System.out.println("Student sau khi xoa");
        showAll();
    }

    // add last student:
    public void addLastStudent(Student student) {
        students.offer(student);
        System.out.println("Student sau khi them moi");
        showAll();
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
