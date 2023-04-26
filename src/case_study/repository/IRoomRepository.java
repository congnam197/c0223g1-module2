package case_study.repository;

import case_study.model.Room;

import java.util.Map;

public interface IRoomRepository {
    void addRoom(Room room, Integer value);

    Map<Room, Integer> readRoom();
}
