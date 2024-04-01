package EmployeeServies;

import java.util.List;

import com.example.Employee.Entiy.Employee;

public interface EmployeesServies {
    Employee createEmployee(Employee emp);

    Employee getEmployeeById(Long userId);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Employee Employee);

    void deleteEmployee(Integer EmployeeId);
}