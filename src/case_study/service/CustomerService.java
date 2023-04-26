package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.until.file.regex.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements IService {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    static List<Customer> customerList = new LinkedList<>();

    public void read() {
        customerList = customerRepository.getCustomer();
    }

    public List<Customer> returnList() {
        read();
        return customerList;
    }

    @Override
    public void add() {
        read();
        System.out.println("Nhập mã khách hàng");
        boolean check;
        String code = null;
        do {
            if (Regex.checkCodePerson(code) == false) {
                System.out.println("Mã phải đúng định dạng, vui lòng nhập lại");
                check = true;
            } else {
                code = scanner.nextLine();
                check = false;
            }
            for (int i = 0; i < customerList.size(); i++) {
                if (code == customerList.get(i).getCode()) {
                    System.out.println("mã đã tồn tại, mới nhập lại");
                    check = true;
                }
            }
        } while (check);
        boolean check1;
        System.out.println("Nhập tên khách hàng");
        String name = null;
        do {
            if (Regex.checkNamePerson(name)) {
                name = scanner.nextLine();
                check1 = false;
            } else {
                System.out.println("Tên phải đúng định dạng, vui lòng nhập lại");
                check1 = false;
            }
        } while (check1);
        System.out.println("Nhập ngày sinh (dd/mm/yyyy)");
        String dayBirth;
        boolean check2;
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

        System.out.println("Số CMND/CCCD");
        boolean check3;
        String idNumber1 = null;
        do {
            if (Regex.checkIdCard(idNumber1)) {
                idNumber1 = scanner.nextLine();
                check3 = false;
            } else {
                check3 = true;
                System.out.println("Chưa đúng định dạng, vui lòng nhập lại");
            }
        } while (check3);
        int idNumber = Integer.parseInt(idNumber1);
        boolean check4;
        System.out.println("Số điện thoại");
        String numberPhone1 = null;
        do {
            if (Regex.checkNumberPhone(numberPhone1)) {
                numberPhone1 = scanner.nextLine();
                check4 = false;
            } else {
                System.out.println("Chưa đúng định dạng, vui lòng nhập lại");
                check4 = true;
            }
        } while (check4);
        int numberPhone = Integer.parseInt(numberPhone1);
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Chọn loại khách hàng");
        boolean flag;
        String typeOfGuest = "";
        do {
            System.out.print(
                    "1. Diamond\n" +
                            "2. Platinium\n" +
                            "3. Gold\n" +
                            "4. Silver\n" +
                            "5. Member");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    typeOfGuest = "Diamond";
                    flag = false;
                    break;
                case "2":
                    typeOfGuest = "Platinium";
                    flag = false;
                    break;
                case "3":
                    typeOfGuest = "Gold";
                    flag = false;
                    break;
                case "4":
                    typeOfGuest = "Silver";
                    flag = false;
                    break;
                case "5":
                    typeOfGuest = "Member";
                    flag = false;
                    break;
                default:
                    System.out.println("Không có loại khách hàng này, mời chọn đúng");
                    flag = true;
            }
        } while (flag);
        System.out.println("Address");
        String address = scanner.nextLine();
        Customer customer = new Customer(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
        customerRepository.add(customer);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display() {
        read();
        for (Customer cs : customerList) {
            System.out.println(cs);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã khách hàng muốn sửa");
        String editCode = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCode().equals(editCode)) {
                System.out.println("Thông tin  khách hàng  " + customerList.get(i));
                boolean check;
                String code = null;
                do {
                    if (Regex.checkCodePerson(code) == false) {
                        System.out.println("Mã phải đúng định dạng, vui lòng nhập lại");
                        check = true;
                    } else {
                        code = scanner.nextLine();
                        check = false;
                    }
                    for (int j = 0; j < customerList.size(); j++) {
                        if (code == customerList.get(j).getCode()) {
                            System.out.println("mã đã tồn tại, mới nhập lại");
                            check = true;
                        }
                    }
                } while (check);
                boolean check1;
                System.out.println("Nhập tên khách hàng");
                String name = null;
                do {
                    if (Regex.checkNamePerson(name)) {
                        name = scanner.nextLine();
                        check1 = false;
                    } else {
                        System.out.println("Tên phải đúng định dạng, vui lòng nhập lại");
                        check1 = false;
                    }
                } while (check1);
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
                boolean check3;
                System.out.println("Số CMND/CCCD");
                String idNumber1 = null;
                do {
                    if (Regex.checkIdCard(idNumber1)) {
                        idNumber1 = scanner.nextLine();
                        check3 = false;
                    } else {
                        check3 = true;
                        System.out.println("Chưa đúng định dạng, vui lòng nhập lại");
                    }
                } while (check3);
                int idNumber = Integer.parseInt(idNumber1);
                boolean check4;
                System.out.println("Số điện thoại");
                int numberPhone = 0;
                do {
                    if (Regex.checkNumberPhone(String.valueOf(numberPhone))) {
                        numberPhone = Integer.parseInt(scanner.nextLine());
                        check4 = false;
                    } else {
                        System.out.println("Chưa đúng định dạng, vui lòng nhập lại");
                        check4 = true;
                    }
                } while (check4);
                System.out.println("Email");
                String email = scanner.nextLine();
                System.out.println("Chọn loại khách hàng");
                boolean flag1 = true;
                String typeOfGuest = "";
                do {
                    System.out.print(
                            "1. Diamond\n" +
                                    "2. Platinium\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            typeOfGuest = "Diamond";
                            flag1 = false;
                            break;
                        case "2":
                            typeOfGuest = "Platinium";
                            flag1 = false;
                            break;
                        case "3":
                            typeOfGuest = "Gold";
                            flag1 = false;
                            break;
                        case "4":
                            typeOfGuest = "Silver";
                            flag1 = false;
                            break;
                        case "5":
                            typeOfGuest = "Member";
                            flag1 = false;
                            break;
                        default:
                            System.out.println("Không có loại khách hàng này, mời chọn đúng");
                            flag1 = true;
                    }
                } while (flag1);
                System.out.println("Address");
                String address = scanner.nextLine();
                Customer customer = new Customer(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
                customerRepository.edit(customer, i);
                System.out.println("Sửa thành công");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Khách hàng không tồn tại");
        }
    }
}
