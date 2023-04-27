package case_study.repository;

import case_study.model.Villa;

import java.util.Map;

public interface IVillaRepository {
    void addVillaRepository(Villa villa, Integer value);

    Map<Villa, Integer> readVillaRepository();
}
