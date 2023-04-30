package case_study.service;

import case_study.model.HouseModel;

import java.util.Map;

public interface IReadHouse{
    Map<HouseModel, Integer> readHouse();
}
