package case_study.service;

import case_study.model.House;

import java.util.Map;

public interface IReadHouse {
    Map<House, Integer> read();
}
