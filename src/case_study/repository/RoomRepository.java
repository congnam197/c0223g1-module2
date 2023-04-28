package case_study.repository;

import case_study.model.RoomModel;
import case_study.until.file.write_and_read_file.ReadAndWrieFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private static final String FILE_PATH = "src/case_study/until/file/file_csv/room.csv";

    @Override
    public void addRoom(RoomModel roomModel, Integer value) {
        String string = roomModel.getInfoToCSV() + "," + value;
        ReadAndWrieFile.writeFile(FILE_PATH, string, true);
    }

    @Override
    public Map<RoomModel, Integer> readRoom() {
        Map<RoomModel, Integer> roomIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWrieFile.readFile(FILE_PATH);
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
