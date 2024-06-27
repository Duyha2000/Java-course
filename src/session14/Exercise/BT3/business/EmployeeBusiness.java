package session14.Exercise.BT3.business;

import session14.Exercise.BT3.entity.Department;
import session14.Exercise.BT3.entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeBusiness implements IEmployeeDesign {
    public static List<Employee> employees = new ArrayList<>();

    @Override
//    Thống kê số lượng nhân viên trung bình của mỗi phòng
    public double averageEmployeePerDepartment() {
        Map<Department, Integer> departmentEmployeeCount = new HashMap<>();

        for (Employee employee : employees) {
            Department department = employee.getDepartment();
            departmentEmployeeCount.put(department, departmentEmployeeCount.getOrDefault(department, 0) + 1);
        }

        double totalDepartments = departmentEmployeeCount.size();
        double totalEmployees = employees.size();

        return totalEmployees / totalDepartments;
    }

    @Override
    public List<Department> top5DepartmentsByEmployeeCount() {
        Map<Department, Integer> departmentEmployeeCount = new HashMap<>();

        for (Employee employee : employees) {
            Department department = employee.getDepartment();
            departmentEmployeeCount.put(department, departmentEmployeeCount.getOrDefault(department, 0) + 1);
        }

        return departmentEmployeeCount.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    @Override
    public Employee managerWithMostEmployees() {
        Map<Employee, Integer> managerEmployeeCount = new HashMap<>();

        for (Employee employee : employees) {
            Employee manager = employee.getManager();
            if (manager != null) {
                managerEmployeeCount.put(manager, managerEmployeeCount.getOrDefault(manager, 0) + 1);
            }
        }

        return managerEmployeeCount.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }


    @Override
    public List<Employee> top5OldestEmployees() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getBirthday))
                .limit(5)
                .collect(Collectors.toList());
    }


    @Override
    public List<Employee> top5HighestPaidEmployees() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }


    @Override
    public List<Employee> findAll() {
        // Implement this method
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        // Implement this method
        return false;
    }

    @Override
    public Employee findById(String id) {
        // Implement this method
        return null;
    }


    @Override
    public boolean create(Employee employee) {
        return false;
    }


    @Override
    public boolean update(Employee employee) {
        // Implement this method
        return false;
    }


}