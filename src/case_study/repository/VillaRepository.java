package case_study.repository;

import case_study.model.VillaModel;
import case_study.until.file.write_and_read_file.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private static final String FILE_PATH = "src/case_study/until/file/file_csv/villa.csv";

    @Override
    public void addVillaRepository(VillaModel villaModel, Integer value) {
        String string = villaModel.getInfoToCSV() + "," + value;
        ReadAndWriteFile.writeFile(FILE_PATH, string, true);
    }

    @Override
    public Map<VillaModel, Integer> readVillaRepository() {
        Map<VillaModel, Integer> villaIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFile(FILE_PATH);
        int size = stringList.size();
        for (int i = 0; i < size; i++) {
            String[] arr = stringList.get(i).split(",");
            villaIntegerMap.put(new VillaModel(arr[0], arr[1], Double.parseDouble(arr[2]),
                    Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6],
                    Double.parseDouble(arr[7]), Integer.parseInt(arr[8])), Integer.parseInt(arr[9]));
        }
        return villaIntegerMap;
    }
}
