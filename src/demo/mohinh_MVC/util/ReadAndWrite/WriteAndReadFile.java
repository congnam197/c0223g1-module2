package demo.mohinh_MVC.util.ReadAndWrite;

import demo.mohinh_MVC.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {
    public static List<Student> readFile(String filePath) {
        List<Student> studentList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            String[] arr;
            Student student;
            while ((temp = bufferedReader.readLine()) != null) {
                arr = temp.split(",");
                student = new Student(arr[0], arr[1], arr[2], Boolean.parseBoolean(arr[3]), Integer.parseInt(arr[4]));
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    public static void writeFile(String filePath, List<Student> studentList) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : studentList) {
                bufferedWriter.write(s.getToFileCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
