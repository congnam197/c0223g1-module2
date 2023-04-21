package ss16_io_text_file.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static final String FILE_NAME = "src/ss16_io_text_file/demo.csv";

    public static void main(String[] args) {
        String string = "Hello! I'm Studying";
        Demo.writeFile(FILE_NAME, string);
        List<String> result = Demo.readFile(FILE_NAME);
        System.out.println(result);
    }

    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
