package case_study.repository;

import case_study.model.RoomModel;

import java.util.Map;

public interface IRoomRepository {
    void addRoom(RoomModel roomModel, Integer value);

    Map<RoomModel, Integer> readRoom();
}
