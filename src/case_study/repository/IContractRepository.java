package case_study.repository;

import case_study.model.Contract;

import java.util.TreeSet;

public interface IContractRepository {
    void add(Contract contract);

    TreeSet<Contract> read();
}
