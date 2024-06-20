package Session11Backup;

public class BT9 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.showAll();

        studentManagement.addStudent(new Student(1, "Tinh", 6));
        studentManagement.addStudent(new Student(2, "Tinh", 5));
        studentManagement.showAll();

//        studentManagement.removeStudent(5);
//        studentManagement.removeStudent(1);
        System.out.println(studentManagement.findStudentById(1));

//
        System.out.println(studentManagement.getAverageScore());
//
        studentManagement.sortByScore();
    }
}
