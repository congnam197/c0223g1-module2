package case_study.repository.class_repository;

import case_study.model.facility.HouseModel;
import case_study.repository.interface_repository.IHouseRepository;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    private static final String FILE_HOUSE = "src/case_study/until/file/file_csv/house.csv";

    @Override
    public void addHouse(HouseModel houseModel, Integer value) {
        String string = houseModel.getInfoToCSV() + "," + value;
        ReadAndWriteFile.writeFile(FILE_HOUSE, string, true);
    }

    @Override
    public Map<HouseModel, Integer> readHouse() {
        Map<HouseModel, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFile(FILE_HOUSE);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String[] arr = stringList.get(i).split(",");
            HouseModel houseModel = new HouseModel(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
            houseIntegerMap.put(houseModel, Integer.parseInt(arr[8]));
        }
        return houseIntegerMap;
    }
}
