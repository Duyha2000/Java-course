package session14.Exercise.BT3.business;

import session14.Exercise.BT3.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentBusiness implements IDepartmentDesign {
    public static List<Department> departments = new ArrayList<>();

    @Override
    public boolean create(Department department) {
        departments.add(department);
        return true;
    }

    @Override
    public List<Department> findAll() {
        return departments;
    }

    @Override
    public boolean update(Department department) {
        if (departments.contains(department)) {
            departments.set(departments.indexOf(findById(department.getDepartmentId())), department);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return departments.removeIf(department -> department.getDepartmentId().equals(id));
    }

    @Override
    public Department findById(String id) {
        for (Department department : departments) {
            if (department.getDepartmentId().equals(id)) return department;
        }
        return null;
    }
}
