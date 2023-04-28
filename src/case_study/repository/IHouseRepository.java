package case_study.repository;

import case_study.model.HouseModel;

import java.util.Map;

public interface IHouseRepository {
    void addHouse(HouseModel houseModel, Integer value);

    Map<HouseModel, Integer> readHouse();
}
