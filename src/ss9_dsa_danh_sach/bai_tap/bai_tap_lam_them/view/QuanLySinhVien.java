package ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.view;

import ss9_dsa_danh_sach.bai_tap.bai_tap_lam_them.model.service.StudentService;

public class QuanLySinhVien {
    public static void main(String[] args) {
        StudentService studentService= new StudentService();
        studentService.displayPersonRepository();
    }
}
