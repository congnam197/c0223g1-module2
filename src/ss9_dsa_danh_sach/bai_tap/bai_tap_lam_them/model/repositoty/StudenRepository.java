package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudenRepository implements IStudentRepository {
    private static ArrayList<Student> studentList = new ArrayList<>();

    static {
//       Student(int id, String name, String dateOfBirth, boolean gender, String classRoom, double score)
        studentList.add(new Student(1, "Nam", "1997", true, "C0223G1", 7));
        studentList.add(new Student(2, "Kiệt", "1996", true, "C0223G1", 10));
        studentList.add(new Student(3, "Tài", "2000", true, "C0223G1", 9));
    }

    @Override
    public List<Student> getStudentlist() {
        return studentList;
    }

    @Override
    public void addNewStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean deleteStudent(int id) {
        boolean flag = true;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
