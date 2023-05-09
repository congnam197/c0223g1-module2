package case_study.repository.interface_repository;

import case_study.model.facility.HouseModel;

import java.util.Map;

public interface IHouseRepository {
    void addHouse(HouseModel houseModel, Integer value);

    Map<HouseModel, Integer> readHouse();
}
