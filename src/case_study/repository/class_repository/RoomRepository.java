package case_study.repository.class_repository;

import case_study.model.facility.RoomModel;
import case_study.repository.interface_repository.IRoomRepository;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private static final String FILE_PATH = "src/case_study/until/file/file_csv/room.csv";

    @Override
    public void addRoom(RoomModel roomModel, Integer value) {
        String string = roomModel.getInfoToCSV() + "," + value;
        ReadAndWriteFile.writeFile(FILE_PATH, string, true);
    }

    @Override
    public Map<RoomModel, Integer> readRoom() {
        Map<RoomModel, Integer> roomIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFile(FILE_PATH);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String[] arr = stringList.get(i).split(",");
            RoomModel roomModel = new RoomModel(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6]);
            roomIntegerMap.put(roomModel, Integer.parseInt(arr[7]));
        }
        return roomIntegerMap;
    }
}
