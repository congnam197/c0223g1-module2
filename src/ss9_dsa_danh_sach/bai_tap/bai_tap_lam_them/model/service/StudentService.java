package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.object.Student;
import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty.IPersonRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IPersonRepository {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addPersonRepository() {
        System.out.println("Nhập mã học sinh");
        String id = sc.nextLine();
        System.out.println("Nhập tên học sinh");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập lớp:");
        String classroom = sc.nextLine();
        System.out.println("Nhập điểm");
        double score = sc.nextDouble();
        Student student = new Student(id, name, dateOfBirth, gender, classroom, score);
        studentArrayList.add(student);
    }

    @Override
    public void displayPersonRepository() {
        System.out.println(studentArrayList);
    }

    @Override
    public void removePersonRepository() {
        System.out.println("Nhập mã học viên muốn xóa");
        String nameStudent = sc.nextLine();
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (nameStudent.equals(studentArrayList.get(i).getName())) {
                studentArrayList.remove(i);
                System.out.println("đã xóa thành công");
            }
        }
    }
}
