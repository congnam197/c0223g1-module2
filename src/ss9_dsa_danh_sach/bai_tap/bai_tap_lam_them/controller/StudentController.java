package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.controller;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.StudentService;

import java.util.Scanner;

public class StudentController {
    static Scanner sc = new Scanner(System.in);
    static StudentService student = new StudentService();

    public static void dislayController() {
        boolean check = true;
        do {
            System.out.println("Nhập lựa chọn \n" +
                    "1. StudenManagent \n" +
                    "2. TaeacherManagent \n" +
                    "3. Exit");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    studentManagent();

                    break;
                case 2:
                    teacherManager();
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("Không có chức năng");
            }

        } while (check);
    }

    public static void studentManagent() {
        int a;
        boolean flag = true;
        System.out.println("--Quản Lý  CodeGym--");
        do {
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm mới  học sinh. \n" +
                    "2.Xóa học sinh. \n" +
                    "3.Xem danh sách học viên. \n" +
                    "4.Thoát");
            System.out.println("Chọn chức năng");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    student.addPersonRepository();
                    break;
                case 2:
                    student.removePersonRepository();
                    break;
                case 3:
                    student.displayPersonRepository();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Số không tồn tại");
                    break;
            }

        } while (flag);
    }

    public static void teacherManager() {
        int a;
        boolean flag = true;
        System.out.println("--Quản Lý  CodeGym--");
        do {
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm mới giảng viên. \n" +
                    "2.Xóa giảng viên. \n" +
                    "3.Xem danh sách giảng viên. \n" +
                    "4.Thoát");
            System.out.println("Chọn chức năng");
            a = sc.nextInt();
            switch (a) {
                case 1:
//                    thêm mới giảng viên
                    break;
                case 2:
//                    xóa giảng viên
                    break;
                case 3:
//                   xem danh sách giảng viên
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Số không tồn tại");
                    break;
            }

        } while (flag);
    }
}
