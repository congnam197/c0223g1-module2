package case_study.repository;

import case_study.model.VillaModel;

import java.util.Map;

public interface IVillaRepository {
    void addVillaRepository(VillaModel villaModel, Integer value);

    Map<VillaModel, Integer> readVillaRepository();
}
