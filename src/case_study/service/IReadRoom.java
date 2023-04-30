package case_study.service;

import case_study.model.RoomModel;

import java.util.Map;

public interface IReadRoom {
    Map<RoomModel,Integer> readRoom();
}
