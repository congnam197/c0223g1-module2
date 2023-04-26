package case_study.service;

import case_study.model.Room;

import java.util.Map;

public interface IReadRoom {
    Map<Room,Integer> read();
}
