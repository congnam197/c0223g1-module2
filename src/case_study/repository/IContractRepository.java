package case_study.repository;

import case_study.model.ContractModel;

import java.util.TreeSet;

public interface IContractRepository {
    void add(ContractModel contractModel);

    TreeSet<ContractModel> read();
}
