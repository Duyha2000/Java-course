package Lession.business;

import Lession.entity.Department;
import Lession.entity.Employee;

import java.util.*;

public class EmployeeBusiness implements IEmployeeDesign {
    public static List<Employee> employees = new ArrayList<>();

    //    Thống kê số lượng nhân viên trung bình của mỗi phòng
    @Override
    public int calEmployeeAvg() {
        // Phòng A: 3 nhân viên
        // Phòng B: 7 nhân viên
        // Phòng C: 3 nhân viên
        // Phòng D: 12 nhân viên
        // Phòng E: 14 nhân viên

        Map<Department, Integer> hashMap = getDepartmentIntegerMap();

        int totalDepartments = hashMap.size();
        int totalPerson = employees.size();
        return totalPerson / totalDepartments;
    }

    private static Map<Department, Integer> getDepartmentIntegerMap() {
        Map<Department, Integer> hashMap = new HashMap<>();
        // 15 nhân viên
        for (Employee employee : employees) {
            Department department = employee.getDepartment();
            if (!hashMap.containsKey(department)) hashMap.put(department, 1);
            else hashMap.put(department, hashMap.get(department) + 1);
        }
        return hashMap;
    }

    // Tìm ra 5 phòng có số lượng nhân viên đông nhất:
    @Override
    public List<Map.Entry<Department, Integer>> mostCrowded() {
        Map<Department, Integer> hashMap = getDepartmentIntegerMap();
        List<Map.Entry<Department, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        List<Map.Entry<Department, Integer>> entryList2 = new ArrayList<>();
        entryList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (int i = 0; i < 5; i++) {
            entryList2.add(entryList.get(i));
        }
        // [Phòng A: 3 nhân viên, <- entry
        // Phòng C: 3 nhân viên, <- entry
        // Phòng B: 7 nhân viên,<- entry
        // Phòng D: 12 nhân viên,<- entry
        // Phòng E: 14 nhân viên <- entry]
        return entryList2;
    }

    @Override
    public Employee manageMostEmploy() {
        return null;
    }

    @Override
    public List<Employee> employeeAgeMax() {
        return null;
    }

    @Override
    public List<Employee> employeeSalaryMax() {
        return null;
    }


    @Override
    public boolean create(Employee employee) {
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        employees.set(employees.indexOf(findById(employee.getEmployeeId())), employee);
        return true;
    }


    @Override
    public boolean deleteById(String id) {
        return employees.removeIf(employee -> employee.getEmployeeId().equals(id));
    }

    @Override
    public Employee findById(String id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(id)) return employee;
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }


    @Override
    public boolean existByEmployeeId(String depId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(depId)) return true;
        }
        return false;
    }

}
