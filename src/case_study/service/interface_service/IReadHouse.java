package case_study.service.interface_service;

import case_study.model.facility.HouseModel;

import java.util.Map;

public interface IReadHouse{
    Map<HouseModel, Integer> readHouse();
}
