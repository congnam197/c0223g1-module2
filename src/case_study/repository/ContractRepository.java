package case_study.repository;

import case_study.model.ContractModel;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.List;
import java.util.TreeSet;

public class ContractRepository implements IContractRepository {
    private final String FILE_CONTRACT = "src/case_study/until/file/file_csv/contract.csv";

    @Override
    public void add(ContractModel contractModel) {
        String string = contractModel.getInfoToCSV();
        ReadAndWriteFile.writeFile(FILE_CONTRACT, string, true);
    }

    @Override
    public TreeSet<ContractModel> read() {
        TreeSet<ContractModel> treeSet = new TreeSet<>();
        List<String> stringList = ReadAndWriteFile.readFile(FILE_CONTRACT);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr = stringList.get(i).split(",");
            ContractModel contract = new ContractModel(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]);
            treeSet.add(contract);
        }
        return treeSet;
    }
}
