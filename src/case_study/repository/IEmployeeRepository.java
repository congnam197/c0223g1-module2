package case_study.repository;

import case_study.model.EmployeeModel;

import java.util.List;

public interface IEmployeeRepository {
    void add(EmployeeModel employeeModel);

    void edit(EmployeeModel employeeModel, int idex);

    List<EmployeeModel> getEmployee();
}
