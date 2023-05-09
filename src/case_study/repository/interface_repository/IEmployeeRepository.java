package case_study.repository.interface_repository;

import case_study.model.person.EmployeeModel;

import java.util.List;

public interface IEmployeeRepository {
    void add(EmployeeModel employeeModel);

    void edit(EmployeeModel employeeModel, int idex);

    List<EmployeeModel> getEmployee();
}
