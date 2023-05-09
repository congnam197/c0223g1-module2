package demo.mohinh_MVC.service;

import demo.mohinh_MVC.model.Student;
import demo.mohinh_MVC.repository.IStudentRepository;
import demo.mohinh_MVC.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    IStudentRepository studentRepository = new StudentRepository();
    List<Student> list = studentRepository.getStudent();

    @Override
    public void display() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id học sinh cần sửa");
        String codeEdit = scanner.nextLine();
        int index = studentRepository.findID(codeEdit);
        if (index != -1) {
            System.out.println("Thông tin :"+list.get(index));
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            System.out.println("Nhập tên lớp");
            String classes = scanner.nextLine();
            boolean gender = false;
            boolean flag;
            do {
                System.out.println("Chọn giới tính\n" +
                        "1.Nam\n" +
                        "2.Nữ");
                String chon = scanner.nextLine();
                switch (chon) {
                    case "1":
                        gender = true;
                        flag = false;
                        break;
                    case "2":
                        gender = false;
                        flag = false;
                        break;
                    default:
                        System.out.println("không có lựa chọn, nhập llaij");
                        flag = true;
                }
            } while (flag);
            System.out.println("Nhập sdt");
            int numberPhone = Integer.parseInt(scanner.nextLine());
            Student student = new Student(codeEdit, name, classes, gender, numberPhone);
            studentRepository.edit(index, student);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id");
        String id=scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tên lớp");
        String classes = scanner.nextLine();
        boolean gender = false;
        boolean flag;

        do {
            System.out.println("Chọn giới tính\n" +
                    "1.Nam\n" +
                    "2.Nữ");
            String chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    gender = true;
                    flag = false;
                    break;
                case "2":
                    gender = false;
                    flag = false;
                    break;
                default:
                    System.out.println("không có lựa chọn, nhập llaij");
                    flag = true;
            }
        } while (flag);
        System.out.println("Nhập sdt");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, classes, gender, numberPhone);
        studentRepository.add(student);
        System.out.println("đã thêm thành công");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id cần xóa");
        String id = scanner.nextLine();
        boolean check = studentRepository.deleteByID(id);
        if (check) {
            System.out.println("Đã xóa thành công");
            this.display();
        } else {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void find() {
        System.out.println("Nhập id cần tìm");
        String id = scanner.nextLine();
        int index = studentRepository.findID(id);
        if (index != -1) {
            System.out.println(list.get(index));
        } else {
            System.out.println("không tìm thấy");
        }
    }
}
