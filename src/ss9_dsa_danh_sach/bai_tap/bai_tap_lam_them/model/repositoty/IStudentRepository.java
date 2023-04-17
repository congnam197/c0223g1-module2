package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentlist();

    void addNewStudent(Student student);

    boolean deleteStudent(int id);
}
