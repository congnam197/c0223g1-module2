package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.controller;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        StudentService student = new StudentService();
        Scanner sc= new Scanner(System.in);
        int a;
        boolean flag=true;
        System.out.println("--Quản Lý Sinh Viên CodeGym--");
        do {
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm mới  học sinh. \n"+
                    "2.Xóa học sinh. \n"+
                    "3.Xem danh sách học viên. \n"+
                    "4.Thoát");
            System.out.println("Chọn chức năng");
            a=sc.nextInt();
            switch (a){
                case 1:student.addPersonRepository();
                break;
                case 2:student.removePersonRepository();
                break;
                case 3:student.displayPersonRepository();
                break;
                case 4:flag=false;
                break;
                default:
                    System.out.println("Số không tồn tại");
                    break;
            }

        }while (flag);
    }

}