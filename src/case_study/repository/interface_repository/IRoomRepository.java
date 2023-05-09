package case_study.repository.interface_repository;

import case_study.model.facility.RoomModel;

import java.util.Map;

public interface IRoomRepository {
    void addRoom(RoomModel roomModel, Integer value);

    Map<RoomModel, Integer> readRoom();
}
