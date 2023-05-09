package demo.mohinh_MVC.controller;

import demo.mohinh_MVC.model.Student;
import demo.mohinh_MVC.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void displayMenu() {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quản lý học sinh");
        boolean flag = true;
        do {
            System.out.println("Nhập 1 lựa chọn để tiếp tục\n" +
                    "1.hiện thị\n" +
                    "2.thêm\n" +
                    "3.sửa\n" +
                    "4.xóa\n" +
                    "5.tìm kiếm thông tin\n" +
                    "0.thoát");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    studentService.display();
                    break;
                case "2":
                    studentService.add();
                    break;
                case "3":
                    studentService.edit();
                    break;
                case "4":
                    studentService.delete();
                    break;
                case "5":
                    studentService.find();
                    break;
                case "0":
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Không có lựa chọn, lựa chọn lại");
                    flag = true;
            }
        } while (flag);
    }
}
