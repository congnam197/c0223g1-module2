package case_study.service;

import case_study.model.CustomerModel;
import case_study.repository.CustomerRepository;
import case_study.until.file.regex.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements IService {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    static List<CustomerModel> customerModelList = new LinkedList<>();

    public void read() {
        customerModelList = customerRepository.getCustomer();
    }

    public List<CustomerModel> returnList() {
        read();
        return customerModelList;
    }

    @Override
    public void add() {
        System.out.print("Nhập mã khách hàng KH-XXXX ");
        boolean check;
        String code ;
        do {
            code = scanner.nextLine();
            if (Regex.checkCodeCustomer(code)) {
                System.out.print("Mã phải đúng định dạng, vui lòng nhập lại ");
                check = true;
            } else {
                check = false;
            }
            for (CustomerModel customerModel : customerModelList) {
                if (code.equals(customerModel.getCode())) {
                    System.out.print("mã đã tồn tại, mới nhập lại ");
                    check = true;
                }
            }
        } while (check);
        boolean check1;
        System.out.print("Nhập tên khách hàng ");
        String name;
        do {
            name = scanner.nextLine();
            if (Regex.checkNamePerson(name)) {

                check1 = false;
            } else {
                System.out.print("Tên phải đúng định dạng, vui lòng nhập lại ");
                check1 = true;
            }
        } while (check1);
        System.out.print("Nhập ngày sinh (dd-MM-yyy) ");
        String dayBirth;
        boolean check2;
        do {
            dayBirth = scanner.nextLine();
            if (Regex.checkAge(dayBirth)) {
                System.out.println(Regex.checkUnderAge(dayBirth));
                if (Regex.checkUnderAge(dayBirth)) {
                    System.out.println("Đã trên 18 tuổi");
                    check2 = false;
                } else {
                    System.out.print("Chưa đủ 18 tuổi ,Vui Lòng Xác Nhận  lại ");
                    check2 = true;
                }
            } else {
                System.out.print("Không đúng định dạng, hãy nhập lại ");
                check2 = true;
            }
        } while (check2);
        System.out.print("Giới tính \n" +
                "1.Nam\n" +
                "2.Nữ ");
        boolean check3;
        boolean gender = false;
        do {
            String checkGender = scanner.nextLine();
            if (checkGender.equals("1")) {
                gender = true;
                check3 = false;
            } else if (checkGender.equals("2")) {
                gender = false;
                check3 = false;
            } else {
                System.out.print("lựa chọn sai, mời chọn lại ");
                check3 = true;
            }
        } while (check3);
        System.out.print("Số CMND/CCCD ");
        boolean check4;
        String idNumber;
        do {
            idNumber = scanner.nextLine();
            if (Regex.checkIdCard(idNumber)) {
                check4 = false;
            } else {
                check4 = true;
                System.out.println("Chưa đúng định dạng, vui lòng nhập lại");
            }
        } while (check4);

        boolean check5;
        System.out.print("Số điện thoại ");
        String numberPhone;
        do {
            numberPhone = scanner.nextLine();
            if (Regex.checkNumberPhone(numberPhone)) {
                check5 = false;
            } else {
                System.out.print("Chưa đúng định dạng, vui lòng nhập lại ");
                check5 = true;
            }
        } while (check5);
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
                            "5. Member ");
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
                    System.out.print("Không có loại khách hàng này, mời chọn đúng ");
                    flag = true;
            }
        } while (flag);
        System.out.print("Address ");
        String address = scanner.nextLine();
        CustomerModel customerModel = new CustomerModel(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
        customerRepository.add(customerModel);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display() {
        read();
        for (CustomerModel cs : customerModelList) {
            System.out.println(cs);
        }
    }

    @Override
    public void edit() {
        System.out.print("Nhập mã khách hàng muốn sửa ");
        String editCode = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerModelList.size(); i++) {
            if (customerModelList.get(i).getCode().equals(editCode)) {
                System.out.println("Thông tin  khách hàng  +\n" + customerModelList.get(i));
                boolean check;
                String code = null;
                do {
                    if (Regex.checkCodeCustomer(code)) {
                        System.out.print("Mã phải đúng định dạng, vui lòng nhập lại ");
                        check = true;
                    } else {
                        code = scanner.nextLine();
                        check = false;
                    }
                    for (int j = 0; j < customerModelList.size(); j++) {
                        if (code == customerModelList.get(j).getCode()) {
                            System.out.print("mã đã tồn tại, mới nhập lại ");
                            check = true;
                        }
                    }
                } while (check);
                boolean check1;
                System.out.print("Nhập tên khách hàng ");
                String name = null;
                do {
                    if (Regex.checkNamePerson(name)) {
                        name = scanner.nextLine();
                        check1 = false;
                    } else {
                        System.out.print("Tên phải đúng định dạng, vui lòng nhập lại ");
                        check1 = false;
                    }
                } while (check1);
                boolean check2;
                System.out.print("Nhập ngày sinh (dd-MM-yyyy) ");
                String dayBirth;
                do {
                    dayBirth = scanner.nextLine();
                    if (Regex.checkAge(dayBirth)) {
                        if (Regex.checkUnderAge(dayBirth)) {
                            check2 = false;
                            System.out.println("Đã trên 18 tuổi");
                        } else {
                            System.out.print("Chưa đủ 18 tuổi ,Vui Lòng Xác Nhận  lại ");
                            check2 = true;
                        }
                    } else {
                        System.out.print("Không đúng định dạng, hãy nhập lại ");
                        check2 = true;
                    }
                } while (check2);
                System.out.print("Giới tính \n" +
                        "1.Nam\n" +
                        "2.Nữ ");
                boolean check3;
                boolean gender = false;
                do {
                    String checkGender = scanner.nextLine();
                    if (checkGender.equals("1")) {
                        gender = true;
                        check3 = false;
                    } else if (checkGender.equals("2")) {
                        gender = false;
                        check3 = false;
                    } else {
                        System.out.print("lựa chọn sai, mời chọn lại ");
                        check3 = true;
                    }
                } while (check3);
                boolean check4;
                System.out.print("Số CMND/CCCD ");
                String idNumber;
                do {
                    idNumber = scanner.nextLine();
                    if (Regex.checkIdCard(idNumber)) {
                        check4 = false;
                    } else {
                        check4 = true;
                        System.out.print("Chưa đúng định dạng, vui lòng nhập lại" );
                    }
                } while (check4);
                boolean check5;
                System.out.print("Số điện thoại ");
                String numberPhone;
                do {
                    numberPhone = scanner.nextLine();
                    if (Regex.checkNumberPhone(numberPhone)) {
                        check5 = false;
                    } else {
                        System.out.print("Chưa đúng định dạng, vui lòng nhập lại ");
                        check5 = true;
                    }
                } while (check5);
                System.out.print("Email ");
                String email = scanner.nextLine();
                System.out.println("Chọn loại khách hàng ");
                boolean check6;
                String typeOfGuest = "";
                do {
                    System.out.print(
                            "1. Diamond\n" +
                                    "2. Platinium\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member ");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            typeOfGuest = "Diamond";
                            check6 = false;
                            break;
                        case "2":
                            typeOfGuest = "Platinium";
                            check6 = false;
                            break;
                        case "3":
                            typeOfGuest = "Gold";
                            check6 = false;
                            break;
                        case "4":
                            typeOfGuest = "Silver";
                            check6 = false;
                            break;
                        case "5":
                            typeOfGuest = "Member";
                            check6 = false;
                            break;
                        default:
                            System.out.println("Không có loại khách hàng này, mời chọn đúng");
                            check6 = true;
                    }
                } while (check6);
                System.out.print("Address ");
                String address = scanner.nextLine();
                CustomerModel customerModel = new CustomerModel(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
                customerRepository.edit(customerModel, i);
                System.out.println("Sửa thành công");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Khách hàng không tồn tại");
        }
    }
}
