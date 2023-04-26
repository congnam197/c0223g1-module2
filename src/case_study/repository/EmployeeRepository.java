package case_study.repository;

import case_study.model.Employee;
import case_study.until.file.ReadAndWrieFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String NAME_FILE = "src/case_study/until/file/file_csv/employess.csv";

    @Override
    public void add(Employee employee) {
        String string = employee.getInfoToCSV();
        ReadAndWrieFile.writeFile(NAME_FILE, string, true);
    }

    @Override
    public void edit(Employee employee, int index) {
        List<String> stringList = ReadAndWrieFile.readFile(NAME_FILE);
        stringList.set(index, employee.getInfoToCSV());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrieFile.writeFile(NAME_FILE, stringList.get(i), false);
            } else {
                ReadAndWrieFile.writeFile(NAME_FILE, stringList.get(i), true);
            }
        }
    }

    @Override
    public List<Employee> getEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrieFile.readFile(NAME_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr = stringList.get(i).split(",");
            employeeList.add(new Employee(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]),
                    Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }
}
