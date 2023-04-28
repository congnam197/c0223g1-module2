package case_study.repository;

import case_study.model.CustomerModel;

import java.util.List;

public interface ICustomerRepository {
    void add(CustomerModel customerModel);

    void edit(CustomerModel customerModel, int id);

    List<CustomerModel> getCustomer();
}
