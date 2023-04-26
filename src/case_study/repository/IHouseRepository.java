package case_study.repository;

import case_study.model.House;

import java.util.Map;

public interface IHouseRepository {
    void addHouse(House house, Integer value);

    Map<House, Integer> readHouse();
}
