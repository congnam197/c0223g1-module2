package case_study.service.interface_service;

import case_study.model.facility.RoomModel;

import java.util.Map;

public interface IReadRoom {
    Map<RoomModel,Integer> readRoom();
}
