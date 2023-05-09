package case_study.service.class_service;

import case_study.model.person.EmployeeModel;
import case_study.repository.class_repository.EmployeeRepository;
import case_study.service.interface_service.IService;
import case_study.until.file.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IService {
    Scanner scanner = new Scanner(System.in);
    EmployeeRepository employeeRepository = new EmployeeRepository();
    static List<EmployeeModel> employeeModelList = new ArrayList<>();

    public void read() {
        employeeModelList = employeeRepository.getEmployee();
    }

    @Override
    public void add() {
        read();
        System.out.print("Enter the new employee's code (NV-XXXX): ");
        String code;
        boolean check;
        do {
            do {
                code = scanner.nextLine();
            } while (!Regex.checkCodeEmployee(code));
            check = false;
            for (EmployeeModel employeeModel : employeeModelList) {
                if (code.equals(employeeModel.getCode())) {
                    System.out.print("Code already exists, please re-enter: ");
                    check = true;
                }
                break;
            }
        } while (check);
        System.out.print("Enter the new employee's name: ");
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
        boolean check2;
        System.out.print("Enter day of birth (dd-MM-yyyy):  ");
        String dayOfBirth;
        do {
            dayOfBirth = scanner.nextLine();
            if (Regex.checkDay(dayOfBirth)) {
                if (Regex.checkUnderAge(dayOfBirth)) {
                    check2 = false;
                    System.out.println("Ok! Over 18 years old ");
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
        String numPhone;
        boolean check5;
        do {
            numPhone = scanner.nextLine();
            if (Regex.checkNumberPhone(numPhone)) {
                check5 = false;
            } else {
                System.out.print("Incorrect format, please re- enter:  ");
                check5 = true;
            }

        } while (check5);
        System.out.print("Enter the Email: ");
        String email = scanner.nextLine();
        System.out.println("Choice the Level: ");
        boolean check6;
        String level = "";
        do {
            System.out.print("1. Intermediate\n" +
                    "2. Higher\n" +
                    "3. University\n" +
                    "4. After University: ");
            String choice1 = scanner.nextLine();
            switch (choice1) {
                case "1":
                    level = "Intermediate";
                    check6 = false;
                    break;
                case "2":
                    level = "Higher";
                    check6 = false;
                    break;
                case "3":
                    level = "University";
                    check6 = false;
                    break;
                case "4":
                    level = "After University";
                    check6 = false;
                    break;
                default:
                    System.out.print("It is not available, please select again: ");
                    check6 = true;
            }
        } while (check6);
        System.out.println("Choose the place of work: ");
        boolean check7;
        String position = "";
        do {
            System.out.print("1. Receptionist\n" +
                    "2. Serve\n" +
                    "3. Expert\n" +
                    "4. Monitor\n" +
                    "5. Manage\n" +
                    "6. Director: ");
            String choice2 = scanner.nextLine();
            switch (choice2) {
                case "1":
                    position = "Receptionist";
                    check7 = false;
                    break;
                case "2":
                    position = "Serve";
                    check7 = false;
                    break;
                case "3":
                    position = "Expert";
                    check7 = false;
                    break;
                case "4":
                    position = "Monitor";
                    check7 = false;
                    break;
                case "5":
                    position = "Manage";
                    check7 = false;
                    break;
                case "6":
                    position = "Director";
                    check7 = false;
                    break;
                default:
                    System.out.println("It is not available, please select again: ");
                    check7 = true;
            }
        } while (check7);
        double salary;
        do {
            System.out.print("Basic salary ");
            salary = scanner.nextDouble();
        } while (salary < 0);
        EmployeeModel employeeModel = new EmployeeModel(code, name, dayOfBirth, gender, idNumber, numPhone, email, level, position, salary);
        employeeModelList.add(employeeModel);
        employeeRepository.add(employeeModel);
        System.out.print("Successfully added ");
    }

    @Override
    public void display() {
        read();
        for (EmployeeModel e : employeeModelList) {
            System.out.println(e);
        }
    }

    @Override
    public void edit() {
        read();
        display();
        System.out.print("Enter the Employee ID to update: ");
        String editNameEmployee = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < employeeModelList.size(); i++) {
            if (editNameEmployee.equals(employeeModelList.get(i).getName())) {
                System.out.println("Employee information found \n " + employeeModelList.get(i));
                System.out.print("Insert a new employee code: ");
                boolean check;
                String code;
                do {
                    code = scanner.nextLine();
                    if (Regex.checkCodeEmployee(code)) {
                        check = false;
                    } else {
                        System.out.print("This format is incorrect, please re-enter:  ");
                        check = true;
                    }
                    for (EmployeeModel employeeModel : employeeModelList) {
                        if (employeeModel.getCode().equals(code)) {
                            System.out.print("The code already exists, just re-entered: ");
                            check = true;
                        }
                        break;
                    }
                } while (check);
                System.out.print("Enter the new employee's name: ");
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
                        if (Regex.checkUnderAge(dayBirth)) {
                            check2 = false;
                            System.out.println("Ok! Over 18 years old  ");

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
                System.out.println("Choice the Level: ");
                boolean check6;
                String level = "";
                do {
                    System.out.print("1. Intermediate\n" +
                            "2. Higher\n" +
                            "3. University\n" +
                            "4. After University: ");
                    String choice1 = scanner.nextLine();
                    switch (choice1) {
                        case "1":
                            level = "Intermediate";
                            check6 = false;
                            break;
                        case "2":
                            level = "Higher";
                            check6 = false;
                            break;
                        case "3":
                            level = "University";
                            check6 = false;
                            break;
                        case "4":
                            level = "After University";
                            check6 = false;
                            break;
                        default:
                            System.out.print("It is not available, please select again: ");
                            check6 = true;
                    }
                } while (check6);
                System.out.println("Choose the place of work: ");
                boolean check7;
                String position = "";
                do {
                    System.out.print("1. Receptionist\n" +
                            "2. Serve\n" +
                            "3. Expert\n" +
                            "4. Monitor\n" +
                            "5. Manage\n" +
                            "6. Director: ");
                    String choice2 = scanner.nextLine();
                    switch (choice2) {
                        case "1":
                            position = "Receptionist";
                            check7 = false;
                            break;
                        case "2":
                            position = "Serve";
                            check7 = false;
                            break;
                        case "3":
                            position = "Expert";
                            check7 = false;
                            break;
                        case "4":
                            position = "Monitor";
                            check7 = false;
                            break;
                        case "5":
                            position = "Manage";
                            check7 = false;
                            break;
                        case "6":
                            position = "Director";
                            check7 = false;
                            break;
                        default:
                            System.out.println("It is not available, please select again: ");
                            check7 = true;
                    }
                } while (check7);
                double salary;
                do {
                    System.out.print("Basic salary: ");
                    salary = scanner.nextDouble();
                } while (salary < 0);
                EmployeeModel employeeModel = new EmployeeModel(code, name, dayBirth, gender, idNumber, numberPhone, email,
                        level, position, salary);
                employeeRepository.edit(employeeModel, i);
                System.out.println("Successful fix ");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Employee code does not exist! ");
        }
    }
}
