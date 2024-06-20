package session11;

public class BT9 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(new Student(1, "Duy", 8.4));
        studentManagement.showAllStudent();
    }
}
