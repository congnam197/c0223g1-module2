package case_study.repository;

import case_study.model.Customer;
import case_study.until.file.write_and_read_file.ReadAndWrieFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String NAME_FILE="src/case_study/until/file/file_csv/customer.csv";

    @Override
    public void add(Customer customer) {
        String string = customer.getInfoToCSV();
        ReadAndWrieFile.writeFile(NAME_FILE,string,true);
    }

    @Override
    public void edit(Customer customer,int index) {
        List<String> stringList=ReadAndWrieFile.readFile(NAME_FILE);
        stringList.set(index, customer.getInfoToCSV());
        for (int j = 0; j < stringList.size(); j++) {
            if (j == 0) {
                ReadAndWrieFile.writeFile(NAME_FILE, stringList.get(j), false);
            } else {
                ReadAndWrieFile.writeFile(NAME_FILE, stringList.get(j), true);
            }
        }
    }

    @Override
    public List<Customer> getCustomer() {
        List<Customer> customerList =new LinkedList<>();
        List<String> stringList =ReadAndWrieFile.readFile(NAME_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr=stringList.get(i).split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2],Boolean.parseBoolean(arr[3]),arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }
}
