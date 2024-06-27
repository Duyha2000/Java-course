package session14.Exercise.BT3.business;

import session14.Exercise.BT3.entity.Department;
import session14.Exercise.BT3.entity.Employee;

import java.util.List;

public interface IEmployeeDesign extends IGenericDesign<Employee, String> {
    //    Thống kê số lượng nhân viên trung bình của mỗi phòng
    double averageEmployeePerDepartment();

    //    Tìm ra 5 phòng có số lượng nhân viên đông nhất
    List<Department> top5DepartmentsByEmployeeCount();

    //    Tìm ra người quản lý nhiều nhân viên nhất
    Employee managerWithMostEmployees();

    //    Tìm ra 5 nhân viên có tuổi cao nhất công ty
    List<Employee> top5OldestEmployees();

    //    Tìm ra 5 nhân viên hưởng lương cao nhất
    List<Employee> top5HighestPaidEmployees();
}