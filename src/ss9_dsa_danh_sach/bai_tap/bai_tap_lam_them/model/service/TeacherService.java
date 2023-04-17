package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Teacher;
import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    Scanner sc = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void addPersonRepository() {
        System.out.println("Nhập mã giảng viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên giảng viên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("Chọn giới tính: \n" +
                "1.Nam\n" +
                "2.Nữ\n");
        boolean gender = false;
        String choiceGender = sc.nextLine();
        if (choiceGender.equals("1")) {
            gender = true;
        } else if (choiceGender.equals("2")) {
            gender = false;
        } else {
            System.out.println("Nhập sai vui lòng nhập lại");
        }
        System.out.println("Nhập chuyên môn:");
        String teachnical = sc.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, teachnical);
        teacherRepository.addNewTeacher(teacher);
    }

    @Override
    public void displayPersonRepository() {
        List<Teacher> teacherList = teacherRepository.getTeacherlist();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removePersonRepository() {
        this.displayPersonRepository();
        System.out.println("Nhập id của giảng viên muốn xóa");
        int idOfTeacher = Integer.parseInt(sc.nextLine());
        boolean isDelete = teacherRepository.deleteTeacherById(idOfTeacher);
        if (isDelete) {
            for (int i = 0; i < teacherRepository.getTeacherlist().size(); i++) {
                if (idOfTeacher == teacherRepository.getTeacherlist().get(i).getId()) {
                    teacherRepository.getTeacherlist().remove(i);
                    break;
                } else {
                    System.out.println("Id Không tìm thấy!");
                }
            }
            System.out.println("Xóa thành công! Giảng viên ");
        } else {
            System.out.println("Giảng viên chưa được xóa");
        }
    }
}
