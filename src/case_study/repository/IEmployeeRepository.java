package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void add(Employee employee);

    void edit(Employee employee, int idex);

    List<Employee> getEmployee();
}
