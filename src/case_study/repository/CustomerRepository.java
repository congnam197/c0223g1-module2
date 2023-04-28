package case_study.repository;

import case_study.model.CustomerModel;
import case_study.until.file.write_and_read_file.ReadAndWrieFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String NAME_FILE="src/case_study/until/file/file_csv/customer.csv";

    @Override
    public void add(CustomerModel customerModel) {
        String string = customerModel.getInfoToCSV();
        ReadAndWrieFile.writeFile(NAME_FILE,string,true);
    }

    @Override
    public void edit(CustomerModel customerModel, int index) {
        List<String> stringList=ReadAndWrieFile.readFile(NAME_FILE);
        stringList.set(index, customerModel.getInfoToCSV());
        for (int j = 0; j < stringList.size(); j++) {
            if (j == 0) {
                ReadAndWrieFile.writeFile(NAME_FILE, stringList.get(j), false);
            } else {
                ReadAndWrieFile.writeFile(NAME_FILE, stringList.get(j), true);
            }
        }
    }

    @Override
    public List<CustomerModel> getCustomer() {
        List<CustomerModel> customerModelList =new LinkedList<>();
        List<String> stringList =ReadAndWrieFile.readFile(NAME_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr=stringList.get(i).split(",");
            customerModelList.add(new CustomerModel(arr[0], arr[1], arr[2],Boolean.parseBoolean(arr[3]),arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerModelList;
    }
}
