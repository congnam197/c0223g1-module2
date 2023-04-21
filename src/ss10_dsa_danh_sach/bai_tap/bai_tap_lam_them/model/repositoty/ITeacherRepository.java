package ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty;

import ss10_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherlist();

    void addNewTeacher(Teacher teacher);

    boolean deleteTeacherById(int id);
}
