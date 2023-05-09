package demo.mohinh_MVC.repository;

import demo.mohinh_MVC.model.Student;
import demo.mohinh_MVC.util.ReadAndWrite.WriteAndReadFile;

import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final String FILE_PATH = "src/demo/mohinh_MVC/util/file_CSV/student.csv";
    List<Student> studentList = WriteAndReadFile.readFile(FILE_PATH);

    @Override
    public List<Student> getStudent() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        WriteAndReadFile.writeFile(FILE_PATH, studentList);
    }

    @Override
    public boolean deleteByID(String idStudent) {
        int index = findID(idStudent);
        if (index != 1) {
            studentList.remove(index);
            WriteAndReadFile.writeFile(FILE_PATH,studentList);
            return true;
        }
        return false;
    }

    @Override
    public void edit(int index, Student student) {
        studentList.set(index, student);
        WriteAndReadFile.writeFile(FILE_PATH, studentList);
    }

    @Override
    public int findID(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getCodeStudent())) {
                return i;
            }
        }
        return -1;
    }
}
