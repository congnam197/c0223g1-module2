package case_study.repository.class_repository;

import case_study.model.person.EmployeeModel;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String NAME_FILE = "src/case_study/until/file/file_csv/employess.csv";

    @Override
    public void add(EmployeeModel employeeModel) {
        String string = employeeModel.getInfoToCSV();
        ReadAndWriteFile.writeFile(NAME_FILE, string, true);
    }

    @Override
    public void edit(EmployeeModel employeeModel, int index) {
        List<String> stringList = ReadAndWriteFile.readFile(NAME_FILE);
        stringList.set(index, employeeModel.getInfoToCSV());
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWriteFile.writeFile(NAME_FILE, stringList.get(i), false);
            } else {
                ReadAndWriteFile.writeFile(NAME_FILE, stringList.get(i), true);
            }
        }
    }

    @Override
    public List<EmployeeModel> getEmployee() {
        List<EmployeeModel> employeeModelList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(NAME_FILE);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr = stringList.get(i).split(",");
            employeeModelList.add(new EmployeeModel(arr[0], arr[1], arr[2], Boolean.parseBoolean(arr[3]), arr[4],
                    arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeModelList;
    }
}
