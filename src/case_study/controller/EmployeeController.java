package case_study.controller;

import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    EmployeeService employeeService =new EmployeeService();
    Scanner sc=new Scanner(System.in);
    public void employeeManagement() {
        System.out.println("-----Employee Management-----");
        boolean flag = true;
        do {
            System.out.println("Choose a function to continue: ");
            System.out.println("Enter an option :\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4 .Return main menu");
            String choice2 = sc.nextLine();
            switch (choice2) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.print("It is not available, please select again:  ");
            }
        } while (flag);
    }
}
