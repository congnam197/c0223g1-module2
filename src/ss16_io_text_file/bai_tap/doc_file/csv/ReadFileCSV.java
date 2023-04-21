package ss16_io_text_file.bai_tap.doc_file.csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    private static final String FILE_NAME = "src/ss16_io_text_file/bai_tap/doc_file/csv/countries.csv";
    private static final String COMMA = ",";

    public static void main(String[] args) {
        List<Coutries> coutries = ReadFileCSV.readFile(FILE_NAME);
        for (Coutries x : coutries) {
            System.out.println(x);
        }
    }

    public static List<Coutries> readFile(String filePath) {
        List<Coutries> listLine = new ArrayList<>();
        File file = new File(FILE_NAME);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] arr;
            Coutries coutry;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(COMMA);
                coutry = new Coutries(Integer.parseInt(arr[0]), arr[1], arr[2]);
                listLine.add(coutry);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
