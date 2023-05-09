package case_study.repository.interface_repository;

import case_study.model.person.CustomerModel;

import java.util.List;

public interface ICustomerRepository {
    void add(CustomerModel customerModel);

    void edit(CustomerModel customerModel, int id);

    List<CustomerModel> getCustomer();
}
