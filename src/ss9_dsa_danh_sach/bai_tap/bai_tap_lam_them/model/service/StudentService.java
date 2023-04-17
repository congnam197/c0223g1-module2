package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.Student;
import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty.IPersonRepository;
import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty.IStudentRepository;
import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.repositoty.StudenRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonRepository {
    private IStudentRepository studentRepository = new StudenRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addPersonRepository() {
        System.out.println("Nhập mã học sinh");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên học sinh");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("Chon gioi tinh \n" +
                "1. Nam \n" +
                "2. Nữ \n");
        boolean gender = false;
        String chooseGender = sc.nextLine();
        if (chooseGender.equals("1")) {
            gender = true;
        } else if (chooseGender.equals("2")) {
            gender = false;
        }
        System.out.println("Nhập lớp:");
        String classroom = sc.nextLine();
        System.out.println("Nhập điểm");
        double score = sc.nextDouble();
        Student student = new Student(id, name, dateOfBirth, gender, classroom, score);
        studentRepository.addNewStudent(student);
    }

    @Override
    public void displayPersonRepository() {
        List<Student> studentList = studentRepository.getStudentlist();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removePersonRepository() {
        this.displayPersonRepository();
        System.out.println("Nhập mã học viên muốn xóa");
        int idStudent = Integer.parseInt(sc.nextLine());
        boolean isDeleteStudent = studentRepository.deleteStudent(idStudent);
        if (isDeleteStudent) {
            for (int i = 0; i < studentRepository.getStudentlist().size(); i++) {
                if (idStudent == studentRepository.getStudentlist().get(i).getId()) {
                    studentRepository.getStudentlist().remove(i);
                    System.out.println("Đã xóa thành công học viên ");
                    break;
                } else {
                    System.out.println("Không tìm thấy mã học sinh");
                }
            }
        } else {
            System.out.println("Không xóa");
        }
    }
}
