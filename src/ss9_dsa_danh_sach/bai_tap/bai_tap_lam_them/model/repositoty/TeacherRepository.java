package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.object.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static ArrayList<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "Nguyễn Thảo Linh", "1990", false, "Tài Chính Ngân Hàng"));
        teacherList.add(new Teacher(2, "Sơn Tùng MTP", "1994", true, "Âm Nhạc"));
        teacherList.add(new Teacher(3, "Cristiano Ronaldo", "1985", true, "Bóng Đá"));
    }

    @Override
    public List<Teacher> getTeacherlist() {
        return teacherList;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public boolean deleteTeacherById(int id) {
        boolean flag = true;
        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
