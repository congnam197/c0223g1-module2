package demo.mohinh_MVC.repository;

import demo.mohinh_MVC.model.Student;
import ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.StudentService;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudent();

    void add(Student student);

    boolean deleteByID(String IDstudent);

    void edit(int index, Student student);

    int findID(String id);
}
