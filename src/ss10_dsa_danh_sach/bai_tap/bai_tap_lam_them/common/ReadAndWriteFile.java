package ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.common;

import ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Person;
import ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Student> readFileStudent(String filePath) {
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
                student = new Student(Integer.parseInt(arr[0]), arr[1], arr[2], Boolean.parseBoolean(arr[3]), arr[4], Double.parseDouble(arr[5]));
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

    public static void writeFile(String filePath, String string) {
        File file1 = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file1, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
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
