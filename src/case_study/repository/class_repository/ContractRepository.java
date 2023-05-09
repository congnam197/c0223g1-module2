package case_study.repository.class_repository;

import case_study.model.ContractModel;
import case_study.repository.interface_repository.IContractRepository;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.LinkedList;
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
            ContractModel contract = new ContractModel(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
            treeSet.add(contract);
        }
        return treeSet;
    }

    @Override
    public void edit(ContractModel contract, int index) {
        List<String> stringList = ReadAndWriteFile.readFile(FILE_CONTRACT);
        stringList.set(index, contract.getInfoToCSV());
        for (int j = 0; j < stringList.size(); j++) {
            if (j == 0) {
                ReadAndWriteFile.writeFile(FILE_CONTRACT, stringList.get(j), false);
            } else {
                ReadAndWriteFile.writeFile(FILE_CONTRACT, stringList.get(j), true);
            }
        }
    }

    public List<ContractModel> getContrat() {
        List<ContractModel> contractModels = new LinkedList<>();
        List<String> stringList = ReadAndWriteFile.readFile(FILE_CONTRACT);
        for (int i = 0; i < stringList.size(); i++) {
            String[] arr = stringList.get(i).split(",");
            ContractModel contract = new ContractModel(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]));
            contractModels.add(contract);
        }
        return contractModels;
    }
}
