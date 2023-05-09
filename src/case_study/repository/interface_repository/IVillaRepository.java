package case_study.repository.interface_repository;

import case_study.model.facility.VillaModel;

import java.util.Map;

public interface IVillaRepository {
    void addVillaRepository(VillaModel villaModel, Integer value);

    Map<VillaModel, Integer> readVillaRepository();
}
