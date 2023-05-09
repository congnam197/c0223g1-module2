package case_study.controller;

import case_study.service.class_service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner sc = new Scanner(System.in);
    CustomerService customerService=new CustomerService();
    public void customerManagement() {
        System.out.println("-----Customer Management-----");
        boolean flag = true;
        do {
            System.out.println("Choose a function to continue: ");
            System.out.print("Enter an option :\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            String choice3 = sc.nextLine();
            switch (choice3) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
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
