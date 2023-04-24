package ss17_io_binary_file.demo;

import java.io.*;

class ObjectStream {
    private static final String FILE_PATH = "src/ss17_io_binary_file/demo/studen.txt";

    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "Nguyen Hai Chau", "16X1A");
        ObjectStream.ojectOutputStream(FILE_PATH, student);
        ObjectStream.objectInput(FILE_PATH, student);
    }

    public static void ojectOutputStream(String filePath, Student student) throws IOException {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Ok");
    }

    public static void objectInput(String filePath, Student student) throws IOException {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
