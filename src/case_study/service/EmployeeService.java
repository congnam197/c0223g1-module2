package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.until.file.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IService {
    Scanner scanner = new Scanner(System.in);
    EmployeeRepository employeeRepository = new EmployeeRepository();
    static List<Employee> employeeList = new ArrayList<>();

    public void read() {
        employeeList = employeeRepository.getEmployee();
    }

    @Override
    public void add() {
        read();
        String code;
        boolean check;
        do {
            do {
                System.out.println("Thêm mã nhân viên mới");
                code = scanner.nextLine();
            } while (!Regex.checkCodePerson(code));
            check = false;
            for (int i = 0; i < employeeList.size(); i++) {
                if (code.equals(employeeList.get(i).getCode())) {
                    System.out.println("mã đã tồn tại,mời nhập lại");
                    check = true;
                }
                break;
            }
        } while (check);
        String name;
        do {
            System.out.println("Nhập tên nhân viên");
            name = scanner.nextLine();
        } while (!Regex.checkNamePerson(name));
        System.out.println("Nhập ngày sinh (dd/mm/yyyy)");
        String dayBirth = scanner.nextLine();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        String idNumber1;
        do {
            System.out.println("Số CMND/CCCD");
            idNumber1 = (scanner.nextLine());
        } while (!Regex.checkIdCard(idNumber1));
        int idNumber = Integer.parseInt(idNumber1);
        String numPhone = null;
        do {
            System.out.println("Số điện thoại");
            numPhone = scanner.nextLine();
        } while (!Regex.checkNumberPhone(numPhone));
        int numberPhone = Integer.parseInt(numPhone);
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Trình độ");
        boolean flag1 = true;
        String level = "";
        do {
            System.out.println("1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau Đại học");
            String choice1 = scanner.nextLine();
            switch (choice1) {
                case "1":
                    level = "Trung cấp";
                    flag1 = false;
                    break;
                case "2":
                    level = "Cao đẳng";
                    flag1 = false;
                    break;
                case "3":
                    level = "Đại học";
                    flag1 = false;
                    break;
                case "4":
                    level = "Sau Đại học";
                    flag1 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, mời nhập đúng lựa chọn");
                    flag1 = true;
            }
        } while (flag1);
        System.out.println("vị trí");
        boolean flag2 = true;
        String position = "";
        do {
            System.out.println("1. Lễ tân\n" +
                    "2. phục vụ\n" +
                    "3. chuyên viên\n" +
                    "4. giám sát\n" +
                    "5. quản lý\n" +
                    "6. giám đốc");
            String choice2 = scanner.nextLine();
            switch (choice2) {
                case "1":
                    position = "Lễ tân";
                    flag2 = false;
                    break;
                case "2":
                    position = "phục vụ";
                    flag2 = false;
                    break;
                case "3":
                    position = "chuyên viên";
                    flag2 = false;
                    break;
                case "4":
                    position = "giám sát";
                    flag2 = false;
                    break;
                case "5":
                    position = "quản lý";
                    flag2 = false;
                    break;
                case "6":
                    position = "giám đốc";
                    flag2 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, mời nhập đúng lựa chọn");
                    flag2 = true;
            }
        } while (flag2);
        double salary;
        do {
            System.out.println("nhập lương");
            salary = scanner.nextDouble();
        } while (salary < 0);
        Employee employee = new Employee(code, name, dayBirth, gender, idNumber, numberPhone, email, level, position, salary);
        employeeList.add(employee);
        employeeRepository.add(employee);
        System.out.println("đã thêm thành công");
    }

    @Override
    public void display() {
        read();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void edit() {
        read();
        display();
        System.out.println("Nhập mã  nhân viên muốn sửa");
        String code1 = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (code1.equals(employeeList.get(i).getCode())) {
                System.out.println("Thông tin nhân viên  đc tìm thấy " + employeeList.get(i));
                System.out.println("Thêm mã nhân viên mới");
                boolean check;
                String code;
                do {
                    code = scanner.nextLine();
                    if (Regex.checkCodePerson(code)) {
                        check = false;
                    } else {
                        System.out.println("Chưa đúng định dạng, mời nhập lại");
                        check = true;
                    }
                    for (int j = 0; j < employeeList.size(); j++) {
                        if (employeeList.get(j).getCode().equals(code)) {
                            System.out.println("mã đã tồn tại, mới nhập lại");
                            check = true;
                        }
                        break;
                    }
                } while (check);
                String name;
                do {
                    System.out.println("Nhập tên nhân viên");
                    name = scanner.nextLine();
                } while (!Regex.checkNamePerson(name));
                boolean check2;
                System.out.println("Nhập ngày sinh (dd/mm/yyyy)");
                String dayBirth;
                do {
                    dayBirth = scanner.nextLine();
                    if (Regex.checkAge(dayBirth)) {
                        if (Regex.checkUnderAge(dayBirth)) {
                            check2 = false;
                            System.out.println("Đã trên 18 tuổi");

                        } else {
                            System.out.println("Chưa đủ 18 tuổi ,Vui Lòng Xác Nhận  lại");
                            check2 = true;
                        }
                    } else {
                        System.out.println("Không đúng định dạng, hãy nhập lại");
                        check2 = true;
                    }
                } while (check2);

                System.out.println("Giới tính");
                String gender = scanner.nextLine();
                String idNumber1;
                do {
                    System.out.println("Số CMND/CCCD");
                    idNumber1 = scanner.nextLine();
                } while (!Regex.checkIdCard(idNumber1));
                int idNumber = Integer.parseInt(idNumber1);
                String numberPhone1 = null;
                do {
                    try {
                        System.out.println("Số điện thoại");
                        numberPhone1 = scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("chỉ nhập số và nhập dưới 12 số");
                    }
                } while (!Regex.checkNumberPhone(numberPhone1));
                int numberPhone = Integer.parseInt(numberPhone1);
                System.out.println("Email");
                String email = scanner.nextLine();
                System.out.println("Trình độ");
                boolean flag1 = true;
                String level = "";
                do {
                    System.out.println("1. Trung cấp\n" +
                            "2. Cao đẳng\n" +
                            "3. Đại học\n" +
                            "4. Sau Đại học");
                    String choice1 = scanner.nextLine();
                    switch (choice1) {
                        case "1":
                            level = "Trung cấp";
                            flag1 = false;
                            break;
                        case "2":
                            level = "Cao đẳng";
                            flag1 = false;
                            break;
                        case "3":
                            level = "Đại học";
                            flag1 = false;
                            break;
                        case "4":
                            level = "Sau Đại học";
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Không có lựa chọn này, mời nhập đúng lựa chọn");
                    }
                } while (flag1);
                System.out.println("vị trí");
                boolean flag2 = true;
                String position = "";
                do {
                    System.out.println("1. Lễ tân\n" +
                            "2. phục vụ\n" +
                            "3. chuyên viên\n" +
                            "4. giám sát\n" +
                            "5. quản lý\n" +
                            "6. giám đốc");
                    String choice2 = scanner.nextLine();
                    switch (choice2) {
                        case "1":
                            position = "Lễ tân";
                            flag2 = false;
                            break;
                        case "2":
                            position = "phục vụ";
                            flag2 = false;
                            break;
                        case "3":
                            position = "chuyên viên";
                            flag2 = false;
                            break;
                        case "4":
                            position = "giám sát";
                            flag2 = false;
                            break;
                        case "5":
                            position = "quản lý";
                            flag2 = false;
                            break;
                        case "6":
                            position = "giám đốc";
                            flag2 = false;
                            break;
                        default:
                            System.out.println("Không có lựa chọn này, mời nhập đúng lựa chọn");
                    }
                } while (flag2);
                double salary;
                do {
                    System.out.println("nhập lương");
                    salary = scanner.nextDouble();
                } while (salary > 0);

                Employee employee = new Employee(code, name, dayBirth, gender, idNumber, numberPhone, email, level, position, salary);
                employeeRepository.edit(employee, i);
                System.out.println("Sửa thành công");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Mã nhân viên không tồn tại");
        }
    }
}
