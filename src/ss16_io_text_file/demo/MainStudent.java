package ss16_io_text_file.demo;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static final String FILE_NAME = "src/ss16_io_text_file/student.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {
//        OutPut file
        Student student1 = new Student(1, "Nguyễn Thảo Anh", "12A1");
        Student student2 = new Student(2, "Hải Châu", "12A1");
        Student student3 = new Student(3, "Phương Anh", "12A1");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        String line = null;
        for (Student student : studentList) {
            line = student.getId() + COMMA + student.getName() + COMMA + student.getClasses();
            Demo.writeFile(FILE_NAME, line);
        }
//        Input file
        List<String> listLile = Demo.readFile(FILE_NAME);
        System.out.println(listLile);
//        Lấy  ra từng đối tượng
        String[] student = listLile.get(0).split(COMMA);
        Student student4 = new Student(Integer.parseInt(student[0]), student[1], student[2]);
        System.out.println(student4.getId() + " " + student4.getName() + " " + student4.getClasses());
    }
}
