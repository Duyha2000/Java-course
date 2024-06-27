package session14.Exercise.BT3.entity;

import session14.Exercise.BT3.util.InputMethods;

public class Department implements IManagement {
    private static int autoId = 0;
    private String departmentId, departmentName;
    private int totalMembers;

    public Department() {
        this.departmentId = String.format("D%04d", ++autoId);
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Department.autoId = autoId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public Department(String departmentName, int totalMembers) {
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    @Override
    public void inputData() {
        System.out.println("Department Name: " + departmentName);
        this.departmentName = InputMethods.getString();
        System.out.println("Total Members: " + totalMembers);
        this.totalMembers = InputMethods.getInteger();
        
    }

    @Override
    public void displayData() {
        System.out.printf("|ID : %-4s | Department Name: %-15s | Total Members : %10s |\n", departmentId, departmentName, totalMembers);
    }
}
