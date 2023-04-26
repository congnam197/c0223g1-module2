package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    void add(Customer customer);

    void edit(Customer customer, int id);

    List<Customer> getCustomer();
}
