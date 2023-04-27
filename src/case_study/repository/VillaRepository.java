package case_study.repository;

import case_study.model.Villa;
import case_study.until.file.write_and_read_file.ReadAndWrieFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private static final String FILE_PATH = "src/case_study/until/file/file_csv/villa.csv";

    @Override
    public void addVillaRepository(Villa villa, Integer value) {
        String string = villa.getInfoToCSV() + "," + value;
        ReadAndWrieFile.writeFile(FILE_PATH, string, true);
    }

    @Override
    public Map<Villa, Integer> readVillaRepository() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        int size = ReadAndWrieFile.readFile(FILE_PATH).size();
        List<String> stringList = ReadAndWrieFile.readFile(FILE_PATH);
        for (int i = 0; i < size; i++) {
            String[] arr = stringList.get(i).split(",");
            villaIntegerMap.put(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]),
                    Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6],
                    Double.parseDouble(arr[7]), Integer.parseInt(arr[8])), Integer.parseInt(arr[9]));
        }
        return villaIntegerMap;
    }
}
