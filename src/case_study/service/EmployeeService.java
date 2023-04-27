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
                System.out.print("Thêm mã nhân viên mới ");
                code = scanner.nextLine();
            } while (!Regex.checkCodeEmployee(code));
            check = false;
            for (int i = 0; i < employeeList.size(); i++) {
                if (code.equals(employeeList.get(i).getCode())) {
                    System.out.print("mã đã tồn tại,mời nhập lại ");
                    check = true;
                }
                break;
            }
        } while (check);
        String name;
        do {
            System.out.print("Nhập tên nhân viên ");
            name = scanner.nextLine();
        } while (!Regex.checkNamePerson(name));
        boolean check2;
        System.out.print("Nhập ngày sinh (yyyy-MM-dd) ");
        String dayBirth;
        do {
            dayBirth = scanner.nextLine();
            if (Regex.checkAge(dayBirth)) {
                if (Regex.checkUnderAge(dayBirth)) {
                    check2 = false;
                    System.out.println("Đã trên 18 tuổi ");
                } else {
                    System.out.print("Chưa đủ 18 tuổi ,Vui Lòng Xác Nhận  lại ");
                    check2 = true;
                }
            } else {
                System.out.print("Không đúng định dạng, hãy nhập lại ");
                check2 = true;
            }
        } while (check2);
        System.out.print("Giới tính " +
                "1.Nam " +
                "2.Nữ ");
        boolean check3;
        boolean gender = false;
        do {
            String checkGender = scanner.nextLine();
            if (checkGender.equals("1")){
                gender=true;
                check3=false;
            }else  if (checkGender.equals("2")){
                gender=false;
                check3=false;
            }else {
                System.out.print("lựa chọn sai, mời chọn lại ");
                check3=true;
            }
        }while (check3);
        boolean check4;
        System.out.print("Số CMND/CCCD ");
        String idNumber;
        do {
            idNumber = scanner.nextLine();
            if (Regex.checkIdCard(idNumber)) {
                check4 = false;
            } else {
                check4 = true;
                System.out.print("Chưa đúng định dạng, vui lòng nhập lại ");
            }
        } while (check4);
        System.out.print("Số điện thoại ");
        String numPhone = null;
        boolean check5;
        do {
            numPhone = scanner.nextLine();
            if (Regex.checkNumberPhone(numPhone)){
                check5=false;
            }else {
                System.out.print("Nhập chưa đúng, vui lòng nhập lại ");
                check5=true;
            }

        } while (check5);
        System.out.print("Email ");
        String email = scanner.nextLine();
        System.out.print("Trình độ ");
        boolean flag1 = true;
        String level = "";
        do {
            System.out.println("1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau Đại học ");
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
                    System.out.print("Không có lựa chọn này, mời nhập đúng lựa chọn ");
                    flag1 = true;
            }
        } while (flag1);
        System.out.print("Vị trí ");
        boolean flag2 = true;
        String position = "";
        do {
            System.out.println("1. Lễ tân\n" +
                    "2. phục vụ\n" +
                    "3. chuyên viên\n" +
                    "4. giám sát\n" +
                    "5. quản lý\n" +
                    "6. giám đốc ");
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
                    System.out.println("Không có lựa chọn này, mời nhập đúng lựa chọn ");
                    flag2 = true;
            }
        } while (flag2);
        double salary;
        do {
            System.out.print("nhập lương ");
            salary = scanner.nextDouble();
        } while (salary < 0);
        Employee employee = new Employee(code, name, dayBirth, gender, idNumber, numPhone, email, level, position, salary);
        employeeList.add(employee);
        employeeRepository.add(employee);
        System.out.print("đã thêm thành công ");
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
        System.out.print("Nhập mã  nhân viên muốn sửa ");
        String code1 = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (code1.equals(employeeList.get(i).getCode())) {
                System.out.print("Thông tin nhân viên  đc tìm thấy " + employeeList.get(i));
                System.out.print("Thêm mã nhân viên mới ");
                boolean check;
                String code;
                do {
                    code = scanner.nextLine();
                    if (Regex.checkCodeEmployee(code)) {
                        check = false;
                    } else {
                        System.out.print("Chưa đúng định dạng, mời nhập lại ");
                        check = true;
                    }
                    for (int j = 0; j < employeeList.size(); j++) {
                        if (employeeList.get(j).getCode().equals(code)) {
                            System.out.print("mã đã tồn tại, mới nhập lại ");
                            check = true;
                        }
                        break;
                    }
                } while (check);
                String name;
                do {
                    System.out.print("Nhập tên nhân viên ");
                    name = scanner.nextLine();
                } while (!Regex.checkNamePerson(name));
                boolean check2;
                System.out.print("Nhập ngày sinh (yyyy-MM-dd) ");
                String dayBirth;
                do {
                    dayBirth = scanner.nextLine();
                    if (Regex.checkAge(dayBirth)) {
                        if (Regex.checkUnderAge(dayBirth)) {
                            check2 = false;
                            System.out.print("Đã trên 18 tuổi ");

                        } else {
                            System.out.print("Chưa đủ 18 tuổi ,Vui Lòng Xác Nhận  lại ");
                            check2 = true;
                        }
                    } else {
                        System.out.print("Không đúng định dạng, hãy nhập lại ");
                        check2 = true;
                    }
                } while (check2);

                System.out.print("Giới tính " +
                        "1.Nam " +
                        "2.Nữ ");
                boolean check3;
                boolean gender = false;
                do {
                    String checkGender = scanner.nextLine();
                    if (checkGender.equals("1")){
                        gender=true;
                        check3=false;
                    }else  if (checkGender.equals("2")){
                        gender=false;
                        check3=false;
                    }else {
                        System.out.print("lựa chọn sai, mời chọn lại ");
                        check3=true;
                    }
                }while (check3);
                String idNumber;
                do {
                    System.out.print("Số CMND/CCCD ");
                    idNumber = scanner.nextLine();
                } while (!Regex.checkIdCard(idNumber));
                String numberPhone = null;
                do {
                    try {
                        System.out.print("Số điện thoại ");
                        numberPhone = scanner.nextLine();
                    } catch (Exception e) {
                        System.out.print("chỉ nhập số  ");
                    }
                } while (!Regex.checkNumberPhone(numberPhone));

                System.out.print("Email ");
                String email = scanner.nextLine();
                System.out.print("Trình độ ");
                boolean flag1 = true;
                String level = "";
                do {
                    System.out.println("1. Trung cấp\n" +
                            "2. Cao đẳng\n" +
                            "3. Đại học\n" +
                            "4. Sau Đại học ");
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
                            System.out.print("Không có lựa chọn này, mời nhập đúng lựa chọn");
                    }
                } while (flag1);
                System.out.print("Vị trí ");
                boolean flag2 = true;
                String position = "";
                do {
                    System.out.println("1. Lễ tân\n" +
                            "2. phục vụ\n" +
                            "3. chuyên viên\n" +
                            "4. giám sát\n" +
                            "5. quản lý\n" +
                            "6. giám đốc ");
                    String choice2 = scanner.nextLine();
                    switch (choice2) {
                        case "1":
                            position = "Lễ tân";
                            flag2 = false;
                            break;
                        case "2":
                            position = "Phục vụ";
                            flag2 = false;
                            break;
                        case "3":
                            position = "Chuyên viên";
                            flag2 = false;
                            break;
                        case "4":
                            position = "Giám sát";
                            flag2 = false;
                            break;
                        case "5":
                            position = "Quản lý";
                            flag2 = false;
                            break;
                        case "6":
                            position = "Giám đốc";
                            flag2 = false;
                            break;
                        default:
                            System.out.print("Không có lựa chọn này, mời nhập đúng lựa chọn ");
                    }
                } while (flag2);
                double salary;
                do {
                    System.out.print("Nhập lương ");
                    salary = scanner.nextDouble();
                } while (salary > 0);

                Employee employee = new Employee(code, name, dayBirth, gender, idNumber, numberPhone, email,
                        level, position, salary);
                employeeRepository.edit(employee, i);
                System.out.println("Sửa thành công ");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Mã nhân viên không tồn tại ");
        }
    }
}
