package case_study.repository.interface_repository;

import case_study.model.ContractModel;

import java.util.TreeSet;

public interface IContractRepository {
    void add(ContractModel contractModel);

    TreeSet<ContractModel> read();
    void edit(ContractModel contract,int index);
}
