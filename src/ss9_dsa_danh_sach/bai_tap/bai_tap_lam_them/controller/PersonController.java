package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.controller;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.StudentService;
import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.TeacherService;

import java.util.Scanner;

public class PersonController {
    Scanner sc = new Scanner(System.in);
    private StudentService student = new StudentService();
    TeacherService teacher = new TeacherService();

    public void dislayController() {
        boolean check = true;
        do {
            System.out.println("---Quản Lý CodeGym--- \n" +
                    "Nhập lựa chọn \n" +
                    "1. Quản Lý Sinh Viên \n" +
                    "2. Quản Lý Giảng Viên \n" +
                    "3. Thoát");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    studentManagent();
                    break;
                case "2":
                    teacherManager();
                    break;
                case "3":
                    check = false;
                    break;
                default:
                    System.out.println("Không có chức năng");
            }

        } while (check);
    }

    public void studentManagent() {

        boolean flag = true;
        System.out.println("---Quản Lý Học Viên---");
        do {
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm mới  học sinh. \n" +
                    "2. Xóa học sinh. \n" +
                    "3. Xem danh sách học viên. \n" +
                    "4. Thoát");
            System.out.println("Chọn chức năng");
            String choice2 = sc.nextLine();
            switch (choice2) {
                case "1":
                    student.addPersonRepository();
                    break;
                case "2":
                    student.removePersonRepository();
                    break;
                case "3":
                    student.displayPersonRepository();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Số không tồn tại");
                    break;
            }
        } while (flag);
    }

    public void teacherManager() {
        String choice3;
        boolean flag = true;
        System.out.println("--Quản Lý Giảng Viên--");
        do {
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm mới giảng viên. \n" +
                    "2. Xóa giảng viên. \n" +
                    "3. Xem danh sách giảng viên. \n" +
                    "4. Thoát");
            System.out.println("Chọn chức năng");
            choice3 = sc.nextLine();
            switch (choice3) {
                case "1":
                    teacher.addPersonRepository();
                    break;
                case "2":
                    teacher.removePersonRepository();
                    break;
                case "3":
                    teacher.displayPersonRepository();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Số không tồn tại");
                    break;
            }
        } while (flag);
    }
}
