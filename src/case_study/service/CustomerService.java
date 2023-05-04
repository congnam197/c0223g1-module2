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
        System.out.print("Enter the new customer's code (KH-XXXX):  ");
        boolean check;
        String code;
        do {
            code = scanner.nextLine();
            if (Regex.checkCodeCustomer(code)) {
                System.out.print("The format of the code needs to be correct, please re-enter: ");
                check = true;
            } else {
                check = false;
            }
            for (CustomerModel customerModel : customerModelList) {
                if (code.equals(customerModel.getCode())) {
                    System.out.print("Code already exists, please re-enter:  ");
                    check = true;
                }
            }
        } while (check);
        System.out.print("Enter the new customer's name:  ");
        String name;
        boolean check1;
        do {
            name = scanner.nextLine();
            if (Regex.checkNamePerson(name)) {

                check1 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
                check1 = true;
            }
        } while (check1);
        System.out.print("Enter day of birth (dd-MM-yyyy):  ");
        String dayBirth;
        boolean check2;
        do {
            dayBirth = scanner.nextLine();
            if (Regex.checkDay(dayBirth)) {
                System.out.println(Regex.checkUnderAge(dayBirth));
                if (Regex.checkUnderAge(dayBirth)) {
                    System.out.println("Ok! Over 18 years old ");
                    check2 = false;
                } else {
                    System.out.print("Under 18 years old, please confirm again: ");
                    check2 = true;
                }
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
                check2 = true;
            }
        } while (check2);
        System.out.print("Choice gender " +
                "1.Male " +
                "2.FeMale ");
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
                System.out.print("Wrong choice, please choose again:  ");
                check3 = true;
            }
        } while (check3);
        boolean check4;
        System.out.print("Enter the Identity card number: ");
        String idNumber;
        do {
            idNumber = scanner.nextLine();
            if (Regex.checkIdCard(idNumber)) {
                check4 = false;
            } else {
                check4 = true;
                System.out.print("Incorrect format, please re- enter:  ");
            }
        } while (check4);
        System.out.print("Enter the number phone: ");
        String numberPhone;
        boolean check5;
        do {
            numberPhone = scanner.nextLine();
            if (Regex.checkNumberPhone(numberPhone)) {
                check5 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
                check5 = true;
            }

        } while (check5);
        System.out.print("Enter the Email: ");
        String email = scanner.nextLine();
        System.out.println("Choose one type of customer: ");
        boolean check6;
        String typeOfGuest = "";
        do {
            System.out.print(
                    "1. Diamond\n" +
                            "2. Platinium\n" +
                            "3. Gold\n" +
                            "4. Silver\n" +
                            "5. Member: ");
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
                    System.out.print("It is not available, please select again:  ");
                    check6 = true;
            }
        } while (check6);
        System.out.print("Enter the customer's Address: ");
        String address = scanner.nextLine();
        CustomerModel customerModel = new CustomerModel(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
        customerRepository.add(customerModel);
        System.out.println("Successfully added!");
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
        display();
        System.out.print("Enter the Customer ID to update: ");
        String editNameCustomer = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerModelList.size(); i++) {
            if (customerModelList.get(i).getName().equals(editNameCustomer)) {
                System.out.println("Employee information found \n" + customerModelList.get(i));
                boolean check;
                String code = null;
                do {
                    if (Regex.checkCodeCustomer(code)) {
                        System.out.print("This format is incorrect, please re-enter:  ");
                        check = true;
                    } else {
                        code = scanner.nextLine();
                        check = false;
                    }
                    for (CustomerModel customerModel : customerModelList) {
                        if (code.equals(customerModel.getCode())) {
                            System.out.print("The code already exists, just re-entered: ");
                            check = true;
                        }
                    }
                } while (check);
                System.out.print("Enter the new customer's name:  ");
                String name;
                boolean check1;
                do {
                    name = scanner.nextLine();
                    if (Regex.checkNamePerson(name)) {
                        check1 = false;
                    } else {
                        System.out.print("Incorrect format, please re- enter:  ");
                        check1 = true;
                    }
                } while (check1);
                System.out.print("Enter day of birth (dd-MM-yyyy):  ");
                String dayBirth;
                boolean check2;
                do {
                    dayBirth = scanner.nextLine();
                    if (Regex.checkDay(dayBirth)) {
                        System.out.println(Regex.checkUnderAge(dayBirth));
                        if (Regex.checkUnderAge(dayBirth)) {
                            System.out.println("Ok! Over 18 years old ");
                            check2 = false;
                        } else {
                            System.out.print("Under 18 years old, please confirm again: ");
                            check2 = true;
                        }
                    } else {
                        System.out.print("Incorrect format, please re- enter:  ");
                        check2 = true;
                    }
                } while (check2);
                System.out.print("Choice gender " +
                        "1.Male " +
                        "2.FeMale ");
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
                        System.out.print("Wrong choice, please choose again:  ");
                        check3 = true;
                    }
                } while (check3);
                boolean check4;
                System.out.print("Enter the Identity card number: ");
                String idNumber;
                do {
                    idNumber = scanner.nextLine();
                    if (Regex.checkIdCard(idNumber)) {
                        check4 = false;
                    } else {
                        check4 = true;
                        System.out.print("Incorrect format, please re- enter:  ");
                    }
                } while (check4);
                System.out.print("Enter the number phone: ");
                String numberPhone;
                boolean check5;
                do {
                    numberPhone = scanner.nextLine();
                    if (Regex.checkNumberPhone(numberPhone)) {
                        check5 = false;
                    } else {
                        System.out.print("Incorrect format, please re- enter:  ");
                        check5 = true;
                    }

                } while (check5);
                System.out.print("Enter the Email: ");
                String email = scanner.nextLine();
                System.out.println("Choose one type of customer: ");
                boolean check6;
                String typeOfGuest = "";
                do {
                    System.out.print(
                            "1. Diamond\n" +
                                    "2. Platinium\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member: ");
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
                                System.out.print("It is not available, please select again:  ");
                            check6 = true;
                    }
                } while (check6);
                System.out.print("Enter the customer's Address: ");
                String address = scanner.nextLine();
                CustomerModel customerModel = new CustomerModel(code, name, dayBirth, gender, idNumber, numberPhone, email, typeOfGuest, address);
                customerRepository.edit(customerModel, i);
                System.out.println("Edit successfully");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Customer does not exist!");
        }
    }
}
