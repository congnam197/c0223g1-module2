package case_study.repository;

import case_study.model.Villa;

import java.util.Map;

public interface IVillaRepository {
    void addVilla(Villa villa, Integer value);

    Map<Villa, Integer> readVilla();
}
